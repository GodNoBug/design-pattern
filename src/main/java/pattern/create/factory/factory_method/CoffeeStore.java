package pattern.create.factory.factory_method;


import pattern.create.factory.factory_method.coffee.Coffee;
import pattern.create.factory.factory_method.factory.CoffeeFactory;

// 使用者
public class CoffeeStore {

    // 工厂方法模式 意义是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中。
    // 要新增产品类时也需要增加工厂类,不需要修改原有工厂类代码了,这条就解决了简单工厂模式的缺点
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    //点咖啡功能
    public Coffee orderCoffee() {

        Coffee coffee = factory.createCoffee();
        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
