package dev.harsh.architect.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        Map<Student,Integer> treeMap = new TreeMap<>();
        treeMap.put(new Student("harsh",12,90.0),90);
        treeMap.put(new Student("harsh2",12,90.0),90);
        treeMap.put(new Student("harsh",12,90.0),90);
        treeMap.put(new Student("harsh3",12,90.0),90);
        treeMap.put(new Student("harsh",12,90.0),90);
        //Our comperator has compare to based on age so duplicates will be removed
        System.out.println(treeMap);

        Map<Student,Integer> map2 = new TreeMap<>(Comparator.comparing(Student::getMarks));
        map2.put(new Student("harsh",12,90.0),90);
        map2.put(new Student("harsh2",12,90.0),90);
        map2.put(new Student("harsh",12,90.2),90);
        map2.put(new Student("harsh3",12,90.0),90);
        map2.put(new Student("harsh",12,90.0),90);
        System.out.println(map2);


    }
}
