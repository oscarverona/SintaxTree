package project;

import nodes.ConstantNode;
import nodes.LogicConstantNode;
import operations.AdderNode;
import operations.DivisionNode;
import operations.MultiplierNode;
import operations.SubtractionNode;
import operations.logic.AndNode;
import operations.logic.OrNode;
import static org.junit.Assert.*;
import org.junit.Test;
import type.Type;


public class SyntaxTreeTests {

    @Test
    public void firstOperationTest(){
        ConstantNode one = new ConstantNode(new Type<>(1));
        ConstantNode two = new ConstantNode(new Type<>(2));
        ConstantNode three = new ConstantNode(new Type<>(3));

        MultiplierNode mult = new MultiplierNode(two, three);
        AdderNode tree = new AdderNode(one, mult);

        assertEquals(7, (Integer) tree.evaluate().getValue(), 0.0);
    }

    @Test
    public void longNumberTreeTest(){
        ConstantNode four = new ConstantNode(new Type<>(4));
        ConstantNode two = new ConstantNode(new Type<>(2));
        ConstantNode six = new ConstantNode(new Type<>(6));
        ConstantNode one = new ConstantNode(new Type<>(1));
        ConstantNode zero = new ConstantNode(new Type<>(0));

        DivisionNode div = new DivisionNode(six, two);
        MultiplierNode mult = new MultiplierNode(two, div);
        SubtractionNode rest1 = new SubtractionNode(four, mult);
        SubtractionNode rest2 = new SubtractionNode(one, zero);
        AdderNode tree = new AdderNode(rest1, rest2);

        assertEquals(-1, tree.evaluate().getValue());
    }

    @Test
    public void longLogicTreeTest(){
        LogicConstantNode falseNode = new LogicConstantNode(false);
        LogicConstantNode trueNode = new LogicConstantNode(true);

        AndNode and = new AndNode(trueNode, trueNode);
        OrNode or = new OrNode(trueNode, falseNode);
        OrNode or2 = new OrNode(or, and);
        AndNode tree = new AndNode(trueNode, or2);

        assertEquals(true, tree.evaluate());
    }
}
