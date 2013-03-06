package operations;

import nodes.BinaryOperation;
import tree.Node;
import type.Type;

public class SubtractionNode extends BinaryOperation{
    private final NumberOperation operator = new NumberOperation('-');

    public SubtractionNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }

    @Override
    public Type evaluate() {
         return operator.calculate(getLeftNode().evaluate(),
                                  getRightNode().evaluate());
    }
}
