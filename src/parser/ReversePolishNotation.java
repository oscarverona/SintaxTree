package parser;

import java.util.ArrayList;
import java.util.Stack;

public class ReversePolishNotation {

    private String[] input;

    public ReversePolishNotation(String input) {
        this.input = input.split(" ");
    }

    public ArrayList<ExpressionToken> parseTokens() {
        ArrayList<ExpressionToken> out = new ArrayList<>();
        Stack<ExpressionToken> tokenStack = new Stack<>();

        ExpressionToken token;
        for (String tokenString : input) {
            token = new ExpressionToken(tokenString);

            if (token.isOperator()) {
                while (!tokenStack.empty() && tokenStack.peek().isOperator()) {
                    if ((tokenStack.peek().isAssociativeLeft()
                            && comparePrecedence(token, tokenStack.peek()) <= 0)
                            || (token.isAssociativeRight()
                            && comparePrecedence(token, tokenStack.peek()) < 0)) {
                        out.add(tokenStack.pop());
                        continue;
                    }
                    break;
                }

                tokenStack.push(token);
            }
            else if (token.isLeftBracket()) {
                tokenStack.push(token);
            }
            else if (token.isRightBracket()) {
                while (!tokenStack.empty() && !tokenStack.peek().isLeftBracket()) {
                    out.add(tokenStack.pop());
                }
                tokenStack.pop();
            }
            else {
                out.add(token);
            }
        }
        while (!tokenStack.empty()) {
            out.add(tokenStack.pop());
        }

        return out;
    }

    private int comparePrecedence(ExpressionToken token1, ExpressionToken token2) {
        if (token1.isOperator() && token2.isOperator()) {
            return token1.getPrecedence() - token2.getPrecedence();
        }
        throw new IllegalArgumentException("Invalid tokens: "
                + token1.getValue() + " " + token2.getValue());
    }
}
