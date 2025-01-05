package dev.prakhar.architect.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            map.put(9, 10);
        }
    }

}
