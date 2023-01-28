package hackerrank1w.day3;

public class TowerBreakersExample {
    public static void main(String[] args) {
        System.out.println(towerBreakers(2, 2));
        System.out.println(towerBreakers(1, 4));
    }

    /**
     *
     * @param n 타워 개수
     * @param m 타워 높이
     * @return 이긴 플레이어
     */
    static int towerBreakers(int n, int m) {
        return m < 2 || n % 2 == 0 ? 2 : 1;
    }
}
