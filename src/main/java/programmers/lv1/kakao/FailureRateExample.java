package programmers.lv1.kakao;

import java.util.*;

/**
 * 실패율
 * 실패율이 높은 스테이지부터 내림차순으로 스테이지 번호가 담겨있는 배열을 리턴하는 코드를 작성하라
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42889">...</a>
 */
public class FailureRateExample {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(solution(4, new int[]{4, 4, 4, 4, 4})));
        System.out.println(Arrays.toString(solution(3, new int[]{4, 4, 4, 4, 4})));
        System.out.println(Arrays.toString(solution(500, new int[]{4, 3, 4, 4, 4})));
    }

    /**
     *
     * @param N 총 스테이지 수
     * @param stages 사용자가 멈춰있는 스테이지(모두 클리어한 경우에는 N+1)
     * @return 실패율이 높은 스테이지부터 내림차순, 만일 실패율이 같다면 번호 순으로 오름차순
     */
    static int[] solution(int N, int[] stages) {
        int[] counter = new int[N + 2]; // N + 1 까지의 스테이지 카운트를 저장
        for (int stage : stages) {
            counter[stage]++;
        }

        Queue<FailureRate> queue = new PriorityQueue<>();
        int num = counter[N + 1];  // 계산된 사람 수
        for(int i = N; i > 0; i--) {
            num += counter[i];
            double rate = num == 0 ? 0 : counter[i]/(double)num;
            queue.add(new FailureRate(rate, i));
        }

        int[] answer = new int[N];
        int i = 0;
        while(!queue.isEmpty()) {
            answer[i++] = queue.poll().getStage();
        }
        return answer;
    }
}

class FailureRate implements Comparable<FailureRate> {
    private double rate;
    private int stage;

    public FailureRate(double rate, int stage) {
        this.rate = rate;
        this.stage = stage;
    }

    public int getStage() {
        return stage;
    }

    @Override
    public int compareTo(FailureRate o2) {
        int res = Double.compare(o2.rate, this.rate);
        if(res != 0) {
            return res;
        } else {
            return Integer.compare(this.stage, o2.stage);
        }
    }

    @Override
    public String toString() {
        return "{" +
                "rate=" + rate +
                ", stage=" + stage +
                '}';
    }
}