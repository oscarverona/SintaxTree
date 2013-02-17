package operations;

import nodes.BinaryOperation;
import tree.Node;

public class AdderNode extends BinaryOperation {

    public AdderNode() {
        super(null, null);
    }

    public AdderNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }
    
    @Override
    public double evaluate() {
        return getLeftNode().evaluate() + getRightNode().evaluate();
    }
    
}
