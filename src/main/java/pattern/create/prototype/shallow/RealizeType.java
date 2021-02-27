package pattern.create.prototype.shallow;

//  具体的原型类
//  Java中的Object类中提供了 `clone()` 方法来实现浅克隆。 Cloneable 接口是上面的类图中的抽象原型类，
//  而实现了Cloneable接口的子实现类就是具体的原型类。代码如下：
public class RealizeType implements Cloneable {

    public RealizeType() {
        System.out.println("具体的原型对象创建完成！");
    }
    // 深 浅
    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (RealizeType) super.clone();
    }
}
