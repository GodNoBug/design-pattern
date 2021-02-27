package principles.demo1;

// 搜狗输入法
public class SougouInput {
    private AbstractSkin skin; // 聚合

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    // 输入法中展示皮肤
    public void display(){
        skin.display();
    }
}
