package pattern.create.builder.demo1.builder;

import pattern.create.builder.demo1.Bike;

// 抽象建造者
public abstract class Builder {

    //声明Bike类型的变量，并进行赋值 空内容
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    //构建自行车的方法
    public abstract Bike createBike();
}
