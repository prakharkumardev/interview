package dev.harsh.architect.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenericCollections {
    public static void upperBound(List<? extends Number> list){
//        list.add(213); Write operation will be blocked only read
        //We can create a copy
        List<Number> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println(list);
    }
    public static void lowerBound(List<? super Number> list){
        list.add(30);//Read and write both can be performed here and you can write subtypes of Number
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        upperBound(list);
        List<Object> list2 = new ArrayList<>();
        lowerBound(list2);
    }
}
