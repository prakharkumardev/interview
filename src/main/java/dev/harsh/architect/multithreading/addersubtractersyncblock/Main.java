package dev.harsh.architect.multithreading.addersubtractersyncblock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<?> v1 = executorService.submit(new Adder());
        Future<?> v2 = executorService.submit(new Subtractor());
        v1.get();v2.get();
        executorService.shutdown();
        System.out.println(Value.counter);
    }
}
