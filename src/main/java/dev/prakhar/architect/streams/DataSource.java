package dev.prakhar.architect.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataSource {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,1,3,4,5,6,7);
        for(Integer i : l1){
            System.out.println(i);
        }
        Stream<Integer> s1 = l1.stream();
        s1.forEach(System.out::println);
        //Stream has already been consumed s1.forEach(System.out::println);
        System.out.println(l1.stream().collect(Collectors.toSet()));
    }
}
