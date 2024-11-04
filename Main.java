import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        System.out.println(Calculator.sum(10.6, 8));
        System.out.println(Calculator.subtract(10.6, 8));
        System.out.println(Calculator.divide(10.6, 8));
        System.out.println(Calculator.multiply(10.6, 0));


        String str = "world";
        Integer number = 125;
        Pair pair = new Pair<>(str, number);
        System.out.println(pair.toString());
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }

    public static  <T extends Objects> boolean compareArrays(T[] array, T[] array1 ){
        if (array.length != array1.length)
            return false;
        else {
            for (int i = 0; i < array.length; i++) {
                if (!array[i].getClass().equals(array1[i].getClass()))
                    return false;
            }
        }
        return true;
    }
}