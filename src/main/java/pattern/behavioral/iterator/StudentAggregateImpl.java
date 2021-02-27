package pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate {
    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list); // 可改
    }
}
