package cn.edu.zjut.weining.toutiao.spider;

import cn.edu.zjut.weining.toutiao.spider.toutiao.ToutiaoEntity;

import java.io.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws IOException {

        File keyTxtDir = new File("./groupID.txt");
        FileInputStream inputStream = new FileInputStream(keyTxtDir);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str = null;
        int count = 1;

        while ((str = bufferedReader.readLine()) != null) {
            Util.sleep(5);
            if (count%200==0) {
                Util.sleep(60*10);
            }
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(df.format(System.currentTimeMillis())+" No "+count+++"  id: "+str);

            ToutiaoEntity entity = Collector.getToutiaoEntity(str);
            try {
                System.out.println(entity.getC1JsonList().size()+" "+entity.getInfoJson().getData().getTitle()+"\n");
            } catch (NullPointerException e) {
                Util.sleep(60*10);
                entity = Collector.getToutiaoEntity(str);
            }
            Util.saveData(entity);

        }
    }
}
