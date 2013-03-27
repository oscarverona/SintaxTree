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

        BinaryOperation and = new BinaryOperation(Operator.AND, trueNode, trueNode);
        assertEquals(true, and.evaluate().getValue());

        and = new BinaryOperation(Operator.AND, trueNode, falseNode);
        assertEquals(false, and.evaluate().getValue());

        and = new BinaryOperation(Operator.AND, falseNode, trueNode);
        assertEquals(false, and.evaluate().getValue());

        and = new BinaryOperation(Operator.AND, falseNode, falseNode);
        assertEquals(false, and.evaluate().getValue());
    }

    @Test
    public void operationOrTest() {
        ConstantNode trueNode = new ConstantNode(new Type<>(true));
        ConstantNode falseNode = new ConstantNode(new Type<>(false));

        BinaryOperation or = new BinaryOperation(Operator.OR, trueNode, trueNode);
        assertEquals(true, or.evaluate().getValue());

        or = new BinaryOperation(Operator.OR, trueNode, falseNode);
        assertEquals(true, or.evaluate().getValue());

        or = new BinaryOperation(Operator.OR, falseNode, trueNode);
        assertEquals(true, or.evaluate().getValue());

        or = new BinaryOperation(Operator.OR, falseNode, falseNode);
        assertEquals(false, or.evaluate().getValue());
    }
}
