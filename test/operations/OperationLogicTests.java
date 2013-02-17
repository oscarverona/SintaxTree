package operations;

import nodes.LogicConstantNode;
import operations.logic.AndNode;
import operations.logic.OrNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class OperationLogicTests {

    @Test
    public void operationAndTest() {
        AndNode and;
        try {
            and = new AndNode();
            and.evaluate();
            assertTrue(true);
        } catch (NullPointerException ex) {
        }

        LogicConstantNode trueNode = new LogicConstantNode(true);
        LogicConstantNode falseNode = new LogicConstantNode(false);

        and = new AndNode(trueNode, trueNode);
        assertEquals(true, and.evaluate());

        and = new AndNode(trueNode, falseNode);
        assertEquals(false, and.evaluate());

        and = new AndNode(falseNode, trueNode);
        assertEquals(false, and.evaluate());

        and = new AndNode(falseNode, falseNode);
        assertEquals(false, and.evaluate());
    }

    @Test
    public void operationOrTest() {
        OrNode or;
        try {
            or = new OrNode();
            or.evaluate();
            assertTrue(true);
        } catch (NullPointerException ex) {
        }

        LogicConstantNode trueNode = new LogicConstantNode(true);
        LogicConstantNode falseNode = new LogicConstantNode(false);
       
        or = new OrNode(trueNode, trueNode);
        assertEquals(true, or.evaluate());

        or = new OrNode(trueNode, falseNode);
        assertEquals(true, or.evaluate());

        or = new OrNode(falseNode, trueNode);
        assertEquals(true, or.evaluate());

        or = new OrNode(falseNode, falseNode);
        assertEquals(false, or.evaluate());
    }
}
