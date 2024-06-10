package dev.harsh.architect.multithreading.mergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(List.of(5,4,3,2,1,0,-1),executorService);
        Future<List<Integer> > future = executorService.submit(sorter);
        System.out.println(future.get());
        executorService.shutdown();
    }
}
