package codility.lesson8;

public class EquiLeaderExample {
    public static void main(String[] args) {
//        System.out.println(equiLeader(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
        System.out.println(equiLeader(new int[]{4, 3, 4, 4, 4, 2}));
        System.out.println(equiLeader(new int[]{4, 4, 2, 5, 3, 4, 4, 4}));
//        System.out.println(equiLeader(new int[]{0,0,1,1}));
    }

    static int equiLeader(int[] A) {
        int leader = 0, size = 0;
        for (int a : A) {
            if (size == 0) {
                size++;
                leader = a;
            } else {
                if (leader == a) {
                    size++;
                } else {
                    size--;
                }
            }
        }
        if(size < 1) return 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == leader) {
                count++;
            }
        }
        if(count <= A.length/2)
            return 0;
        int result = 0, temp = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == leader) {
                temp++;
            }
            if((i + 1) / 2 < temp && (A.length - (i + 1))/2 < count - temp) {
                result++;
            }
        }

        return result;
    }
}
