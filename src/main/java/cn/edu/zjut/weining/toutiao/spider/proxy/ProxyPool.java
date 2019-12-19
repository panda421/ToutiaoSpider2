package cn.edu.zjut.weining.toutiao.spider.proxy;

import java.io.IOException;
import java.net.*;
import java.util.Map;
import java.util.concurrent.*;

public class ProxyPool {
    private BlockingQueue<HttpProxy> idleQueue = new DelayQueue<HttpProxy>(); // 存储空闲的Proxy
    private Map<String, HttpProxy> totalQueue = new ConcurrentHashMap<String, HttpProxy>();

    private class HttpProxy implements Delayed {
        @Override
        public long getDelay(TimeUnit unit) {
            return 0;
        }

        @Override
        public int compareTo(Delayed o) {
            return 0;
        }
    }


//    private boolean isValid(IPBean ipBean) {
//        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ipBean.getIp(), ipBean.getPort()));
//        try {
//            URLConnection httpCon = new URL("https://www.baidu.com/").openConnection(proxy);
//            httpCon.setConnectTimeout(5000);
//            httpCon.setReadTimeout(5000);
//            int code = ((HttpURLConnection) httpCon).getResponseCode();
//            System.out.println(code);
//            return code == 200;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}
