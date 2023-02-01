package hackerrank.warmup;

public class RepeatedStringExample {
    public static void main(String[] args) {
        System.out.println(repeatedString("abcac", 10l));   // 4
        System.out.println(repeatedString("aba", 10l));     // 7
        System.out.println(repeatedString("a", 1000000000000l));    // 1000000000000
        System.out.println(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570l));  // 16481469408
    }

    static long repeatedString(String s, long n) {
        if(s.length() == 1) return "a".equals(s) ? n : 0;

        long multiple = n / s.length();
        long remain = n % s.length();

        long cnt = 0;
        long cnt2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                cnt++;
                if(i < remain) {
                    cnt2++;
                }
            }

        }
        return cnt * multiple + cnt2;
    }
}
