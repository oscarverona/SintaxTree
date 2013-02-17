package operations;

import tree.Node;

public class DivisionNode extends BinaryOperation{
    
    public DivisionNode() {
        super(null, null);
    }

    public DivisionNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }
     
    @Override
    public double evaluate() {
        return getLeftNode().evaluate() / getRightNode().evaluate();
    }    
}
