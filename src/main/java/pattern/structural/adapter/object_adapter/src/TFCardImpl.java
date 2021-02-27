package pattern.structural.adapter.object_adapter.src;

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
