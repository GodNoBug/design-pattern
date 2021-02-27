package pattern.create.singleton.trouble.trouble.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        //往文件中写对象
        //writeObject2File();
        //从文件中读取对象
        Singleton s1 = readObjectFromFile();
        Singleton s2 = readObjectFromFile();

        //判断两个反序列化后的对象是否是同一个对象
        System.out.println(s1 == s2);
        //
    }

    private static Singleton readObjectFromFile() throws Exception {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Think\\Desktop\\a.txt"));
        //第一个读取Singleton对象
        Singleton instance = (Singleton) ois.readObject();

        return instance;
    }

    public static void writeObject2File() throws Exception {
        //获取Singleton类的对象
        Singleton instance = Singleton.getInstance();
        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Think\\Desktop\\a.txt"));
        //将instance对象写出到文件中
        oos.writeObject(instance);
    }
}