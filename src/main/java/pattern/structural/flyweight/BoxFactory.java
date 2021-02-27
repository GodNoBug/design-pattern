package pattern.structural.flyweight;

import java.util.HashMap;

// 工厂类,设计该类为单例
public class BoxFactory {
    private HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    // 根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }

    // 提供一个方法获取该工厂类对象
    public static BoxFactory getInstance() {
        return factory;
    }

    private static BoxFactory factory = new BoxFactory();

}
