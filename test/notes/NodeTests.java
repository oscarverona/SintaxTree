package notes;

import nodes.ConstantNode;
import nodes.VariableNode;
import static org.junit.Assert.*;
import org.junit.Test;


public class NodeTests {
    
    @Test
    public void evaluateConstantsTest() {
        ConstantNode empty = new ConstantNode();
        ConstantNode integer = new ConstantNode(1.0);
        ConstantNode decimal = new ConstantNode(2.5);
        
        assertEquals(0.0, empty.evaluate(), 0.0);
        assertEquals(1.0, integer.evaluate(), 0.0);
        assertEquals(2.5, decimal.evaluate(), 0.0);       
    }
    
    @Test
    public void evaluateVariablesTest() {
        VariableNode empty = new VariableNode();
        VariableNode integer = new VariableNode(1.0);
        VariableNode decimal = new VariableNode(2.5);
        
        assertEquals(0.0, empty.evaluate(), 0.0);
        assertEquals(1.0, integer.evaluate(), 0.0);
        assertEquals(2.5, decimal.evaluate(), 0.0);       
        
        empty.setValue(0.00001);
        integer.setValue(0);
        decimal.setValue(-2.5);
        assertEquals(0.00001, empty.evaluate(), 0.0);
        assertEquals(0, integer.evaluate(), 0.0);
        assertEquals(-2.5, decimal.evaluate(), 0.0); 
    }
 }   
