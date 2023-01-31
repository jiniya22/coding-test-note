package codility.lesson8;

public class DominatorExample {
    public static void main(String[] args) {
        System.out.println(dominator(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
        System.out.println(dominator(new int[]{1, 4, 1, 2, 1}));
        System.out.println(dominator(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
        System.out.println(dominator(new int[]{0,0,1,1}));
    }

    static int dominator(int[] A) {
        if(A == null) return -1;
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
        if(size < 1) return -1;
        int count = 0, index = -1;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == leader) {
                count++;
                index = i;
            }
        }
        return count > A.length/2 ? index : -1;
    }
}
