package pattern.create.builder.demo1.builder;

import pattern.create.builder.demo1.Bike;
import pattern.create.builder.demo1.builder.Builder;

// ofo单车构建者，用来构建ofo单车
public class OfoBuilder extends Builder {
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    public Bike createBike() {
        return bike;
    }
}
