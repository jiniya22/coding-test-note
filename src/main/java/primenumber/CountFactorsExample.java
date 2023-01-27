package primenumber;

public class CountFactorsExample {
    public static void main(String[] args) {
        System.out.println(countFactors(17));
        System.out.println(countFactors(24));
        System.out.println(countFactors(25));
        System.out.println(countFactors(Integer.MAX_VALUE));
    }

    static int countFactors(int N) {
        int result = 0;
        long i = 1;
        while (i * i < N) {
            if(N % i == 0)
                result += 2;
            i++;
        }
        if (i * i == N) {
            result++;
        }
        return result;
    }

    static void overflow() {
        System.out.println(46340*46340);    // 2147395600
        System.out.println(46341*46341);    // -2147479015
        System.out.println(Integer.MAX_VALUE);  // 2147483647
    }
}
