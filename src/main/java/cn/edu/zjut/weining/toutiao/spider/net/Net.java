package cn.edu.zjut.weining.toutiao.spider.net;

import cn.edu.zjut.weining.toutiao.spider.Util;
import okhttp3.*;

import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

public class Net {

    public static void main(String[] args) {
//        okHttpConnect("http://is-hl.snssdk.com/article/v8/tab_comments/?group_id=6765807658248176136",1);
        for (int i = 0; i < 100; i++) {
            String s = okHttpIPAgentConnect("http://is-hl.snssdk.com/article/v8/tab_comments/?group_id=6765650673980670477",
                    1,
                    "117.69.200.37",
                    9999);
//        ToutiaoC1Json toutiaoC1Json = JSON.parseObject(s,new TypeReference<ToutiaoC1Json>(){});
            System.out.println(s.length());
        }

    }

    public static String okHttpConnect(String url, int type) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        //设置连接超时时间
        builder.connectTimeout(1, TimeUnit.MINUTES);
        return connect(url, type, builder);
    }

    public static String okHttpIPAgentConnect(String url, int type, String hostname, int port) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        //设置连接超时时间
        builder.connectTimeout(1, TimeUnit.MINUTES);
        //设置代理,需要替换
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(hostname, port));
        builder.proxy(proxy);
        return connect(url, type, builder);
    }

    private static String connect(String url, int type, OkHttpClient.Builder builder) {
        Util.sleep(2);
        OkHttpClient httpClient = builder.build();
        String host = "";
        switch (type) {
            case 0:
                host = "m.toutiao.com";
                break;
            case 1:
                host = "is-hl.snssdk.com";
                break;
            case 2:
                host = "lf-hl.snssdk.com";
                break;
            default:
                break;
        }
        Request request = new Request.Builder().url(url).get()
                .addHeader("User-Agent", UAReference.getUA())
//                .addHeader("Host",host)
//                .addHeader("Connection","keep-alive")
//                .addHeader("Cache-Control","max-age=0")
//                .addHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
//                .addHeader("Accept-Language","zh-CN,zh;q=0.9")
                .build();
        try (Response response = httpClient.newCall(request).execute()) {
            return response.body().string();
        } catch (SocketTimeoutException e){
            System.out.println(url);
            e.printStackTrace();
            Util.sleep(10);
            connect(url,type,builder);
        } catch (ConnectException e) {
            // TODO: 2019-12-06 change 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
