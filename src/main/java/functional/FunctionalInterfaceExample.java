package functional;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        PlusCalculator<Integer> plusInteger = (x, y) -> x + y;
        int x = 4, y = 5;

        System.out.println(plusInteger.plus(x, y));
        plusInteger.introduce(x, y);
    }
}

@FunctionalInterface
interface PlusCalculator<T extends Number> {
    T plus(T x, T y);

    default void introduce(T x, T y) {
        System.out.printf("%s, %s\n", x, y);
    }
}
