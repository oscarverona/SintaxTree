package operations;

import tree.ConstantNode;
import tree.VariableNode;
import tree.BinaryOperation;
import static org.junit.Assert.*;
import org.junit.Test;
import type.Type;

public class OperationNumbersTests {

    @Test
    public void operationAddMultipleTypesTest() {

        ConstantNode intNode = new ConstantNode(new Type<>(3));
        VariableNode doubleNode = new VariableNode(new Type<>(9.0));

        BinaryOperation addDoubleInt = new BinaryOperation(Operator.ADD, doubleNode, intNode);
        BinaryOperation addDoubleDouble = new BinaryOperation(Operator.ADD, doubleNode, doubleNode);
        BinaryOperation addIntInt = new BinaryOperation(Operator.ADD,intNode, intNode);
        BinaryOperation addIntDouble = new BinaryOperation(Operator.ADD, intNode, doubleNode);

        assertEquals(12, (Double) addDoubleInt.evaluate().getValue(), 0.0);
        assertEquals(18, (Double) addDoubleDouble.evaluate().getValue(), 0.0);
        assertEquals(6, (Integer) addIntInt.evaluate().getValue(), 0.0);
        assertEquals(12, (Double) addIntDouble.evaluate().getValue(), 0.0);

        assertEquals(Double.class.getSimpleName(), addDoubleInt.evaluate().getSimpleClassName());
        assertEquals(Double.class.getSimpleName(), addDoubleDouble.evaluate().getSimpleClassName());
        assertEquals(Integer.class.getSimpleName(), addIntInt.evaluate().getSimpleClassName());
        assertEquals(Double.class.getSimpleName(), addIntDouble.evaluate().getSimpleClassName());
    }


    @Test
    public void operationMultiplierTest() {
        ConstantNode intNode = new ConstantNode(new Type<>(3));
        VariableNode doubleNode = new VariableNode(new Type<>(9.0));

        BinaryOperation addDoubleInt = new BinaryOperation(Operator.MULTIPLY, doubleNode, intNode);
        BinaryOperation addDoubleDouble = new BinaryOperation(Operator.MULTIPLY, doubleNode, doubleNode);
        BinaryOperation addIntInt = new BinaryOperation(Operator.MULTIPLY, intNode, intNode);
        BinaryOperation addIntDouble = new BinaryOperation(Operator.MULTIPLY, intNode, doubleNode);

        assertEquals(27, (Double) addDoubleInt.evaluate().getValue(), 0.0);
        assertEquals(81, (Double) addDoubleDouble.evaluate().getValue(), 0.0);
        assertEquals(9, (Integer) addIntInt.evaluate().getValue(), 0.0);
        assertEquals(27, (Double) addIntDouble.evaluate().getValue(), 0.0);

        assertEquals(Double.class.getSimpleName(), addDoubleInt.evaluate().getSimpleClassName());
        assertEquals(Double.class.getSimpleName(), addDoubleDouble.evaluate().getSimpleClassName());
        assertEquals(Integer.class.getSimpleName(), addIntInt.evaluate().getSimpleClassName());
        assertEquals(Double.class.getSimpleName(), addIntDouble.evaluate().getSimpleClassName());
    }
}
