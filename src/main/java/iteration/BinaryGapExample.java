package iteration;

public class BinaryGapExample {
    public static void main(String[] args) {
        System.out.println(binaryGap(529));
        System.out.println(binaryGap(32));
        System.out.println(binaryGap(51712));
        System.out.println(binaryGap(1041));
    }

    static int binaryGap(int N) {
        if(N < 2) return 0;
        String s = Integer.toBinaryString(N);
        int result = 0;

        boolean flag = false;
        int temp = 0;
        for (char i : s.toCharArray()) {
            if (i == '0') {
                if(!flag) {
                    continue;
                }
                temp++;
            } else {
                flag = true;
                if (temp > result) {
                    result = temp;
                }
                temp = 0;
            }
        }
        return result;
    }

}
