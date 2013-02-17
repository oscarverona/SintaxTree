package operations;

import nodes.BinaryOperation;
import tree.Node;

public class SubtractionNode extends BinaryOperation{
    
    public SubtractionNode() {
        super(null, null);
    }

    public SubtractionNode(Node leftNode, Node rightNode) {
        super(leftNode, rightNode);
    }
     
    @Override
    public double evaluate() {
        return getLeftNode().evaluate() - getRightNode().evaluate();
    }    
}
