package bit;

public class SubstractBinariesExample {
    public static void main(String[] args) {
//        System.out.println(substract(13, 8));
        System.out.println(substract(109, 51));
    }

    /**
     * 정수 q, p를 이진 표현을 활용하여 빼는 코드
     * @param q
     * @param p
     * @return
     */
    static int substract(int q, int p) {
        while (p != 0) {
            int borrow = ~q & p;
            q = q ^ p;
            p = borrow << 1;
        }
        return q;
    }
}
