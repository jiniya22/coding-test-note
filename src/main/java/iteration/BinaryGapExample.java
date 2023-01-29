package iteration;

import java.util.ArrayList;
import java.util.List;

public class BinaryGapExample {
    public static void main(String[] args) {
        System.out.println(binaryGap(529));
        System.out.println(binaryGap(32));
        System.out.println(binaryGap(51712));
        System.out.println(binaryGap(1041));
    }

    static int binaryGap(int N) {
        if (N <= 1) {
            return 0;
        }
        int result = 0;
        char[] arr = Integer.toBinaryString(N).toCharArray();
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                index.add(i);
            }
        }
        if (index.size() < 2) {
            return 0;
        }
        for (int i = 0; i < index.size() - 1; i++) {
            int value = index.get(i + 1) - index.get(i) - 1;
            if (result < value) {
                result = value;
            }
        }
        return result;
    }
}
