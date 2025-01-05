package dev.prakhar.architect.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(20,"Harsh",1));
        set.add(new Student(20,"Massand",1));
        set.add(new Student(20,"dodo",1));
        System.out.println(set);
    }
}
