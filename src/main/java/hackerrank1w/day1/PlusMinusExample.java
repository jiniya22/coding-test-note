package hackerrank1w.day1;

import java.util.ArrayList;
import java.util.List;

public class PlusMinusExample {
    public static void main(String[] args) {
        plusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }

    static void plusMinus(List<Integer> arr) {
        double totalSize = (double) arr.size();
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();
        arr.forEach(i -> {
            if (i > 0) {
                positives.add(i);
            } else if (i < 0) {
                negatives.add(i);
            } else {
                zeros.add(i);
            }
        });
        print(positives.size()/totalSize);
        print(negatives.size()/totalSize);
        print(zeros.size()/totalSize);
    }

    static void print(double d) {
        System.out.printf("%.6f%n", d);
    }
}
