package functional;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStreamExample {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange"};

        toStream2(arr).map(m -> m + " world").forEach(System.out::println);
    }

    static <T> Stream<T> toStream1(T[] arr) {
        return Arrays.stream(arr);
    }

    static <T> Stream<T> toStream2(T[] arr) {
        return Stream.of(arr);
    }

    static <T> Stream<T> toStream3(T[] arr) {
        return Arrays.asList(arr).stream();
    }

    static IntStream toStream1(int[] arr) {
        return Arrays.stream(arr);
    }

    static IntStream toStream2(int[] arr) {
        return IntStream.of(arr);
    }
}
