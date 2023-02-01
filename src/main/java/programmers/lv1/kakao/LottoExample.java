package programmers.lv1.kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 로또의 최고 순위와 최저 순위
 * https://school.programmers.co.kr/learn/courses/30/lessons/77484
 */
public class LottoExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}))); // 3, 5
        System.out.println(Arrays.toString(solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));  // 1, 6
        System.out.println(Arrays.toString(solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));  // 1, 6
        System.out.println(Arrays.toString(solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35})));  // 1, 1

    }

    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] rank = new int[]{6, 6, 5, 4, 3, 2, 1}; // 당첨 수 당 등수

        Map<Integer, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        for (int i : lottos) {
            map1.compute(i, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }
        for (int i : win_nums) {
            map2.compute(i, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        int cnt = 0, zero = 0;
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if(entry.getKey() == 0)
                zero = entry.getValue();
            if (map2.containsKey(entry.getKey())) {
                cnt++;
            }
        }

        answer[0] = rank[cnt + zero];
        answer[1] = rank[cnt];

        return answer;
    }
}
