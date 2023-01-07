package prefixsum;

public class PassingCarsExample {
    public static void main(String[] args) {
        System.out.println(passingCars(new int[]{0, 1, 0, 1, 1}));
    }

    static int passingCars(int[] A) {
        int result = 0;
        int east = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                east++;
            } else {
                result += east;
            }
            if(result > 1000000000) {
                return -1;
            }
        }
        return result;
    }
}
