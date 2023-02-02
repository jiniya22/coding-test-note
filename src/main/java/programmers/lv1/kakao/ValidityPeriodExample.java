package programmers.lv1.kakao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 개인정보 수집 유효기간
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/150370">...</a>
 */
public class ValidityPeriodExample {

    static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"},
                new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
    }

    static int[] solution(String today, String[] terms, String[] privacies) {
        LocalDate dateToday = LocalDate.parse(today, dateTimeFormatter);

        Map<String, Integer> map = new HashMap<>();
        for (String privacy : terms) {
            String[] arr = privacy.split(" ");
            map.put(arr[0], Integer.parseInt(arr[1]));
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            LocalDate expireDate = LocalDate.parse(arr[0], dateTimeFormatter)
                    .plusMonths(map.get(arr[1]))
                    .minusDays(1);
            if(expireDate.isBefore(dateToday))
                result.add(i + 1);
        }

        return result.stream().mapToInt(m -> m).toArray();
    }
}
