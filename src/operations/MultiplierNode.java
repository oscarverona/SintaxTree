package operations;

import nodes.BinaryOperation;
import tree.Node;

public class MultiplierNode extends BinaryOperation{

    public MultiplierNode() {
        super(null, null);
    }

    public MultiplierNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }
     
    @Override
    public double evaluate() {
        return getLeftNode().evaluate() * getRightNode().evaluate();
    }
    
}
