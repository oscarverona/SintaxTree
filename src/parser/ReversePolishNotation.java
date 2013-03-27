package parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReversePolishNotation {

    private String input;

    public ReversePolishNotation(String input) {
        this.input = input;
    }

    public List<ExpressionToken> parseTokens() {
        List<ExpressionToken> result = new ArrayList<>();
        Stack<ExpressionToken> tokenStack = new Stack<>();

        for (ExpressionToken token : tokenList()) {
            if (token.isOperator()) {
                addOperands(tokenStack, token, result);
                tokenStack.push(token);
            } else if (token.isLeftBracket()) {
                tokenStack.push(token);
            } else if (token.isRightBracket()) {
                closeBrackets(tokenStack, result);
                tokenStack.pop();
            } else {
                result.add(token);
            }
        }
        while (!tokenStack.empty()) {
            result.add(tokenStack.pop());
        }

        return result;
    }

    private int comparePrecedence(ExpressionToken token1, ExpressionToken token2) {
        if (token1.isOperator() && token2.isOperator()) {
            return token1.getPrecedence() - token2.getPrecedence();
        }
        throw new IllegalArgumentException("Invalid tokens: "
                + token1.getValue() + " " + token2.getValue());
    }

    private List<ExpressionToken> tokenList() {
        List<ExpressionToken> tokens = new ArrayList<>();
        for (String inputToken : input.split(" ")) {
            tokens.add(new ExpressionToken(inputToken));
        }
        return tokens;
    }

    private void closeBrackets(Stack<ExpressionToken> tokenStack, List<ExpressionToken> result) {
        while (!tokenStack.empty() && !tokenStack.peek().isLeftBracket()) {
            result.add(tokenStack.pop());
        }
    }

    private void addOperands(Stack<ExpressionToken> tokenStack, ExpressionToken token, List<ExpressionToken> result) {
        while (!tokenStack.empty() && tokenStack.peek().isOperator()) {
            if ((tokenStack.peek().isAssociativeLeft()
                    && comparePrecedence(token, tokenStack.peek()) <= 0)
                    || (token.isAssociativeRight()
                    && comparePrecedence(token, tokenStack.peek()) < 0)) {
                result.add(tokenStack.pop());
                continue;
            }
            break;
        }
    }
}
