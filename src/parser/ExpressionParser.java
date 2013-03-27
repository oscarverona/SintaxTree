
package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import operations.Operator;
import tree.*;
import type.Type;

public class ExpressionParser {

    private static final Map<String, int[]> operators = new HashMap<>();

    static {
        operators.put("+", new int[]{Precedence.LOW, Associativity.LEFT});
        operators.put("-", new int[]{Precedence.LOW, Associativity.LEFT});
        operators.put("*", new int[]{Precedence.HIGH, Associativity.LEFT});
        operators.put("/", new int[]{Precedence.HIGH, Associativity.LEFT});
    }

    private static boolean isOperator(String token) {
        return operators.containsKey(token);
    }

    private static boolean isAssociative(String token, int type) {
        if (!isOperator(token)) {
            throw new IllegalArgumentException("Invalid token: " + token);
        }
        return (operators.get(token)[1] == type) ? true:false;
    }


    private static int comparePrecedence(String token1, String token2) {
        if (isOperator(token1) && isOperator(token2)) {
            return operators.get(token1)[0] - operators.get(token2)[0];
        }
         throw new IllegalArgumentException("Invalid tokens: " + token1 + " " + token2);
    }

    public static String[] reversePolishNotation(String[] inputTokens) {
        ArrayList<String> out = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for (String token : inputTokens) {
            if (isOperator(token)) {
                // While stack not empty AND stack top element
                // is an operator
                while (!stack.empty() && isOperator(stack.peek())) {
                    if ((isAssociative(token, Associativity.LEFT)
                            && comparePrecedence(token, stack.peek()) <= 0)
                            || (isAssociative(token, Associativity.RIGHT)
                            && comparePrecedence(token, stack.peek()) < 0)) {
                        out.add(stack.pop());
                        continue;
                    }
                    break;
                }
                // Push the new operator on the stack
                stack.push(token);
            } // If token is a left bracket '('
            else if (token.equals("(")) {
                stack.push(token);  //
            } // If token is a right bracket ')'
            else if (token.equals(")")) {
                while (!stack.empty() && !stack.peek().equals("(")) {
                    out.add(stack.pop());
                }
                stack.pop();
            } // If token is a number
            else {
                out.add(token);
            }
        }
        while (!stack.empty()) {
            out.add(stack.pop());
        }
        String[] output = new String[out.size()];
        return out.toArray(output);
    }

    public static Node parseToSintaxTree(String[] tokens){
        Stack<Node> stack = new Stack<>();
        Node node;
        for (String token : tokens) {
             if (isOperator(token)) {
                Character operatorChar = token.charAt(0);
                Node righttNode = stack.pop();
                Node leftNode = stack.pop();
                node = new BinaryOperation(new Operator(operatorChar), leftNode, righttNode);
             } else {
                node = new VariableNode(new Type<>(Double.valueOf(token)));
             }
             stack.push(node);
        }
        return stack.pop();
    }

    public static double RPNtoDouble(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            // If the token is a value push it onto the stack
            if (!isOperator(token)) {
                stack.push(token);
            } else {
                // Token is an operator: pop top two entries
                Double d2 = Double.valueOf(stack.pop());
                Double d1 = Double.valueOf(stack.pop());

                //Get the result
                Double result = token.compareTo("+") == 0 ? d1 + d2
                        : token.compareTo("-") == 0 ? d1 - d2
                        : token.compareTo("*") == 0 ? d1 * d2
                        : d1 / d2;

                // Push result onto stack
                stack.push(String.valueOf(result));
            }
        }

        return Double.valueOf(stack.pop());
    }
}
