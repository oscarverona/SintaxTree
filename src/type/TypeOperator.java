package type;

import anotations.Operator;

public class TypeOperator {

    @Operator(symbol='+')
    public Integer add(Integer operand1, Integer operand2) {
        return operand1 + operand2;
    }

    @Operator(symbol='+')
    public Double add(Integer operand1, Double operand2) {
        return operand1 + operand2;
    }

    @Operator(symbol='+')
    public Double add(Double operand1, Integer operand2) {
        return operand1 + operand2;
    }

    @Operator(symbol='+')
    public Double add(Double operand1, Double operand2) {
        return operand1 + operand2;
    }

    @Operator(symbol='-')
    public Integer subtract(Integer operand1, Integer operand2) {
        return operand1 - operand2;
    }

    @Operator(symbol='-')
    public Double subtract(Double operand1, Integer operand2) {
        return operand1 - operand2;
    }

    @Operator(symbol='-')
    public Double subtract(Integer operand1, Double operand2) {
        return operand1 - operand2;
    }

    @Operator(symbol='-')
    public Double subtract(Double operand1, Double operand2) {
        return operand1 - operand2;
    }

    @Operator(symbol='/')
    public Integer divide(Integer operand1, Integer operand2) {
        return operand1 / operand2;
    }

    @Operator(symbol='/')
    public Double divide(Integer operand1, Double operand2) {
        return operand1 / operand2;
    }

    @Operator(symbol='/')
    public Double divide(Double operand1, Integer operand2) {
        return operand1 / operand2;
    }

    @Operator(symbol='/')
    public Double divide(Double operand1, Double operand2) {
        return operand1 / operand2;
    }

    @Operator(symbol='*')
    public Integer multiply(Integer operand1, Integer operand2) {
        return operand1 * operand2;
    }

    @Operator(symbol='*')
    public Double multiply(Integer operand1, Double operand2) {
        return operand1 * operand2;
    }

    @Operator(symbol='*')
    public Double multiply(Double operand1, Integer operand2) {
        return operand1 * operand2;
    }


    @Operator(symbol='*')
    public Double multiply(Double operand1, Double operand2) {
        return operand1 * operand2;
    }

    /*public Integer add(Integer operand1, Integer operand2);

    public Double add(Integer operand1, Double operand2);

    public Double add(Double operand1, Integer operand2);

    public Double add(Double operand1, Double operand2);


    public Integer subtract(Integer operand1, Integer operand2);

    public Double subtract(Double operand1, Integer operand2);

    public Double subtract(Integer operand1, Double operand2);

    public Double subtract(Double operand1, Double operand2);


    public Integer divide(Integer operand1, Integer operand2);

    public Double divide(Integer operand1, Double operand2);

    public Double divide(Double operand1, Integer operand2);

    public Double divide(Double operand1, Double operand2);


    public Integer multiply(Integer operand1, Integer operand2);

    public Double multiply(Integer operand1, Double operand2);

    public Double multiply(Double operand1, Integer operand2);

    public Double multiply(Double operand1, Double operand2);*/


    /*private static final HashMap<String, Method> methodsMap = new HashMap<>();
     static {
     for (Method method: TypeOperator.class.getMethods()){
     if (method.isAnnotationPresent(Operator.class)){
     methodsMap.put(getSignature(method), method);
     }
     }
     }

     private static String getSignature(Method method) {
     String name = method.getName();
     for (Class<?> parameter: method.getParameterTypes()){
     name += parameter.getSimpleName();
     }
     return name;
     }

     public Object add(Type p0, Type p1){
     try {
     String signature = "add"+p0.getSimpleClassName()+p1.getSimpleClassName();
     Method method = methodsMap.get(signature);
     return method.invoke(this, p0.getValue(), p1.getValue());

     } catch (IllegalAccessException | IllegalArgumentException |
     InvocationTargetException ex) {
     System.out.println(ex);
     return null;
     }
     }

     @Operator(symbol="+")
     public Double add(Double p0, Double p1){
     return p0 + p1;
     }

     @Operator(symbol="+")
     public Integer add(Integer p0, Integer p1){
     return p0 + p1;
     }

     @Operator(symbol="+")
     public Double add(Double p0, Integer p1){
     return p0 + p1;
     }

     @Operator(symbol="+")
     public Double add(Integer p0, Double p1){
     return p0 + p1;
     }*/
}
