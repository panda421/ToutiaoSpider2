package cn.edu.zjut.weining.toutiao.spider.proxy;

import java.util.List;

public class IPJson {

    /**
     * msg : 0
     * code : 0
     * data : [{"port":54280,"city":"浙江省湖州市","ip":"125.125.31.84","expire_time":"2019-12-05 16:21:55"},{"port":54228,"city":"湖北省武汉市","ip":"58.19.83.126","expire_time":"2019-12-05 16:11:26"},{"port":54221,"city":"江西省吉安市","ip":"182.101.202.4","expire_time":"2019-12-05 16:21:55"},{"port":54276,"city":"安徽省铜陵市","ip":"114.99.10.58","expire_time":"2019-12-05 16:21:55"},{"port":54284,"city":"山东省潍坊市","ip":"39.69.19.239","expire_time":"2019-12-05 16:21:55"},{"port":54281,"city":"浙江省金华市","ip":"123.156.176.152","expire_time":"2019-12-05 16:21:55"},{"port":54258,"city":"江苏省徐州市","ip":"180.104.253.206","expire_time":"2019-12-05 16:21:55"},{"port":54261,"city":"江苏省淮安市","ip":"114.238.9.80","expire_time":"2019-12-05 16:21:55"},{"port":54280,"city":"浙江省湖州市","ip":"125.125.26.4","expire_time":"2019-12-05 16:21:55"},{"port":54228,"city":"湖北省武汉市","ip":"58.19.83.183","expire_time":"2019-12-05 16:04:22"}]
     * success : true
     */
    private String msg;
    private int code;
    private List<DataEntity> data;
    private boolean success;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public class DataEntity {
        /**
         * port : 54280
         * city : 浙江省湖州市
         * ip : 125.125.31.84
         * expire_time : 2019-12-05 16:21:55
         */
        private int port;
        private String city;
        private String ip;
        private String expire_time;

        public void setPort(int port) {
            this.port = port;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public void setExpire_time(String expire_time) {
            this.expire_time = expire_time;
        }

        public int getPort() {
            return port;
        }

        public String getCity() {
            return city;
        }

        public String getIp() {
            return ip;
        }

        public String getExpire_time() {
            return expire_time;
        }
    }
}
