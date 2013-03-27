/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.Node;

public class ExpressionParserTest {

    @Test
    public void simpleExpressionTest(){
        String[] input = "1 - 2 + 3".split(" ");
        String[] output = ExpressionParser.reversePolishNotation(input);
        Node node = ExpressionParser.parseToSintaxTree(output);
        assertEquals(2, (Double) node.evaluate().getValue(), 0.0);

        input = "( 2 * 2 ) + 1".split(" ");
        output = ExpressionParser.reversePolishNotation(input);
        node = ExpressionParser.parseToSintaxTree(output);
        assertEquals(5, (Double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void RPNoutputTest(){
        String[] input = "( 1 + 2 ) * ( 3 / 4 ) - ( 5 + 6 )".split(" ");
        String[] output = ExpressionParser.reversePolishNotation(input);

        String resultRPN = "";
        for (String token : output) {
            resultRPN +=token + " ";
        }
        assertEquals("1 2 + 3 4 / * 5 6 + - ", resultRPN);

        Node node = ExpressionParser.parseToSintaxTree(output);
        assertEquals(-8.75, (Double) node.evaluate().getValue(), 0.0);
    }


    @Test
    public void secondExpressionTest(){
        String[] input = "( ( 7 - 2 ) * ( 5 / 4 ) ) - ( ( 1 - 1 ) * 6 )".split(" ");
        String[] output = ExpressionParser.reversePolishNotation(input);

        Node node = ExpressionParser.parseToSintaxTree(output);
        assertEquals(6.25, (Double) node.evaluate().getValue(), 0.0);
    }
}
