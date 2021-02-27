package pattern.structural.decorator.decorator;

// 炒面 具体构建角色
public class FriedNoodles extends FastFood {
    public FriedNoodles() {
        super(12, "炒面");
    }

    public float cost() {
        return getPrice();
    }
}
