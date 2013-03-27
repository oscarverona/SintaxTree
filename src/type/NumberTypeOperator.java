package type;

import anotations.OperatorSymbol;
import operations.TypeOperator;

public class NumberTypeOperator extends TypeOperator{

    @OperatorSymbol(symbol = '+')
    public Integer add(Integer operand1, Integer operand2) {
        return operand1 + operand2;
    }

    @OperatorSymbol(symbol = '+')
    public Double add(Integer operand1, Double operand2) {
        return operand1 + operand2;
    }

    @OperatorSymbol(symbol = '+')
    public Double add(Double operand1, Integer operand2) {
        return operand1 + operand2;
    }

    @OperatorSymbol(symbol = '+')
    public Double add(Double operand1, Double operand2) {
        return operand1 + operand2;
    }

    @OperatorSymbol(symbol = '-')
    public Integer subtract(Integer operand1, Integer operand2) {
        return operand1 - operand2;
    }

    @OperatorSymbol(symbol = '-')
    public Double subtract(Double operand1, Integer operand2) {
        return operand1 - operand2;
    }

    @OperatorSymbol(symbol = '-')
    public Double subtract(Integer operand1, Double operand2) {
        return operand1 - operand2;
    }

    @OperatorSymbol(symbol = '-')
    public Double subtract(Double operand1, Double operand2) {
        return operand1 - operand2;
    }

    @OperatorSymbol(symbol = '/')
    public Integer divide(Integer operand1, Integer operand2) {
        return operand1 / operand2;
    }

    @OperatorSymbol(symbol = '/')
    public Double divide(Integer operand1, Double operand2) {
        return operand1 / operand2;
    }

    @OperatorSymbol(symbol = '/')
    public Double divide(Double operand1, Integer operand2) {
        return operand1 / operand2;
    }

    @OperatorSymbol(symbol = '/')
    public Double divide(Double operand1, Double operand2) {
        return operand1 / operand2;
    }

    @OperatorSymbol(symbol = '*')
    public Integer multiply(Integer operand1, Integer operand2) {
        return operand1 * operand2;
    }

    @OperatorSymbol(symbol = '*')
    public Double multiply(Integer operand1, Double operand2) {
        return operand1 * operand2;
    }

    @OperatorSymbol(symbol = '*')
    public Double multiply(Double operand1, Integer operand2) {
        return operand1 * operand2;
    }

    @OperatorSymbol(symbol = '*')
    public Double multiply(Double operand1, Double operand2) {
        return operand1 * operand2;
    }

    @OperatorSymbol(symbol = '&')
    public Boolean and(Boolean operand1, Boolean operand2) {
        return operand1 && operand2;
    }

    @OperatorSymbol(symbol = '|')
    public Boolean or(Boolean operand1, Boolean operand2) {
        return operand1 || operand2;
    }
}
