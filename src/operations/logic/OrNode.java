package operations.logic;

import nodes.LogicBinaryOperation;
import tree.LogicNode;

public class OrNode extends LogicBinaryOperation {

    public OrNode() {
        super(null, null);
    }

    public OrNode(LogicNode leftNode, LogicNode rightNode) {
        super(leftNode, rightNode);
    }
    
    @Override
    public boolean evaluate() {
        return getLeftNode().evaluate() || getRightNode().evaluate();
    }
    
}
