package pattern.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        // 春节来了,使用春节促销活动
        SalesMan salesMan=new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("=========================");
        // 中秋节来了,使用中秋节的促销活动
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();
        System.out.println("=========================");
        // 圣诞节来了,使用圣诞节的促销活动
        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();

    }
}
