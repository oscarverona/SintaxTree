package nodes;
import tree.Node;

public abstract class BinaryOperation implements Node{
    private Node leftNode, rightNode;

    public BinaryOperation() {
        leftNode = rightNode = null;
    }
    
    public BinaryOperation(Node leftNode, Node rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
        
    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }
}
