package project;

import operations.Operation;
import static org.junit.Assert.*;
import org.junit.Test;
import tree.BinaryOperation;
import tree.ConstantNode;
import type.Type;


public class SyntaxTreeTests {

    @Test
    public void firstOperationTest(){
        ConstantNode one = new ConstantNode(new Type<>(1));
        ConstantNode two = new ConstantNode(new Type<>(2));
        ConstantNode three = new ConstantNode(new Type<>(3));

        BinaryOperation mult = new BinaryOperation(Operation.MULTIPLY, two, three);
        BinaryOperation tree = new BinaryOperation(Operation.ADD, one, mult);

        assertEquals(7, (Integer) tree.evaluate().getValue(), 0.0);
    }

    @Test
    public void longNumberTreeTest(){
        ConstantNode four = new ConstantNode(new Type<>(4));
        ConstantNode two = new ConstantNode(new Type<>(2));
        ConstantNode six = new ConstantNode(new Type<>(6));
        ConstantNode one = new ConstantNode(new Type<>(1));
        ConstantNode zero = new ConstantNode(new Type<>(0));

        BinaryOperation div = new BinaryOperation(Operation.DIVIDE, six, two);
        BinaryOperation mult = new BinaryOperation(Operation.MULTIPLY, two, div);
        BinaryOperation rest1 = new BinaryOperation(Operation.SUBTRACT, four, mult);
        BinaryOperation rest2 = new BinaryOperation(Operation.SUBTRACT, one, zero);
        BinaryOperation tree = new BinaryOperation(Operation.ADD, rest1, rest2);

        assertEquals(-1, tree.evaluate().getValue());
    }

    @Test
    public void longLogicTreeTest(){
        ConstantNode falseNode = new ConstantNode(new Type<>(false));
        ConstantNode trueNode = new ConstantNode(new Type<>(true));

        BinaryOperation and = new BinaryOperation(Operation.AND, trueNode, trueNode);
        BinaryOperation or = new BinaryOperation(Operation.OR, trueNode, falseNode);
        BinaryOperation or2 = new BinaryOperation(Operation.OR, or, and);
        BinaryOperation tree = new BinaryOperation(Operation.AND, trueNode, or2);

        assertEquals(true, tree.evaluate().getValue());
    }
}
