package prefixsum;

public class CountDivExample {
    public static void main(String[] args) {
        System.out.println(countDiv(6, 6, 1));
        System.out.println(countDiv(6, 11, 2));
        System.out.println(countDiv(6, 10, 2));
        System.out.println(countDiv(4, 39, 5));
    }

    static int countDiv(int A, int B, int K) {
        int n1 = A % K == 0 ? A / K - 1 : A / K;
        int n2 = B / K;
        return n2 - n1;
    }
}
