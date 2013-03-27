package tree;

import type.Type;

public class ConstantNode implements Node {

    private final Type value;

    public ConstantNode(Type value) {
        this.value = value;
    }

    @Override
    public Type evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int getOperatorPrecedence() {
        return 0;
    }
}
