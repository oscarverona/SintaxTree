package tree;

import operations.Calculator;
import operations.Operation;
import type.Type;

public class UnaryOperation implements Node {

    private Node node;
    private final Calculator calculator;

    public UnaryOperation(Operation operation, Node node) {
        calculator = new Calculator(operation);
        this.node = node;

    }

    public Node getNode() {
        return node;
    }

    @Override
    public Type evaluate() {
        return node.evaluate();
    }

    @Override
    public int getOperatorPrecedence() {
        throw new UnsupportedOperationException("Not supported.");
    }
}
