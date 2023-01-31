package codility.lesson3;

public class PermMissingElemExample {
    public static void main(String[] args) {
        System.out.println(permMissingElem(new int[]{2, 3, 1, 4}));
    }

    static int permMissingElem(int[] A) {
        int result = 0;
        int[] arr = new int[A.length + 2];
        for (int a : A) {
            arr[a] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
               result = i;
               break;
            }
        }
        return result;
    }
}
