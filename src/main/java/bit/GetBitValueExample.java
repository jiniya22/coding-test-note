package bit;

public class GetBitValueExample {
    public static void main(String[] args) {
        int n = 423, k = 7;
        System.out.println("1 & 110: " + (1 & 110));    // 0
        System.out.println("1 & 101: " + (1 & 101));    // 1
        System.out.println(getValue(n, k));
    }

    /**
     * 32 bit 정수 n
     * k 위치에 있는 비트값을 반환하는 코드를 작성하라.
     * @param n
     * @param k
     * @return
     */
    static char getValue(int n, int k) {
        if (k < 0 || k > 31) {
            throw new IllegalArgumentException("k값은 0 ~ 31 사이의 정수여야 합니다.");
        }
        int result = 1 & (n >> k);

        return result == 0 ? '0' : '1';
    }

}
