package pattern.create.builder.demo1;

// 产品对象 产品类 通常较为复杂
public class Bike {

    private String frame;//车架

    private String seat;//车座

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
