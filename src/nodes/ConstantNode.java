package nodes;

import tree.Node;

public class ConstantNode implements Node{
    private double value;  
    
    public ConstantNode(){
        value = 0.0;
    }
    
    public ConstantNode(double value){
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
