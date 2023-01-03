package recursice;

/**
 * 막대 A, B, C가 있고, 하나의 막대에는 n개의 원반이 오름차순으로 배치되어있습니다.<br>
 * 가장 작은 원반 1 부터 가장 큰 원반 n까지, 가장 작은 원반이 맨위에 가장 작은 원반이 맨 아래에 있습니다.<br>
 * <ul>
 *     <li>한번에는 하나의 원반만 옮길 수 있습니다.</li>
 *     <li>한 막대의 가장 위에 있는 원반은 다른 막대로 옮길 수 있습니다.</li>
 *     <li>모든 원반은 무조건 오름차순으로 놓일 수 있습니다.(= 큰 원빈이 위에 있을 수 없습니다.)</li>
 * </ul>
 * 위의 규칙을 따르면서 막대 A에 있는 원반을 다른 막대로 모두 옮기는 방법을 구하라
 * f(n) = 1 + 2 * f(n-1)
 */
public class HanoiExample {
    public static void main(String[] args) {
        int n = 5;
        Hanoi.moveDisks(n, 'A', 'C', 'B');
        Hanoi.printCount();
    }
}

class Hanoi {
    static int cnt = 0;

    public static void moveDisks(int n, char origin, char target, char intermediate) {
        if (n <= 0) {
            return;
        }
        cnt++;
        if (n == 1) {
            System.out.printf("%c에서 %c로 %d번 원반을 옮겼습니다.\n", origin, target, n);
            return;
        }
        moveDisks(n - 1, origin, intermediate, target);

        System.out.printf("%c에서 %c로 %d번 원반을 옮겼습니다.\n", origin, target, n);

        moveDisks(n - 1, intermediate, target, origin);
    }

    public static void printCount() {
        System.out.printf(":: 총 %d 번 움직였습니다.\n", cnt);
    }
}
