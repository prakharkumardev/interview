package dev.harsh.architect.collection;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        final int s = 10;
        List<Integer> list = new LinkedList<>();
        final List<String>list1 = new ArrayList<>();
        list1.add("Hello!");
        System.out.println(list1);
        List<Integer> list2 = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        list2.add(2);
        System.out.println(list2);
    }
}
