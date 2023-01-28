package hackerrank1w.day3;

public class CaesarCipherExample {
    public static void main(String[] args) {
        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 3));
        System.out.println(caesarCipher("middle-Outz", 2));
        System.out.println(caesarCipher("www.abc.xy", 87));
    }

    /**
     *
     * @param s 원문
     * @param k shift 수
     */
    static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();
        k %= 26;
        for (char c : s.toCharArray()) {
            if(Character.isUpperCase(c) || Character.isLowerCase(c)) {
                int temp = c + k;
                if(Character.isUpperCase(c) && !Character.isUpperCase(temp)
                    || Character.isLowerCase(c) && !Character.isLowerCase(temp)) {
                    temp -= 26;
                }
                sb.append((char) temp);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
