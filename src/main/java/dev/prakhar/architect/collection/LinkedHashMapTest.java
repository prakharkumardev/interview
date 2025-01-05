package dev.prakhar.architect.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        //It will maintain the order in which keys were inserted
        Map<Integer,Integer> map = new LinkedHashMap<>();
        IntStream.range(0,10000).forEach((a)->map.put(a,a));
        for(Integer key: map.keySet()){
            System.out.print(key + "\t");
        }

    }
}
