package cn.edu.zjut.weining.toutiao.spider.toutiao;

import java.util.LinkedList;
import java.util.List;

public class ToutiaoC2Entity {
    private String c2ID;
    private List<ToutiaoC2Json> c2JsonList = new LinkedList<>();

    public String getC2ID() {
        return c2ID;
    }

    public void setC2ID(String c2ID) {
        this.c2ID = c2ID;
    }

    public List<ToutiaoC2Json> getC2JsonList() {
        return c2JsonList;
    }

    public void setC2JsonList(List<ToutiaoC2Json> c2JsonList) {
        this.c2JsonList = c2JsonList;
    }

    public void addC2JsonList(ToutiaoC2Json c2Json) {
        this.c2JsonList.add(c2Json);
    }
}
