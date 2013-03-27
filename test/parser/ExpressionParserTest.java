package parser;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.Node;

public class ExpressionParserTest {

    @Test
    public void simpleExpressionTest(){
        ExpressionParser expParser = new ExpressionParser("1 - 2 + 3");
        Node node = expParser.buildTree();
        assertEquals(2, (Double) node.evaluate().getValue(), 0.0);

        expParser = new ExpressionParser("( 2 * 2 ) + 1");
        node = expParser.buildTree();
        assertEquals(5, (Double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void RPNoutputTest(){
        //assertEquals("1 2 + 3 4 / * 5 6 + - ", resultRPN);
        ExpressionParser expParser = new ExpressionParser("( 1 + 2 ) * ( 3 / 4 ) - ( 5 + 6 )");
        Node node = expParser.buildTree();
        assertEquals(-8.75, (Double) node.evaluate().getValue(), 0.0);
    }


    @Test
    public void hardExpressionTest(){
        ExpressionParser expParser = new ExpressionParser("( ( 7 - 2 ) * ( 5 / 4 ) ) - ( ( 1 - 1 ) * 6 )");
        Node node = expParser.buildTree();
        assertEquals(6.25, (Double) node.evaluate().getValue(), 0.0);
    }
}
