package hackerrank.array;

import java.util.ArrayList;
import java.util.List;

/**
 * swap이 2번 이상 된 경우 "Too chaotic" 출력
 */
public class NewYearChaosExample {

    public static void main(String[] args) {
        minimumBribes(new ArrayList<>(List.of(1, 2, 3, 5, 4, 6, 7, 8))); // 1
        minimumBribes(new ArrayList<>(List.of(4, 1, 2, 3))); // Too chaotic
        minimumBribes(new ArrayList<>(List.of(2, 1, 5, 3, 4))); // 3
        minimumBribes(new ArrayList<>(List.of(2, 5, 1, 3, 4))); // Too chaotic
        minimumBribes(new ArrayList<>(List.of(1, 2, 5, 3, 7, 8, 6, 4))); // 7
    }

    static void minimumBribes(List<Integer> q) {
        int cnt = 0;
        for(int i = q.size() - 1; i >= 0; i--) {
            if(q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j <= i; j++) {
                if (q.get(j) > q.get(i)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

}
