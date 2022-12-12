package bit;

public class SumBinariesExample {
    public static void main(String[] args) {
        System.out.println(sum(13, 8));
    }

    /**
     * 정수 q, p를 이진 표현을 활용하여 더하는 코드
     * @param q
     * @param p
     * @return
     */
    static int sum(int q, int p) {
        int and = q & p;
        int xor = q ^ p;
        int temp;

        while (and != 0) {
            and = and << 1;
            temp = xor ^ and;
            and = xor & and;
            xor = temp;
        }
        return xor;
    }
}
