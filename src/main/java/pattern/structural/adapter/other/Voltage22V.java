package pattern.structural.adapter.other;

// 电压220V 220V手机不能直接使用,所以写了一个接口是可以输出5V的电压供使用者使用,Voltage22V是被适配的
public class Voltage22V {
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + " 伏");
        return src;
    }
}
