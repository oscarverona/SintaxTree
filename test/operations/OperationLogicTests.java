package operations;

import tree.BinaryOperation;
import tree.ConstantNode;
import static org.junit.Assert.*;
import org.junit.Test;
import type.Type;

public class OperationLogicTests {

    @Test
    public void operationAndTest() {
        ConstantNode trueNode = new ConstantNode(new Type<>(true));
        ConstantNode falseNode = new ConstantNode(new Type<>(false));

        BinaryOperation and = new BinaryOperation(Operation.AND, trueNode, trueNode);
        assertEquals(true, and.evaluate().getValue());

        and = new BinaryOperation(Operation.AND, trueNode, falseNode);
        assertEquals(false, and.evaluate().getValue());

        and = new BinaryOperation(Operation.AND, falseNode, trueNode);
        assertEquals(false, and.evaluate().getValue());

        and = new BinaryOperation(Operation.AND, falseNode, falseNode);
        assertEquals(false, and.evaluate().getValue());
    }

    @Test
    public void operationOrTest() {
        ConstantNode trueNode = new ConstantNode(new Type<>(true));
        ConstantNode falseNode = new ConstantNode(new Type<>(false));

        BinaryOperation or = new BinaryOperation(Operation.OR, trueNode, trueNode);
        assertEquals(true, or.evaluate().getValue());

        or = new BinaryOperation(Operation.OR, trueNode, falseNode);
        assertEquals(true, or.evaluate().getValue());

        or = new BinaryOperation(Operation.OR, falseNode, trueNode);
        assertEquals(true, or.evaluate().getValue());

        or = new BinaryOperation(Operation.OR, falseNode, falseNode);
        assertEquals(false, or.evaluate().getValue());
    }
}
