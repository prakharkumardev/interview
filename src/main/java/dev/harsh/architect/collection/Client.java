package dev.harsh.architect.collection;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student(20,"Harsh",1);
        Student s2 = new Student(20,"Massand",2);
        Student s3 = new Student(20,"dodo",3);
        List<Student> students = Arrays.asList(s3,s1,s2);
        Collections.sort(students);
        System.out.println(students);
    }
}
