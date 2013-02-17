package tree;

public class LogicTree implements LogicNode{
    private LogicNode rootNode;

    public LogicTree() {
        rootNode = null;
    }

    public LogicTree(LogicNode rootNode) {
        this.rootNode = rootNode;
    }
    
    @Override
    public boolean evaluate() {
        return rootNode.evaluate();
    }  
    
    public LogicNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(LogicNode rootNode) {
        this.rootNode = rootNode;
    }
    
}
