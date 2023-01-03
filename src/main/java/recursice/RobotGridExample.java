package recursice;

import java.awt.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class RobotGridExample {
    public static void main(String[] args) {
        Set<Point> path = new LinkedHashSet<>(), failed = new LinkedHashSet<>();
        boolean[][] maze = new boolean[6][6];

        maze[2][0]=true;
        maze[3][2]=true;
        maze[3][4]=true;
        maze[3][3]=true;
        maze[4][5]=true;

//        RobotGrid1.computePath(5, 5, maze, path);
        RobotGrid2.computePath(5, 5, maze, path, failed);

        path.forEach(p -> {
            System.out.printf("(%d, %d), ", p.x, p.y);
        });
    }
}

class RobotGrid1 {
    /**
     * 재귀함수를 이용한 RobotGrid
     * @param m
     * @param n
     * @param maze 사전에 정의된 이동할 수 없는 칸
     * @param path 로봇이 가는 경로 (최종 적으로 구하고자 하는 값)
     * @return
     */
    public static boolean computePath(int m, int n, boolean[][] maze, Set<Point> path) {
        if (m < 0 || n < 0) {
            return false;
        }
        if (maze[m][n]) {
            return false;
        }
        if ((m == 0 && n == 0)
                || computePath(m - 1, n, maze, path)
                || computePath(m, n - 1, maze, path)) {
            path.add(new Point(m, n));
            return true;
        }
        return false;
    }

}

class RobotGrid2 {
    /**
     * 동적 프로그래밍 메모이제이션을 이용한 RobotGrid
     * @param m
     * @param n
     * @param maze 사전에 정의된 이동할 수 없는 칸
     * @param path 로봇이 가는 경로 (최종 적으로 구하고자 하는 값)
     * @param failed 이동할 수 없는 칸
     * @return
     */
    public static boolean computePath(int m, int n, boolean[][] maze, Set<Point> path, Set<Point> failed) {
        if (m < 0 || n < 0) {
            return false;
        }
        if (maze[m][n]) {
            return false;
        }

        Point point = new Point(m, n);
        if (failed.contains(point)) {
            return false;
        }

        if ((m == 0 && n == 0)
                || computePath(m - 1, n, maze, path, failed)
                || computePath(m, n - 1, maze, path, failed)) {
            path.add(point);
            return true;
        }

        failed.add(point);

        return false;
    }
}