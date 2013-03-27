package parser;

import java.util.ArrayList;
import java.util.Stack;
import operations.Operator;
import tree.*;
import type.Type;

public class ExpressionParser {

    private String expression;

    public ExpressionParser(String expression) {
        this.expression = expression;
    }

    public Node buildTree() {
        ReversePolishNotation rpn = new ReversePolishNotation(expression);
        return toSintaxTree(rpn.parseTokens());
    }

    private Node toSintaxTree(ArrayList<ExpressionToken> tokens) {
        Stack<Node> stack = new Stack<>();

        for (ExpressionToken token : tokens) {
            if (token.isOperator()) {
                stack.push(extractOperationNode(token, stack));
            } else {
                stack.push(extractVariableNode(token));
            }
        }
        return stack.pop();
    }

    private Node extractOperationNode(ExpressionToken token, Stack<Node> stack) {
        Character operatorChar = token.asCharacter();
        Node righttNode = stack.pop();
        Node leftNode = stack.pop();
        return new BinaryOperation(new Operator(operatorChar), leftNode, righttNode);
    }

    private Node extractVariableNode(ExpressionToken token) {
        return new VariableNode(new Type<>(token.getDouble()));
    }

}
