package programmers.lv1.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 가장 가까운 같은 글자
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/142086">...</a>
 */
public class NearestSameLetterExample {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("foobar")));

    }

    static int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(s.charAt(i));
            }
            map.put(s.charAt(i), i);
        }
        return answer;
    }
}
