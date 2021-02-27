package pattern.create.builder.other.after;
// 1.产品类
public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    // 私有构造方法 只共静态内部类使用
    private Phone(Builder builder) {
        this.cpu=builder.cpu;
        this.screen=builder.screen;
        this.memory=builder.memory;
        this.mainBoard=builder.mainBoard;
    }

    // 2.建造者类
    public static final class Builder {
        // 一些复杂的组件
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;

        // 组件的构建
        public Builder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder screen(String screen){
            this.screen=screen;
            return this;
        }
        public Builder memory(String memory){
            this.memory=memory;
            return this;
        }
        public Builder mainBoard(String mainBoard){
            this.mainBoard=mainBoard;
            return this;
        }
        // 使用构建者创建Phone对象
        public Phone build(){
            return new Phone(this);
        }
    }


    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }
}
