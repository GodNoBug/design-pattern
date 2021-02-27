package pattern.behavioral.interpreter;

public class Client {
    public static void main(String[] args) {
        // 创建环境对象
        Context context = new Context();
        // 创建多个变量
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        // 将变量存储到环境变量中
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        // 获取抽象语法树 a + b - c + d
        AbstractExpression expression = new Minus(a, new Plus(new Minus(b, c), d));
        // 解释 计算
        System.out.println(expression+"="+expression.interpret(context));
    }
}
