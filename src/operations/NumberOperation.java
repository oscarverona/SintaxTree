package operations;

import anotations.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import type.Type;
import type.TypeOperator;

public class NumberOperation implements Operation {
    private final Character symbol;
    private static final HashMap<String, Method> methodsMap = new HashMap<>();
    private static final HashMap<Character, String> operationsMap = new HashMap<>();

    static {
        for (Method method : TypeOperator.class.getMethods()) {
            if (method.isAnnotationPresent(Operator.class)) {
                methodsMap.put(getSignature(method), method);

                Operator annotation = method.getAnnotation(Operator.class);
                operationsMap.put(annotation.symbol(), method.getName());
            }
        }
    }

    public NumberOperation(Character symbol) {
        this.symbol = symbol;

    }

    private static String getSignature(Method method) {
        String name = method.getName();
        for (Class<?> parameter : method.getParameterTypes()) {
            name += parameter.getSimpleName();
        }
        return name;
    }

    public Type calculate(Type operand1, Type operand2) {
        String signature = operationsMap.get(symbol) + operand1.getSimpleClassName() +
               operand2.getSimpleClassName();

        Method method = methodsMap.get(signature);
        try {
            Object result =  method.invoke(new TypeOperator(),
                                     operand1.getValue(),
                                     operand2.getValue());

            return new Type<>(result);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(NumberOperation.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
