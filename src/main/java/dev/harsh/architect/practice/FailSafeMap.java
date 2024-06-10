package dev.harsh.architect.practice;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new ConcurrentHashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            map.put(341,21);
        }
        System.out.println(map.size());
    }
}
