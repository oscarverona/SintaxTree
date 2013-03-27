package operations;

import anotations.OperatorSymbol;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import type.NumberTypeOperator;
import type.Type;

public class Calculator {

    private final Operator operation;
    private static final HashMap<String, Method> methodsMap = new HashMap<>();
    private static final HashMap<Character, String> operationsMap = new HashMap<>();

    static {
        for (Method method : NumberTypeOperator.class.getMethods()) {
            if (method.isAnnotationPresent(OperatorSymbol.class)) {
                methodsMap.put(getSignature(method), method);
                operationsMap.put(method.getAnnotation(OperatorSymbol.class).symbol(),
                        method.getName());
            }
        }
    }

    public Calculator(Operator operation) {
        this.operation = operation;
    }

    private static String getSignature(Method method) {
        String name = method.getName();
        for (Class<?> parameter : method.getParameterTypes()) {
            name += parameter.getSimpleName();
        }
        return name;
    }

    public Type calculate(Type operand1, Type operand2) {
        Method method = methodsMap.get(buildSignature(operand1, operand2));
        try {
            Object result = method.invoke(new NumberTypeOperator(),
                    operand1.getValue(),
                    operand2.getValue());

            return new Type<>(result);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public Operator getOperation() {
        return operation;
    }

    private String buildSignature(Type arg1, Type arg2) {
        return operationsMap.get(operation.getSymbol()) + arg1.getSimpleClassName()
                + arg2.getSimpleClassName();
    }

    @Override
    public String toString() {
        return String.valueOf(operation.getSymbol());
    }
}
