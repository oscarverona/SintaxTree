package tree;

import operations.Operation;
import static org.junit.Assert.*;
import org.junit.Test;
import type.Type;

public class NodeToStringTest {

    @Test
    public void simpleNodestoStringTest() {
        ConstantNode integer = new ConstantNode(new Type<>(1));
        VariableNode decimal = new VariableNode(new Type<>(2.5));

        assertEquals("1", integer.toString());
        assertEquals("2.5", decimal.toString());
    }


    @Test
    public void operationNodestoStringTest() {
        ConstantNode integer = new ConstantNode(new Type<>(1));
        VariableNode decimal = new VariableNode(new Type<>(2.5));

        BinaryOperation add = new BinaryOperation(Operation.ADD, decimal, integer);
        assertEquals("2.5 + 1", add.toString());

        BinaryOperation mult = new BinaryOperation(Operation.MULTIPLY, integer, integer);
        assertEquals("1 * 1", mult.toString());

        BinaryOperation subtract = new BinaryOperation(Operation.SUBTRACT, integer, decimal);
        assertEquals("1 - 2.5", subtract.toString());
    }

    @Test
    public void treeToStringTest() {
        ConstantNode one = new ConstantNode(new Type<>(1));
        ConstantNode two = new ConstantNode(new Type<>(2));
        VariableNode three = new VariableNode(new Type<>(3));


        BinaryOperation mult = new BinaryOperation(Operation.MULTIPLY, one, three);
        assertEquals("1 * 3", mult.toString());

        BinaryOperation add = new BinaryOperation(Operation.ADD, two, mult);
        assertEquals("2 + (1 * 3)", add.toString());
    }
}
