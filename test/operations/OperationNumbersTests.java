package operations;

import nodes.ConstantNode;
import nodes.VariableNode;
import static org.junit.Assert.*;
import org.junit.Test;
import type.Type;

public class OperationNumbersTests {

    @Test
    public void operationAddMultipleTypesTest() {

        ConstantNode intNode = new ConstantNode(new Type<>(3));
        VariableNode doubleNode = new VariableNode(new Type<>(9.0));

        AdderNode addDoubleInt = new AdderNode(doubleNode, intNode);
        AdderNode addDoubleDouble = new AdderNode(doubleNode, doubleNode);
        AdderNode addIntInt = new AdderNode(intNode, intNode);
        AdderNode addIntDouble = new AdderNode(intNode, doubleNode);

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

        MultiplierNode addDoubleInt = new MultiplierNode(doubleNode, intNode);
        MultiplierNode addDoubleDouble = new MultiplierNode(doubleNode, doubleNode);
        MultiplierNode addIntInt = new MultiplierNode(intNode, intNode);
        MultiplierNode addIntDouble = new MultiplierNode(intNode, doubleNode);

        assertEquals(12, (Double) addDoubleInt.evaluate().getValue(), 0.0);
        assertEquals(18, (Double) addDoubleDouble.evaluate().getValue(), 0.0);
        assertEquals(6, (Integer) addIntInt.evaluate().getValue(), 0.0);
        assertEquals(12, (Double) addIntDouble.evaluate().getValue(), 0.0);

        assertEquals(Double.class.getSimpleName(), addDoubleInt.evaluate().getSimpleClassName());
        assertEquals(Double.class.getSimpleName(), addDoubleDouble.evaluate().getSimpleClassName());
        assertEquals(Integer.class.getSimpleName(), addIntInt.evaluate().getSimpleClassName());
        assertEquals(Double.class.getSimpleName(), addIntDouble.evaluate().getSimpleClassName());
    }

    /*@Test
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
    }*/

}
