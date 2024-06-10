package dev.harsh.architect.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = new ArrayList<>();
        List<Future<Boolean>> futures = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i = 0 ; i < 1320 ; ++i){
            final int s = i;
            futures.add(executorService.submit(()-> list.add(s)));
        }
        for(int i = 0 ; i < futures.size(); ++i){
            futures.get(i).get();
        }
        executorService.shutdown();
        //The size wont be fine in this case
        System.out.println(list.size());
    }
}
