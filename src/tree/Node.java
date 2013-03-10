package tree;

import type.Type;

public interface Node {
    public Type evaluate();

    @Override
    public String toString();

    public int getOperatorPrecedence();
}
