package pattern.structural.adapter.class_adapter;

// 适配者类接口  它是被访问和适配的现存组件库中的组件接口
public interface TFCard {
    // 从TF卡中读取数据
    String readTF();
    // 往TF卡中读取数据
    void writeTF(String msg);
}
