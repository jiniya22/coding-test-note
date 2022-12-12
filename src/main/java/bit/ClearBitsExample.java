package bit;

public class ClearBitsExample {
    public static void main(String[] args) {
        int n = 423, k = 5;
        System.out.println(clearFromMsb(n, k));
        System.out.println(clearFromPosition(n, 7));
    }

    /**
     * MSB(최상위 비트)부터 k 위치까지 0으로 초기화하기
     * @param n
     * @param k
     * @return
     */
    static int clearFromMsb(int n, int k) {
        System.out.printf(":: 최상위 비트부터 k 위치(%d)까지 0으로 초기화하기\n", k);
        if (k < 0 || k > 31) {
            throw new IllegalArgumentException("k값은 0 ~ 31 사이의 정수여야 합니다.");
        }
        int result = n & ((1 << k) - 1);
        System.out.println(Integer.toBinaryString(n) + "\tn");
        System.out.printf("%09d\tresult\n", Integer.parseInt(Integer.toBinaryString(result)));
        return result;
    }

    /**
     * k 위치부터 LSB(최하위비트) 까지 0으로 초기화하기
     * @param n
     * @param k
     * @return
     */
    static int clearFromPosition(int n, int k) {
        System.out.printf(":: k 위치(%d)부터 최하위 비트까지 0으로 초기화하기\n", k);
        if (k < 0 || k > 31) {
            throw new IllegalArgumentException("k값은 0 ~ 31 사이의 정수여야 합니다.");
        }
        int result = n & (-1 << (k + 1));
        System.out.println(Integer.toBinaryString(n) + "\tn");
        System.out.printf("%09d\tresult\n", Integer.parseInt(Integer.toBinaryString(result)));
        return result;
    }

}
