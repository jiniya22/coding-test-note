package bit;

public class SetBitValueExample {
    public static void main(String[] args) {
        int n = 423, k = 7;
        System.out.println(setBitValue0(n, 7));
        System.out.println(setBitValue1(n, 6));
    }

    /**
     * 정수 n, k 위치의 비트값을 0으로 설정하기
     * @param n
     * @param k
     * @return
     */
    static int setBitValue0(int n, int k) {
        System.out.printf(":: k 위치(%d)에 1로 설정하기\n", k);
        if (k < 0 || k > 31) {
            throw new IllegalArgumentException("k값은 0 ~ 31 사이의 정수여야 합니다.");
        }
        int result = n & ~(1 << k);
        System.out.println(Integer.toBinaryString(n) + "\tn");
        System.out.println(Integer.toBinaryString(result) + "\tresult");
        return result;
    }

    /**
     * 정수 n, k 위치의 비트값을 1로 설정하기
     * @param n
     * @param k
     * @return
     */
    static int setBitValue1(int n, int k) {
        System.out.printf(":: k 위치(%d)에 1로 설정하기\n", k);
        if (k < 0 || k > 31) {
            throw new IllegalArgumentException("k값은 0 ~ 31 사이의 정수여야 합니다.");
        }
        int result = n | (1 << k);
        System.out.println(Integer.toBinaryString(n) + "\tn");
        System.out.println(Integer.toBinaryString(result) + "\tresult");
        return result;
    }
}
