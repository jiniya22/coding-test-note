package functional;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        filterExample();
        distinctExample();
        sortExample();
        sortExample2();
        flatMapExampple();
        System.out.println();
        peekExample();
    }

    static void filterExample() {
        List<Integer> numbers = List.of(3, 11, 49, 22, 55, 1, 29, 4, 49);

        List<Integer> result = numbers.stream()
                .filter(f -> f > 20)
                .toList();
        System.out.println(result); // [49, 22, 55, 29, 49]
    }

    static void distinctExample() {
        List<Integer> numbers = List.of(3, 11, 49, 22, 55, 1, 29, 4, 49);

        List<Integer> result = numbers.stream()
                .filter(f -> f > 20)
                .distinct()
                .toList();
        System.out.println(result); // [49, 22, 55, 29]
    }

    static void sortExample() {
        List<Integer> numbers = List.of(3, 11, 49, 22, 55, 1, 29, 4, 49);

        List<Integer> result = numbers.stream()
                .distinct()
                .sorted()
                .limit(5)
                .toList();
        System.out.println(result); // [1, 3, 4, 11, 22]
    }

    static void sortExample2() {
        List<Integer> numbers = List.of(3, 11, 49, 22, 55, 1, 29, 4, 49);

        List<Integer> result = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .toList();
        System.out.println(result); // [55, 49, 29, 22, 11]
    }

    static void flatMapExampple() {
        List<List<Integer>> list = List.of(List.of(35, 12, 5, 10), List.of(9, 8, 12, 11));

        Set<Integer> result = list.stream()
                .flatMap(List::stream)
                .filter(f -> f > 10)
                .collect(Collectors.toSet());
        System.out.println(result); // [35, 11, 12]
    }

    static void peekExample() {
        List<String> list = List.of("apptestle", "melon", "watesttermelon", "banana", "graph", "ortestange");

        List<String> result = list.stream()
                .filter(f -> f.contains("test"))
                .peek(p -> System.out.println("\ttest 가 들어있는 것: " + p))
                .map(String::toUpperCase)
                .toList();

        System.out.println("최종: " + result);

    }
}
