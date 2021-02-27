package pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // 创建聚合对象
        StudentAggregateImpl aggregate = new StudentAggregateImpl();
        aggregate.addStudent(new Student("张三", "001"));
        aggregate.addStudent(new Student("李四", "002"));
        aggregate.addStudent(new Student("王五", "003"));
        aggregate.addStudent(new Student("赵六", "004"));

        // 遍历聚合对象
        // 获取迭代器对象
        StudentIterator iterator = aggregate.getStudentIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 源码
        // List抽象聚合类
        // ArrayLis具体的聚合类
        // Iterator抽象迭代器
        List<String> list = new ArrayList<>();
        Iterator<String> iterator2 = list.iterator(); //list.iterator()方法返回的肯定是Iterator接口的子实现类对象
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
