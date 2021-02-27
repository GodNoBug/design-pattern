package pattern.structural.decorator.decorator;

// 抽象构建角色 店内所提供的食物都必须继承此类
public abstract class FastFood {
    private float price; // 价格
    private String desc; // 描述


    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    // 抽象方法
    public abstract float cost();
}
