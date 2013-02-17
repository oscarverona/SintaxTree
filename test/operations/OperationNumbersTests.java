package operations;

import nodes.ConstantNode;
import nodes.VariableNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class OperationNumbersTests {
    
    @Test
    public void operationAddTest() {
        AdderNode add;
        try{
            add = new AdderNode();
            add.evaluate();
            assertTrue(true);
        } catch (NullPointerException ex) {
            
        }
        
        ConstantNode node1 = new ConstantNode(3);
        VariableNode node2 = new VariableNode(9);
        add = new AdderNode(node1, node2);
        assertEquals(12, add.evaluate(), 0.0);
    }
    
    @Test
    public void operationMultiplierTest() {
        MultiplierNode mult;
        try{
            mult = new MultiplierNode();
            mult.evaluate();
            assertTrue(true);
        } catch (NullPointerException ex) {
            
        }
        
        ConstantNode node1 = new ConstantNode(3);
        VariableNode node2 = new VariableNode(3);
        mult = new MultiplierNode(node1, node2);
        assertEquals(9, mult.evaluate(), 0.0);
    }
    
    @Test
    public void operationSubstractionTest() {
        SubtractionNode sub;
        try{
            sub = new SubtractionNode();
            sub.evaluate();
            assertTrue(true);
        } catch (NullPointerException ex) {
            
        }
        
        ConstantNode node1 = new ConstantNode(8);
        VariableNode node2 = new VariableNode(2);
        sub = new SubtractionNode(node1, node2);
        assertEquals(6, sub.evaluate(), 0.0);
    }
        
    @Test
    public void operationDivisionTest() {
        DivisionNode div;
        try{
            div = new DivisionNode();
            div.evaluate();
            assertTrue(true);
        } catch (NullPointerException ex) {
            
        }
        
        ConstantNode node1 = new ConstantNode(33);
        VariableNode node2 = new VariableNode(12);
        div = new DivisionNode(node1, node2);
        assertEquals(2.75, div.evaluate(), 0.0);
    }
    
}
