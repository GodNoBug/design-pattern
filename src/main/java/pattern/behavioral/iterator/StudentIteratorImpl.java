package pattern.behavioral.iterator;

import pattern.behavioral.state.before.Lift;

import java.util.List;

// 具体迭代器
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    private int position = 0; // 用来记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        // 从集合中获取指定位置的元素
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
