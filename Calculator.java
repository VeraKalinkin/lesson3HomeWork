public class Calculator {

    public static <T extends Number> double sum(T number, T number1){
        return number.doubleValue() + number1.doubleValue();
    }

    public static <T extends Number> double subtract(T number, T number1){
        return number.doubleValue() - number1.doubleValue();
    }

    public static <T extends Number> double multiply(T number, T number1){
        return number.doubleValue() * number1.doubleValue();
    }

    public static <T extends Number> double divide(T number, T number1){
        return number.doubleValue() / number1.doubleValue();
    }
}
