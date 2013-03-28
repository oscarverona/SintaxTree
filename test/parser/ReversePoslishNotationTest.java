package parser;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class ReversePoslishNotationTest {
    @Test
    public void RPNoutputTest(){

        ReversePolishNotation rpnExpression = new ReversePolishNotation("( 7 + 0 ) * ( 3 / 4 ) - ( 5 + 8 )");
        List<ExpressionToken> tokens = rpnExpression.parseTokens();

        String result = "";

        for (ExpressionToken token : tokens) {
            result += token.getValue()+" ";
        }

        assertEquals("7 0 + 3 4 / * 5 8 + - ", result);
    }
}
