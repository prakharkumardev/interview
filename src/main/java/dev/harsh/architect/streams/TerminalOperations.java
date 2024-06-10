package dev.harsh.architect.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static int add(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        Set<Integer> set = new HashSet<>();
        Consumer<Integer> consumer = System.out::println;
        list.forEach(consumer);
        Consumer<Integer> consumer2 = set::add;
        list.forEach(consumer2);
        System.out.println(set);
        Predicate<Integer> predicate = (a)->a%2 == 0;
        System.out.println(list.stream().filter(predicate).collect(Collectors.toList()));
        Function<Integer,Integer> function = n -> 2 * n;
        System.out.println(list.stream().map(function).collect(Collectors.toList()));
        System.out.println(list.stream().parallel().reduce(0,TerminalOperations::add));
        System.out.println(list.stream().filter((a)->a == 2).findFirst().orElseThrow(RuntimeException::new));
    }
}
