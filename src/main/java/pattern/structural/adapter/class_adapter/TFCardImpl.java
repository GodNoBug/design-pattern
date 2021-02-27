package pattern.structural.adapter.class_adapter;

// TF卡 是被适配的类
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TFCard read msg : hello word TFCard";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg: "+msg);

    }
}
