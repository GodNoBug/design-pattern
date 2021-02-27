package pattern.structural.proxy.jdk_proxy;

// 火车站类 真实主题类
public class TrainStation implements SellTickets {


    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
