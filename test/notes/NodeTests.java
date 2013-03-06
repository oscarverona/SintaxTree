package notes;

import nodes.ConstantNode;
import nodes.LogicConstantNode;
import nodes.VariableNode;
import static org.junit.Assert.*;
import org.junit.Test;
import type.Type;


public class NodeTests {

    @Test
    public void evaluateConstantsTest() {
        ConstantNode empty = new ConstantNode();
        ConstantNode integer = new ConstantNode(new Type<>(1));
        ConstantNode decimal = new ConstantNode(new Type<>(2.5));

        assertEquals(0.0, (Double) empty.evaluate().getValue(), 0.0);
        assertEquals(1, (Integer) integer.evaluate().getValue(), 0.0);
        assertEquals(2.5, (Double) decimal.evaluate().getValue(), 0.0);
    }

    @Test
    public void evaluateVariablesTest() {
        VariableNode empty = new VariableNode();
        VariableNode integer = new VariableNode(new Type<>(1));
        VariableNode decimal = new VariableNode(new Type<>(2.5));

        assertEquals(0.0, (Double) empty.evaluate().getValue(), 0.0);
        assertEquals(1, (Integer) integer.evaluate().getValue(), 0.0);
        assertEquals(2.5, (Double) decimal.evaluate().getValue(), 0.0);

        empty.setValue(new Type<>(0.00001));
        integer.setValue(new Type<>(0));
        decimal.setValue(new Type<>(-Double.MAX_VALUE));

        assertEquals(0.00001, (Double) empty.evaluate().getValue(), 0.0);
        assertEquals(0, (Integer)  integer.evaluate().getValue(), 0.0);
        assertEquals(-Double.MAX_VALUE, (Double) decimal.evaluate().getValue(), 0.0);
    }

    @Test
    public void evaluateLogicConstantsTest() {
        LogicConstantNode empty = new LogicConstantNode();
        LogicConstantNode trueNode = new LogicConstantNode(true);
        LogicConstantNode falseNode = new LogicConstantNode(false);

        assertEquals(false, empty.evaluate());
        assertEquals(true, trueNode.evaluate());
        assertEquals(false, falseNode.evaluate());
    }
 }
