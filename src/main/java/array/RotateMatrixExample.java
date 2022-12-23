package array;

import java.util.Arrays;

public class RotateMatrixExample {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 29, 20}, {21, 22, 23, 24, 25}};
        System.out.println(m.length);
        ttt(m);
    }

    static void ttt(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        Arrays.stream(m).forEach(f -> System.out.println(Arrays.toString(f)));
    }
}
