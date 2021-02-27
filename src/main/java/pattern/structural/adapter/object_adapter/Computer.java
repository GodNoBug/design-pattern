package pattern.structural.adapter.object_adapter;

public class Computer {
    // 从SD卡中读取数据,也只能从SD卡中读
    public String readSD(SDCard sdCard){
        if (sdCard==null){
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
