package dev.prakhar.architect.practice;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ConcurrencyHashMap {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Map<Integer,Integer> map = new ConcurrentHashMap<>();
        IntStream.range(0,100).parallel().forEach((a)->map.put(a,a));
        System.out.println(map.size());
        Map<Integer,Integer> map2 = new HashMap<>();
        IntStream.range(100,200).parallel().forEach((a)->map2.put(a,a));
        System.out.println(map2.size());
    }
}
