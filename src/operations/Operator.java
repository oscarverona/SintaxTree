package operations;

import java.util.HashMap;
import java.util.Map;

public class Operator {

    public static final Operator MULTIPLY = new Operator('*', 3);
    public static final Operator DIVIDE = new Operator('/', 3);
    public static final Operator ADD = new Operator('+', 2);
    public static final Operator SUBTRACT = new Operator('-', 2);
    public static final Operator AND = new Operator('&', 1);
    public static final Operator OR = new Operator('|', 1);
    private Character symbol;
    private int priority;

    private static final Map<Character, Operator> operators = new HashMap<>();

    static {
        operators.put('+', ADD);
        operators.put('-', SUBTRACT);
        operators.put('*', MULTIPLY);
        operators.put('/', DIVIDE);
    }

    public Operator(Character symbol, int priority) {
        this.symbol = symbol;
        this.priority = priority;
    }

    public Operator(Character symbol) {
        this.symbol = operators.get(symbol).getSymbol();
        priority = operators.get(symbol).getPriority();
    }

    public Character getSymbol() {
        return symbol;
    }

    public int getPriority() {
        return priority;
    }
}
