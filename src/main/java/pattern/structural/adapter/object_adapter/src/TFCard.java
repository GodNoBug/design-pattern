package pattern.structural.adapter.object_adapter.src;

// 适配者类接口  它是被访问和适配的现存组件库中的组件接口 如中国的插头(对于外国来说)
public interface TFCard {
    // 从TF卡中读取数据
    String readTF();
    // 往TF卡中读取数据
    void writeTF(String msg);
}
