package pattern.behavioral.strategy;

//为圣诞准备的促销活动C
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
