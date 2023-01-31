package codility.lesson3;

public class PermMissingElemExample {
    public static void main(String[] args) {
        System.out.println(permMissingElem(new int[]{2, 3, 1, 4}));
    }

    static int permMissingElem(int[] A) {
        int result = 0;
        int[] arr = new int[A.length + 1];
        for (int i : A) {
            arr[i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result = i + 1;
                break;
            }
        }
        return result;
    }
}
