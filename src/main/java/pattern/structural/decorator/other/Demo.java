package pattern.structural.decorator.other;

import java.io.BufferedWriter;
import java.io.FileWriter;

// IO流中的包装类使用到了装饰者模式。
//  BufferedInputStream，BufferedOutputStream，BufferedReader，BufferedWriter。
// 我们以BufferedWriter举例来说明，先看看如何使用BufferedWriter
public class Demo {
    public static void main(String[] args) throws Exception{
        //创建BufferedWriter对象
        //创建FileWriter对象
        FileWriter fw = new FileWriter("C:\\Users\\Think\\Desktop\\a.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        //写数据
        bw.write("hello Buffered");

        bw.close();
    }
}