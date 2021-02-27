package pattern.structural.proxy.static_proxy;

// 代售点 代理类
public class ProxyPoint implements SellTickets{
    // 声明火车站类对象
    private TrainStation trainStation=new TrainStation();
    @Override
    public void sell() {
        // 可以对参数进行增强,在接口加入参数规范
        System.out.println("代售点收取中介费");
        trainStation.sell();
        System.out.println("");
    }
}
