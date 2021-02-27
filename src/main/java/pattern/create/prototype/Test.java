package pattern.create.prototype;

public class Test implements Cloneable{
    public void test() throws CloneNotSupportedException {
        Object clone = this.clone();
        System.out.println(clone.getClass());
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Test test=new Test();
        test.test();
    }
}
