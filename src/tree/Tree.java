package tree;

public class Tree implements Node{
    private Node rootNode;

    public Tree() {
        rootNode = null;
    }

    public Tree(Node rootNode) {
        this.rootNode = rootNode;
    }
    
    @Override
    public double evaluate() {
        return rootNode.evaluate();
    }  
    
    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }
    
}
