package nodes;

import tree.LogicNode;

public class LogicConstantNode implements LogicNode{
    private final boolean value;  
    
    public LogicConstantNode(){
        value = false;
    }
    
    public LogicConstantNode(boolean value){
        this.value = value;
    }

    @Override
    public boolean evaluate() {
        return value;
    }
    
}
