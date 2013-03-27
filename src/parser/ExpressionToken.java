package parser;

import java.util.HashMap;
import java.util.Map;

public class ExpressionToken {

    private String token;
    private static final Map<String, int[]> operators = new HashMap<>();

    static {
        operators.put("+", new int[]{Precedence.LOW, Associativity.LEFT});
        operators.put("-", new int[]{Precedence.LOW, Associativity.LEFT});
        operators.put("*", new int[]{Precedence.HIGH, Associativity.LEFT});
        operators.put("/", new int[]{Precedence.HIGH, Associativity.LEFT});
    }

    public ExpressionToken(String token) {
        this.token = token;
    }

    public boolean isOperator() {
        return operators.containsKey(token);
    }

    public boolean isLeftBracket(){
        return token.equals("(");
    }

    public boolean isRightBracket(){
        return token.equals(")");
    }

    public boolean isAssociativeLeft() {
        return isAssociative(Associativity.LEFT);
    }

    public boolean isAssociativeRight() {
        return isAssociative(Associativity.RIGHT);
    }

    private boolean isAssociative(int type) {
        if (!isOperator()) {
            throw new IllegalArgumentException("Invalid token: " + token);
        }
        return (operators.get(token)[1] == type) ? true : false;
    }

    public Character asCharacter() {
        return token.charAt(0);
    }

    public Object getDouble() {
        return Double.valueOf(token);
    }

    public String getValue() {
        return token;
    }

    public int getPrecedence() {
        return operators.get(token)[0];
    }

}
