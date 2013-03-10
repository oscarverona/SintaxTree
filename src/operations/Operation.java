package operations;

public class Operation {
    
    public static final Operation MULTIPLY = new Operation('*', 3);
    public static final Operation DIVIDE = new Operation('/', 3);
    public static final Operation ADD = new Operation('+', 4);
    public static final Operation SUBTRACT = new Operation('-', 4);
    public static final Operation AND = new Operation('&', 8);
    public static final Operation OR = new Operation('|', 10);
    private Character symbol;
    private int priority;

    public Operation(Character symbol, int priority) {
        this.symbol = symbol;
        this.priority = priority;
    }

    public Character getSymbol() {
        return symbol;
    }

    public int getPriority() {
        return priority;
    }
}
