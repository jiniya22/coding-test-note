package programmers.lv1.string;

/**
 * 크기가 작은 부분 문자열
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/147355">...</a>
 */
public class SubStringExample {
    public static void main(String[] args) {
//        System.out.println(solution("271", "270"));
//        System.out.println(solution("14", "14"));
//        System.out.println(solution("2", "3"));
////        System.out.println();
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));
    }

    static int solution(String t, String p) {
        if(p.length() == t.length())
            return t.compareTo(p) <= 0 ? 1 : 0;

        int answer = 0;
        int current = 0;
        while (current <= t.length() - p.length()) {
            String temp = t.substring(current, current + p.length());
            if(temp.compareTo(p) <= 0)
                answer++;
            current++;
        }
        return answer;
    }
}
