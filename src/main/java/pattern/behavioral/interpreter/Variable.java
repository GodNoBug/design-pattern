package pattern.behavioral.interpreter;

import pattern.behavioral.interpreter.AbstractExpression;
import pattern.behavioral.interpreter.Context;

// 用于封装变量的类
public class Variable extends AbstractExpression {
    // 声明存储变量名的成员变量
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        // 直接返回变量的值
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
