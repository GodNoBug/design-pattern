package pattern.behavioral.iterator;

// 抽象迭代器
public interface StudentIterator {
    // 判断是否还有元素
    boolean hasNext();
    // 获取下一个元素
    Student next();
}
