package dev.prakhar.architect.streams;

import java.util.stream.Stream;

public class Basic {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        stream.forEach(System.out::println);
    }
}
