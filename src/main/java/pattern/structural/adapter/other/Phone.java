package pattern.structural.adapter.other;

public class Phone {
    // 充电
    public void charging(IVoltage5V v){
        if (v.output5V()==5){
            System.out.println("电压为5v,可以充电~~");
        }else if (v.output5V()>5){
            System.out.println("电压大于5v,不能充电~~");
        }
    }
}
