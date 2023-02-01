package programmers.lv1.kakao;

/**
 * 신규 아이디 추천
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/72410">...</a>
 */
public class IdRecommendationTest {
    public static void main(String[] args) {
        System.out.println(solution("K_aka!o12@-"));
        System.out.println(solution("jini..Yoo2,"));
        System.out.println(solution(".jini^..roro."));
        System.out.println(solution("12345678901234567"));
        System.out.println(solution("12345678901234.67"));
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution(".%!&@b8"));
    }

    static String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9\\-_.]", "");
        answer = answer.replaceAll("\\.+", ".");
        answer = answer.replaceAll("^\\.", "").replaceAll("\\.$", "");
        if(answer.isEmpty()) answer = "a";
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if(answer.charAt(14) == '.')
                answer = answer.substring(0, 14);
        }
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        return answer;
    }
}
