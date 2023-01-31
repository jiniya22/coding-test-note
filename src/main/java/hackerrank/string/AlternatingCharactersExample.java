package hackerrank.string;

/**
 * 중복 문자 제거하기
 */
public class AlternatingCharactersExample {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("ABABABAB"));
        System.out.println(alternatingCharacters("BABABA"));
        System.out.println(alternatingCharacters("AAABBB"));
        System.out.println(alternatingCharacters("A"));
    }

    static int alternatingCharacters(String s) {
        if(s.length() == 1) return 1;
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}
