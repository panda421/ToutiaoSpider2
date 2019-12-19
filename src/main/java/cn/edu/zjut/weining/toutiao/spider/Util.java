package cn.edu.zjut.weining.toutiao.spider;

import cn.edu.zjut.weining.toutiao.spider.toutiao.ToutiaoEntity;
import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

public class Util {
    public static void sleep(int second) {
        try {
            Thread.sleep(1000*(second)+635*(new Random().nextInt(2)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void saveData(ToutiaoEntity entity) {
        File dataTxtDir = new File("./data.txt");
        try {
            FileOutputStream outputStream = new FileOutputStream(dataTxtDir,true);
            OutputStreamWriter streamWriter = new OutputStreamWriter(outputStream);
            streamWriter.write(JSON.toJSONString(entity)+"\n");
            streamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
