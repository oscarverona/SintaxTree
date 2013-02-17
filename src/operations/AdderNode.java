package operations;

import tree.Node;

public class AdderNode extends BinaryOperation {

    public AdderNode() {
    }

    public AdderNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }
    
    @Override
    public double evaluate() {
        return getLeftNode().evaluate() + getRightNode().evaluate();
    }
    
}
