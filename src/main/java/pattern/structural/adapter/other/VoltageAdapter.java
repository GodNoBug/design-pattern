package pattern.structural.adapter.other;

// 电源转接器
public class VoltageAdapter extends Voltage22V implements IVoltage5V {

    @Override
    public int output5V() {
        // 获取到220v电压
        int src = output220V();
        // 处理过后的电压
        return src/44;
    }
}
