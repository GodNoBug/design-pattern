package pattern.create.factory.simple_factory;


import pattern.create.factory.simple_factory.coffee.Coffee;

// 使用者
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        // 解除了和Coffee实现类的耦合,同时有产生了新的耦合,即CoffeeStore本类和SimpleCoffeeFactory工厂类的耦合
        // 还有工厂对象和商品对象的耦合
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
