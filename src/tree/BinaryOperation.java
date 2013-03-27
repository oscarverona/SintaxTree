package tree;

import operations.Calculator;
import operations.Operator;
import type.Type;

public class BinaryOperation implements Node {

    private Node leftNode, rightNode;
    private final Calculator calculator;

    public BinaryOperation(Operator operation, Node leftNode, Node rightNode) {
        calculator = new Calculator(operation);
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    @Override
    public Type evaluate() {
        return calculator.calculate(leftNode.evaluate(), rightNode.evaluate());
    }

    @Override
    public String toString() {
        return (getFormated(leftNode) + " " + calculator.toString() + " " + getFormated(rightNode));
    }

    @Override
    public int getOperatorPrecedence() {
        return calculator.getOperation().getPriority();
    }

    private String getFormated(Node node) {
        String result = node.toString();
        if (node.getOperatorPrecedence() > this.getOperatorPrecedence()) {
            result = "(" + node + ")";
        }
        return result;
    }
}
