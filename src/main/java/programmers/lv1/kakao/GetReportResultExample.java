package programmers.lv1.kakao;

import java.util.*;

/**
 * 신고 결과 받기
 * 신고처리가 되었을 경우, 신고를 보낸 사용자에게 확인 메일을 보냅니다.
 * 각 사용자별로 확인 메일을 받은 개수를 반환하는 코드
 *
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/92334">...</a>
 */
public class GetReportResultExample {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2)));
        System.out.println(Arrays.toString(solution(new String[]{"con", "ryan"},
                new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3)));

    }

    static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, List<String>> map = new HashMap<>();    // 신고당한 id, 신고한 id
        for (String id : id_list) {
            map.put(id, new ArrayList<>());
        }
        for (String s : report) {
            String[] ids = s.split(" ");    // 신고한 id, 신고당한 id
            List<String> list = map.get(ids[1]);
            if(!list.contains(ids[0]))
                list.add(ids[0]);
            map.put(ids[1], list);
        }

        Map<String, Integer> counter = new HashMap<>();
        map.entrySet().stream().filter(f -> f.getValue().size() >= k).forEach(entry -> {
            entry.getValue().forEach(value -> {
                counter.compute(value, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
            });
        });
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = counter.getOrDefault(id_list[i], 0);
        }
        return answer;
    }

}
