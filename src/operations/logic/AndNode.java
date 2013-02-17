package operations.logic;

import nodes.LogicBinaryOperation;
import tree.LogicNode;

public class AndNode extends LogicBinaryOperation {

    public AndNode() {
        super(null, null);
    }

    public AndNode(LogicNode leftNode, LogicNode rightNode) {
        super(leftNode, rightNode);
    }
    
    @Override
    public boolean evaluate() {
        return getLeftNode().evaluate() && getRightNode().evaluate();
    }
    
}
