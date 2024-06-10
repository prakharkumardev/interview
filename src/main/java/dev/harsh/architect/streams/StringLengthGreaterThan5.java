package dev.harsh.architect.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StringLengthGreaterThan5 {
    public static void main(String[] args) {
        List<String> numbers = List.of("harsh","apple","banana","grape","watermelon","kiwi");
        System.out.println(numbers.stream().filter((a)->a.length() > 5).count());

    }
}
