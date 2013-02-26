package project;

import nodes.ConstantNode;
import nodes.LogicConstantNode;
import operations.AdderNode;
import operations.DivisionNode;
import operations.MultiplierNode;
import operations.SubtractionNode;
import operations.logic.AndNode;
import operations.logic.OrNode;
import static org.junit.Assert.*;
import org.junit.Test;


public class SyntaxTreeTests {
    
    @Test
    public void firstOperationTest(){
        ConstantNode one = new ConstantNode(1.0);
        ConstantNode two = new ConstantNode(2.0);
        ConstantNode three = new ConstantNode(3.0);
        
        MultiplierNode mult = new MultiplierNode(two, three);
        AdderNode tree = new AdderNode(one, mult);
   
        assertEquals(7.0, tree.evaluate(), 0.0);
    }
    
    @Test
    public void longNumberTreeTest(){
        ConstantNode four = new ConstantNode(4);
        ConstantNode two = new ConstantNode(2);
        ConstantNode six = new ConstantNode(6);
        ConstantNode one = new ConstantNode(1);
        ConstantNode zero = new ConstantNode(0);

        DivisionNode div = new DivisionNode(six, two);
        MultiplierNode mult = new MultiplierNode(two, div);
        SubtractionNode rest1 = new SubtractionNode(four, mult); 
        SubtractionNode rest2 = new SubtractionNode(one, zero);  
        AdderNode tree = new AdderNode(rest1, rest2);
        
        assertEquals(-1, tree.evaluate(), 0.0);
    }
    
    @Test
    public void longLogicTreeTest(){
        LogicConstantNode falseNode = new LogicConstantNode(false);
        LogicConstantNode trueNode = new LogicConstantNode(true);

        AndNode and = new AndNode(trueNode, trueNode);
        OrNode or = new OrNode(trueNode, falseNode);
        OrNode or2 = new OrNode(or, and);
        AndNode tree = new AndNode(trueNode, or2);
        
        assertEquals(true, tree.evaluate());
    }
}
