package nodes;

import tree.Node;
import type.Type;


public class VariableNode implements Node{
    private Type value;

    public VariableNode(){
        value = new Type<>(0.0);
    }

    public VariableNode(Type value){
        this.value = value;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    @Override
    public Type evaluate() {
        return value;
    }

}
