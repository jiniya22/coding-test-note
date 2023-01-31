package codility.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NumberOfDiscIntersectionsExample {

    public static void main(String[] args) {
        System.out.println(numberOfDiscIntersections(new int[]{1, 5, 2, 1, 4, 0}));
    }

    static int numberOfDiscIntersections(int[] A) {
        int result = 0;
        int N = A.length;
        long[] lower = new long[N];
        long[] upper = new long[N];

        for (int i = 0; i < N; i++) {
            lower[i] = (long) i - A[i];
            upper[i] = (long) i + A[i];
        }
        Arrays.sort(lower);
        Arrays.sort(upper);

        int j = 0;
        for (int i = 0; i < N; i++) {
            while (j < N && upper[i] >= lower[j]) {
                result += (j - i);
                if (result > 10000000)
                    return -1;
                j++;
            }
        }

        return result;
    }


    /**
     * O(N**2), timeout
     * @param A
     * @return
     */
    static int numberOfDiscIntersections2(int[] A) {
        int result = 0;
        List<long[]> pairs = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            pairs.add(new long[]{(long)i - A[i], (long)i + A[i]});
        }
        pairs.sort(Comparator.comparingLong(a -> a[0])); // asc

        for (int i = 0; i < pairs.size() - 1; i++) {
            for (int j = i + 1; j < pairs.size(); j++) {
                if(pairs.get(i)[1] < pairs.get(j)[0])
                    break;
                if(result > 10000000)
                    return -1;
                result++;
            }
        }

        return result;
    }
}
