package primenumber;

public class MinPerimeterRectangleExample {
    public static void main(String[] args) {
        System.out.println(minPerimeterRectangle(1));
        System.out.println(minPerimeterRectangle(30));
        System.out.println(minPerimeterRectangle(25));

    }

    static int minPerimeterRectangle(int N) {
        int result = (1 + N) * 2;
        int i = 2;
        while (i * i <= N) {
            if (N % i == 0) {
                result = (i + (N/i)) * 2;
            }
            i++;
        }
        return result;
    }
}
