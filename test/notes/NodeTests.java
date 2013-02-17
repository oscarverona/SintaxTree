package notes;

import nodes.ConstantNode;
import static org.junit.Assert.*;
import org.junit.Test;


public class NodeTests {
    
    @Test
    public void evaluateTest() {
        ConstantNode empty = new ConstantNode();
        ConstantNode integer = new ConstantNode(1.0);
        ConstantNode decimal = new ConstantNode(2.5);
        
        assertEquals(0.0, empty.evaluate(), 0.0);
        assertEquals(1.0, integer.evaluate(), 0.0);
        assertEquals(2.5, decimal.evaluate(), 0.0);       
    }
}
