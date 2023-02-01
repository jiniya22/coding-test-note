package programmers.lv1.array;

import java.util.Arrays;

/**
 * 과일 장수
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/135808">...</a>
 */
public class FruitSellerExample {
    public static void main(String[] args) {
        System.out.println(solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));

    }

    /**
     * 배열 총 길이에서, 개수 m을 뺀 것 부터 시작.
     * @param k
     * @param m
     * @param score
     * @return
     */
    static int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int result = 0;
        for (int i = score.length - m; i >= 0; i -= m) {
            result += score[i] * m;
        }
        return result;
    }

}
