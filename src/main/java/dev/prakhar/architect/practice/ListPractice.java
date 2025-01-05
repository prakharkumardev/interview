package dev.prakhar.architect.practice;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list3 = Collections.unmodifiableList(List.of(1,3,4,5));
        final List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(5);
        List<Integer> l4 = new CustomListWithoutDuplicates<>();
        l4.add(1);
        l4.add(2);
        l4.add(2);
        System.out.println(l4);
        Set<Student> set = new HashSet<>();
        set.add(new Student("harsh",1,20.0));
        set.add(new Student("harsh",12,20.0));
        set.add(new Student("harsh",14,20.0));
        set.add(new Student("harssh",16,20.0));
        System.out.println(set);
        List<Student> s = new ArrayList<>();
        s.add(new Student("harsh",1,20.0));
        s.add(new Student("harsh",12,20.0));
        s.add(new Student("harsh",14,20.0));
        s.add(new Student("harssh",16,20.0));
        Collections.sort(s);
        System.out.println(s);
        s.sort((a,b)->b.getAge().compareTo(a.getAge()));
        System.out.println(s);
    }
}
