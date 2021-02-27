package principles.demo1;

public class Client {
    public static void main(String[] args) {
        // 1.创建搜狗输入法对象
        SougouInput input =new SougouInput();
        // 2.创建皮肤对象
        //  这里改用黑马皮肤,其他的4个类没有进行修改
        // DefaultSkin skin=new DefaultSkin();
        // 开闭原则,不要对之前设置好的四个类修改,只需扩展一个皮肤类,然后修改Client就可以
        HeimaSkin skin =new HeimaSkin();
        // 3.将皮肤设置到输入法中
        input.setSkin(skin);
        // 4.显示皮肤
        input.display();
    }
}
