package project;

import nodes.ConstantNode;
import operations.AdderNode;
import operations.MultiplierNode;
import static org.junit.Assert.*;
import org.junit.Test;
import tree.Tree;


public class SyntaxTreeTests {
    
    @Test
    public void firstOperationTest(){
        ConstantNode one = new ConstantNode(1.0);
        ConstantNode two = new ConstantNode(2.0);
        ConstantNode three = new ConstantNode(3.0);
        
        MultiplierNode mult = new MultiplierNode(two, three);
        AdderNode sum = new AdderNode(one, mult);
        
        Tree tree = new Tree(sum);
        
        assertEquals(7.0, tree.evaluate(), 0.0);
    }
}
