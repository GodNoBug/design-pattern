package pattern.behavioral.strategy;

//为春节准备的促销活动A
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
