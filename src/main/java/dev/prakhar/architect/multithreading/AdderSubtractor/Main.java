package dev.prakhar.architect.multithreading.AdderSubtractor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> v1 = executorService.submit(new Adder(),1);
        Future<Integer> v2 = executorService.submit(new Subtractor(),1);
        v1.get();v2.get();
        executorService.shutdown();
        System.out.println(Value.counter);
    }
}
