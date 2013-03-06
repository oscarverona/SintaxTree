package nodes;

import tree.Node;
import type.Type;

public class ConstantNode implements Node{
    private final Type value;

    public ConstantNode(){
        value = new Type<>(0.0);
    }

    public ConstantNode(Type value){
        this.value = value;
    }

    @Override
    public Type evaluate() {
        return value;
    }

}
