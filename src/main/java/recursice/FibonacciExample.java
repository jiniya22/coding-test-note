package recursice;

public class FibonacciExample {
    public static void main(String[] args) {
        System.out.println(F1.fibonacci(8));
        System.out.println(F1.fibonacci(10));

        System.out.println();

        System.out.println(F2.fibonacci(8));
        System.out.println(F2.fibonacci(10));

        System.out.println();

        System.out.println(F3.fibonacci(8));
        System.out.println(F3.fibonacci(10));
    }
}

class F1 {
    /**
     * 재귀 함수를 이용한 fibonacci 수
     */
    public static int fibonacci(int k) {
        if (k <= 1) {
            return k;
        }
        return fibonacci(k - 2) + fibonacci(k - 1);
    }
}

class F2 {
    /**
     * 동적 프로그래밍 메모이제이션 을 이용한 fibonacci 수
     */
    public static int fibonacci(int k) {
        return fibonacci(k, new int[k + 1]);
    }

    public static int fibonacci(int k, int[] cache) {
        if (k <= 1) {
            return k;
        } else if (cache[k] > 0) {
            return cache[k];
        }
        cache[k] = fibonacci(k - 2, cache) + fibonacci(k - 1, cache);
        return cache[k];
    }
}

class F3 {
    /**
     * 동적 프로그래밍 타뷸레이션을 이용한 fibonacci 수
     */
    public static int fibonacci(int k) {
        if (k <= 1) {
            return k;
        }
        int first = 1;
        int second = 0;
        int result = 0;

        for (int i = 1; i < k; i++) {
            result = first + second;
            second = first;
            first = result;
        }
        return result;
    }
}