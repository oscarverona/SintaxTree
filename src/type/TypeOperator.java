package type;

import anotations.Operator;

public class TypeOperator {

    @Operator(symbol = '+')
    public Integer add(Integer operand1, Integer operand2) {
        return operand1 + operand2;
    }

    @Operator(symbol = '+')
    public Double add(Integer operand1, Double operand2) {
        return operand1 + operand2;
    }

    @Operator(symbol = '+')
    public Double add(Double operand1, Integer operand2) {
        return operand1 + operand2;
    }

    @Operator(symbol = '+')
    public Double add(Double operand1, Double operand2) {
        return operand1 + operand2;
    }

    @Operator(symbol = '-')
    public Integer subtract(Integer operand1, Integer operand2) {
        return operand1 - operand2;
    }

    @Operator(symbol = '-')
    public Double subtract(Double operand1, Integer operand2) {
        return operand1 - operand2;
    }

    @Operator(symbol = '-')
    public Double subtract(Integer operand1, Double operand2) {
        return operand1 - operand2;
    }

    @Operator(symbol = '-')
    public Double subtract(Double operand1, Double operand2) {
        return operand1 - operand2;
    }

    @Operator(symbol = '/')
    public Integer divide(Integer operand1, Integer operand2) {
        return operand1 / operand2;
    }

    @Operator(symbol = '/')
    public Double divide(Integer operand1, Double operand2) {
        return operand1 / operand2;
    }

    @Operator(symbol = '/')
    public Double divide(Double operand1, Integer operand2) {
        return operand1 / operand2;
    }

    @Operator(symbol = '/')
    public Double divide(Double operand1, Double operand2) {
        return operand1 / operand2;
    }

    @Operator(symbol = '*')
    public Integer multiply(Integer operand1, Integer operand2) {
        return operand1 * operand2;
    }

    @Operator(symbol = '*')
    public Double multiply(Integer operand1, Double operand2) {
        return operand1 * operand2;
    }

    @Operator(symbol = '*')
    public Double multiply(Double operand1, Integer operand2) {
        return operand1 * operand2;
    }

    @Operator(symbol = '*')
    public Double multiply(Double operand1, Double operand2) {
        return operand1 * operand2;
    }
}
