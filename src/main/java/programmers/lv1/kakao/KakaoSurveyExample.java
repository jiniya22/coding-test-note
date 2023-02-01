package programmers.lv1.kakao;

import java.util.HashMap;
import java.util.Map;

/**
 * 카카오 성격 유형 검사
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/118666">...</a>
 */
public class KakaoSurveyExample {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5}));
        System.out.println(solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3}));
    }

    static String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();

        int[] scores = new int[]{3, 2, 1, 0, 1, 2, 3};
        Map<Character, Integer> map = new HashMap<>(
                Map.of('R', 0, 'T', 0, 'C', 0, 'F', 0,
                        'J', 0, 'M', 0, 'A', 0, 'N', 0));

        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            if(choice == 4)
                continue;

            char type = survey[i].charAt(0);
            int newScore = scores[choice - 1];
            if(choice > 4) {
                type = survey[i].charAt(1);
            }
            map.put(type, map.get(type) + newScore);
        }

        sb.append(map.get('R') >= map.get('T') ? 'R' : 'T');
        sb.append(map.get('C') >= map.get('F') ? 'C' : 'F');
        sb.append(map.get('J') >= map.get('M') ? 'J' : 'M');
        sb.append(map.get('A') >= map.get('N') ? 'A' : 'N');
        return sb.toString();
    }
}
