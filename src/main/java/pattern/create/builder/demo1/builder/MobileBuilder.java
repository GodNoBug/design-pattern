package pattern.create.builder.demo1.builder;

import pattern.create.builder.demo1.Bike;
import pattern.create.builder.demo1.builder.Builder;

// 具体的构建者，用来构建摩拜单车对象
public class MobileBuilder extends Builder {

    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    public Bike createBike() {
        return bike;
    }
}
