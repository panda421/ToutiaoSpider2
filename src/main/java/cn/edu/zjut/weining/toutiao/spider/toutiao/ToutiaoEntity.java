package cn.edu.zjut.weining.toutiao.spider.toutiao;

import java.util.LinkedList;
import java.util.List;

public class ToutiaoEntity {

    private String groupID;
    private long time;
    private ToutiaoInfoJson infoJson;
    private List<ToutiaoC1Json> c1JsonList = new LinkedList<>();
    private List<ToutiaoC2Entity> c2EntityList = new LinkedList<>();

    public ToutiaoEntity(){
        this.time = System.currentTimeMillis();
    }

    public ToutiaoInfoJson getInfoJson() {
        return infoJson;
    }

    public void setInfoJson(ToutiaoInfoJson infoJson) {
        this.infoJson = infoJson;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<ToutiaoC1Json> getC1JsonList() {
        return c1JsonList;
    }

    public void setC1JsonList(List<ToutiaoC1Json> c1JsonList) {
        this.c1JsonList = c1JsonList;
    }

    public List<ToutiaoC2Entity> getC2EntityList() {
        return c2EntityList;
    }

    public void setC2EntityList(List<ToutiaoC2Entity> c2EntityList) {
        this.c2EntityList = c2EntityList;
    }

    public void addC1JsonList(ToutiaoC1Json c1Json) {
        this.c1JsonList.add(c1Json);
    }

    public void addC2EntityList(ToutiaoC2Entity c2Entity) {
        this.c2EntityList.add(c2Entity);
    }
}
