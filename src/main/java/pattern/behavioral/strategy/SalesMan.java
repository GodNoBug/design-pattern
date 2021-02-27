package pattern.behavioral.strategy;

// 促销员(环境类)
public class SalesMan {
    //持有抽象策略角色的引用 聚合策略类对象
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //向客户展示促销活动
    public void salesManShow() {
        strategy.show();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}