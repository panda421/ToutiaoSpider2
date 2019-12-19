package cn.edu.zjut.weining.toutiao.spider;

import cn.edu.zjut.weining.toutiao.spider.net.Net;
import cn.edu.zjut.weining.toutiao.spider.net.ToutiaoAPI;
import cn.edu.zjut.weining.toutiao.spider.toutiao.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class Collector {

    public static ToutiaoEntity getToutiaoEntity(String groupID) {

        ToutiaoEntity toutiaoEntity = new ToutiaoEntity();
        toutiaoEntity.setGroupID(groupID);
        int page = 0;

        try {

            //新闻信息
            String infoUrl = ToutiaoAPI.TT_INFO_HEAD
                    +groupID
                    +ToutiaoAPI.TT_INFO_LAST;
            String info = Net.okHttpConnect(infoUrl,0);
            ToutiaoInfoJson infoJson = JSON.parseObject(info,
                    new TypeReference<ToutiaoInfoJson>(){});
            toutiaoEntity.setInfoJson(infoJson);

            //一级评论
            int c1offset = 0;
            boolean c1hasmore = true;
            while (c1hasmore) {
                page++;
                String c1url = ToutiaoAPI.TT_C1API_MAIN
                        +ToutiaoAPI.TT_GROUPID
                        +groupID
                        +ToutiaoAPI.TT_OFFSET
                        +c1offset
                        +ToutiaoAPI.TT_COUNT
                        +ToutiaoAPI.TT_DEFAULT_COUNT;
                String response = getResponse(c1url);
                ToutiaoC1Json c1Json = JSON.parseObject(response,
                        new TypeReference<ToutiaoC1Json>(){});

                c1hasmore = c1Json.isHas_more();
                c1offset+=50;

                toutiaoEntity.addC1JsonList(c1Json);
                if (page%10==0) {
                    Util.sleep(10);
                }
//            System.out.println(c1url);
            }

            //二级评论
            for (ToutiaoC1Json c1Json : toutiaoEntity.getC1JsonList()) {

                for (ToutiaoC1Json.DataEntity dataEntity : c1Json.getData()) {
                    String commentID = dataEntity.getComment().getId_str();
                    ToutiaoC2Entity c2Entity = new ToutiaoC2Entity();
                    c2Entity.setC2ID(commentID);
                    if (dataEntity.getComment().getReply_count()!=0) {
                        int c2offset = 0;
                        boolean c2Hasmore = true;
                        while (c2Hasmore) {
                            page++;
                            String c2url = ToutiaoAPI.TT_C2API_MAIN
                                    +ToutiaoAPI.TT_ID
                                    +commentID
                                    +ToutiaoAPI.TT_OFFSET
                                    +c2offset
                                    +ToutiaoAPI.TT_COUNT
                                    +ToutiaoAPI.TT_DEFAULT_COUNT;
                            String response = getResponse(c2url);
                            JSONObject dataObj = JSONObject.parseObject(response);
                            String data = dataObj.getString("data");
                            ToutiaoC2Json c2Json = JSON.parseObject(data,
                                    new TypeReference<ToutiaoC2Json>(){});
                            c2Hasmore = c2Json.isHas_more();
                            c2offset+=50;

                            c2Entity.addC2JsonList(c2Json);
                            if (page%10==0) {
                                Util.sleep(10);
                            }
//                        System.out.println(c2url);
                        }
                    }
                    toutiaoEntity.addC2EntityList(c2Entity);
                }
            }

        } catch (JSONException e) {
            System.out.println(e);
            Util.sleep(60*15);
            getToutiaoEntity(groupID);
        }

        return toutiaoEntity;
    }

    private static String getResponse(String c2url) {
        String response = null;
        int count = 1;
        do {
            Util.sleep(count++);
            if (count>10) {
                Util.sleep(60);
                count=1;
            }
            response = Net.okHttpConnect(c2url,0);
        } while ( response == null || response.equals(""));
        return response;
    }
}
