package dev.harsh.architect.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComperableAndComperator {
    public static void main(String[] args) {
        Student s1 = new Student(23,"Harsh",1);
        Student s2 = new Student(20,"Massand",2);
        Student s3 = new Student(29,"dodo",3);
        List<Student> students = Arrays.asList(s3,s1,s2);
        Collections.sort(students);
        System.out.println(students);
        //students.sort(Comparator.comparingInt(Student::getMarks));
        //students.sort(new ComperableAndComperator().new StudentNameComparator());
        students.sort((a,b)->b.getAge()-a.getAge());
        System.out.println(students);
    }
    class StudentNameComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName()); // Custom order: compare by name
        }
    }

}
