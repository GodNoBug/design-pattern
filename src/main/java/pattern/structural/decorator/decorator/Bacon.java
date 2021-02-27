package pattern.structural.decorator.decorator;

// 培根配料类 具体的装饰者角色
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood, 1, "培根");
    }

    public float cost() {
        // 计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
