package functional;

import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        example1();
        System.out.println();

        example2();
        System.out.println();

        example3();
        System.out.println();

        example4();
    }

    static void example1() {
        List<String> list = List.of("23", "5", "6", "16");
//        List<Integer> numbers = list.stream().map(Integer::valueOf).toList();
        List<Integer> numbers = list.stream().map(m -> Integer.valueOf(m)).toList();
        System.out.println(numbers);
    }

    static void example2() {
        List<Integer> numbers = List.of(2, 6, 11, 8);

        numbers.forEach(System.out::println);
        System.out.println();
//        numbers.forEach(number -> System.out.println(number));
    }

    static void example3() {
        List<Integer> ages = List.of(5, 1, 22, 6, 94, 72);

        List<Member> members = ages.stream().map(Member::new).toList();
//        List<Member> members = ages.stream().map(age -> new Member(age)).toList();
    }

    static void example4() {
        List<String> names = List.of("coco", "kei", "michael", "v");
        List<Integer> result = names.stream().map(String::length).toList();
//        List<Integer> result = names.stream().map(name -> name.length()).toList();

        System.out.println(result);
    }
}
