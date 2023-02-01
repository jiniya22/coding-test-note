package hackerrank.warmup;

import java.util.List;

public class JumpingOnTheCloudsExample {

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(List.of(0, 1, 0, 0, 0, 1, 0)));  // 3
        System.out.println(jumpingOnClouds(List.of(0, 0, 2, 0, 0, 1, 0)));  // 4
    }

    static int jumpingOnClouds(List<Integer> c) {
        int result = 0;
        int current = 0;

        while (current < c.size() - 1) {
            if (current + 2 <= c.size() - 1 && c.get(current + 2) == 0) {
                result++;
                current += 2;
            } else if(c.get(current + 1) == 0) {
                result++;
                current++;
            }
        }
        return result;
    }

}
