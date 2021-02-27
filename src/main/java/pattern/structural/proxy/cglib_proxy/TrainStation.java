package pattern.structural.proxy.cglib_proxy;

import pattern.structural.proxy.jdk_proxy.SellTickets;

// 火车站类 真实主题类
public class TrainStation {

    public void sell() {
        System.out.println("火车站卖票");
    }

    public void refund() { // 退费
        System.out.println("退费");
    }
}
