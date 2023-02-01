package hackerrank.array;

public class MinimumSwap2Example {
    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{4, 3, 1, 2}));
    }
    static int minimumSwaps(int[] arr) {
        if(arr.length == 1) return 0;
        int result = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            while (arr[i] != i + 1) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
                result++;
            }
        }
        return result;
    }
}
