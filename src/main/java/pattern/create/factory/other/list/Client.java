package pattern.create.factory.other.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对上面的代码大家应该很熟，使用迭代器遍历集合，获取集合中的元素。
 *   而单列集合获取迭代器的方法就使用到了工厂方法模式。我们看通过类图看看结构：
 *   另：
 *
 * ​	1,DateForamt类中的getInstance()方法使用的是工厂模式；
 * ​	2,Calendar类中的getInstance()方法使用的是工厂模式；
 */
public class Client {
    public static void main(String[] args) {
        // Collection接口是抽象工厂类
        // ArrayList是具体的工厂类
        // Iterator接口是抽象商品类
        // ArrayList类中的Iter内部类是具体的商品类。
        // 在具体的工厂类中iterator()方法创建具体的商品类的对象。
        List<String> list=new ArrayList<>();
        list.add("令狐冲");
        list.add("风清扬");
        list.add("任我行");
        //获取迭代器对象 获取到的是子实现类对象
        Iterator<String> it = list.iterator();
        //使用迭代器遍历
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);

        }
    }
}
