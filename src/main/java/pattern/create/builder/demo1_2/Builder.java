package pattern.create.builder.demo1_2;

// 抽象构建类  优化后的代码也不是太符合单一职责原则
public abstract class Builder {
    // 声明Bike类型的变量,并进行赋值
    protected Bike bike=new Bike();  // 相当于空机箱


    public abstract void buildFrame(); // 构建车架

    public abstract void buildSeat(); // 构建车座

    public abstract Bike createBike(); // 构建自行车的方法

    // demo1 实例是 Builder模式的常规用法，指挥者类 Director 在建造者模式中具有很重要的作用，
    // 它用于指导具体构建者如何构建产品，控制调用先后次序，并向调用者返回完整的产品类，
    // 但是有些情况下需要简化系统结构，可以把指挥者类和抽象建造者进行结合

    // 这样做确实简化了系统结构，但同时也加重了抽象建造者类的职责，也不是太符合单一职责原则，
    // 如果construct() 过于复杂，建议还是封装到 Director 中。

    // Build同时负责组件的构建和组装
    public Bike construct(){
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }


}
