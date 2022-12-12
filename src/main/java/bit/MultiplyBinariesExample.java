package bit;

public class MultiplyBinariesExample {
    public static void main(String[] args) {
        System.out.println(multiply(13, 8));
    }

    /**
     * 정수 q, p를 이진 표현을 활용하여 곱하는 코드
     * @param q
     * @param p
     * @return
     */
    static int multiply(int q, int p) {
        int result = 0;
        while (p != 0) {
            if ((p & 1) != 0) {
                result += q;
            }

            q = q << 1;
            p = p >>> 1;
        }
        return result;
    }
}
