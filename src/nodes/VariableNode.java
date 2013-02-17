package nodes;

import tree.Node;

public class VariableNode implements Node{
    private double value;  
    
    public VariableNode(){
        value = 0.0;
    }
    
    public VariableNode(double value){
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
    
}
