package pattern.create.prototype.deep;

import java.io.*;

//测试类
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);

        // 创建对象输出流
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\a.text"));
        oos.writeObject(c1);
        oos.close();

        // 读取对象

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Lenovo\\Desktop\\a.text"));
        Citation c2 = (Citation) ois.readObject();
        ois.close();

        System.out.println(c1==c2);
        System.out.println(c1.getStu()==c2.getStu());
    }
}