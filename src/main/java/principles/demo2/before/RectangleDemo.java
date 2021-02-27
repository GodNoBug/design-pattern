package principles.demo2.before;

public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle=new Rectangle();
        // 设置长和宽
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // 调用resize方法进行扩宽
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("=============");
        Square square=new Square();
        rectangle.setLength(20);
        // 调用resize方法进行扩宽
        resize(rectangle); //  正方形类和长方形类之间的继承关系违反了里式替换原则,它们之间的继承关系不成立
        printLengthAndWidth(rectangle);
    }
    // 扩宽方法
    public static void resize(Rectangle rectangle){
        // 判断宽如果比长小,进行扩宽的操作
        while (rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }
    // 打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
