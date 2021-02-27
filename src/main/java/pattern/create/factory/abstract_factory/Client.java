package pattern.create.factory.abstract_factory;

import pattern.create.factory.abstract_factory.coffee.Coffee;
import pattern.create.factory.abstract_factory.dessert.Dessert;
import pattern.create.factory.abstract_factory.factory.AmericanDessertFactory;

//
public class Client {
    public static void main(String[] args) {
        //创建的是意大利风味甜品工厂对象
        //ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();
        //获取拿铁咖啡和提拉米苏甜品
        // 如果要加同一个产品族的话，只需要再加一个对应的工厂类即可（一个工厂负责同一个产品族的不同产品,新增加的产品族就需要增加新的工厂类），不需要修改其他的类。
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
