package dev.prakhar.architect.designpattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();
        Set<Singleton> threadSet = new HashSet<>();
        for(int i = 0 ; i < 1000 ;++i){
            threadList.add(new Thread(()->{
                try {
                    threadSet.add(Singleton.getInstance());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }));
        }
        for(Thread t : threadList){
            t.start();
        }
        for(Thread t : threadList){
            t.join();
        }
        System.out.println(threadSet);

    }
}
