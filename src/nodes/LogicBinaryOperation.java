package nodes;
import tree.LogicNode;

public abstract class LogicBinaryOperation implements LogicNode{
    private LogicNode leftNode, rightNode;

    public LogicBinaryOperation() {
        leftNode = rightNode = null;
    }
    
    public LogicBinaryOperation(LogicNode leftNode, LogicNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
        
    public LogicNode getLeftNode() {
        return leftNode;
    }

    public LogicNode getRightNode() {
        return rightNode;
    }
}
