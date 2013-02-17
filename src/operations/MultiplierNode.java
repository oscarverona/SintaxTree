package operations;

import tree.Node;

public class MultiplierNode extends BinaryOperation{

    public MultiplierNode() {
    }

    public MultiplierNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }
     
    @Override
    public double evaluate() {
        return getLeftNode().evaluate() * getRightNode().evaluate();
    }
    
    
}
