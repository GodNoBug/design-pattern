package pattern.structural.decorator.decorator;

public class Client {
    public static void main(String[] args) {
        // 点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.cost()+" 元");
        System.out.println("============");
        // 在上面的炒饭中加一个鸡蛋
        food =new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost()+" 元");
        // 再加一个鸡蛋
        food =new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost()+" 元");
        // 加一个培根
        food =new Bacon(food);
        System.out.println(food.getDesc() + " " + food.cost()+" 元");
    }
}
