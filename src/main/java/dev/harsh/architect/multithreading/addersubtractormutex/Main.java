package dev.harsh.architect.multithreading.addersubtractormutex;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(lock);
        Subtractor subtractor = new Subtractor(lock);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<?> future = executorService.submit(adder);
        Future<?> future1 = executorService.submit(subtractor);
        future.get();future1.get();
        executorService.shutdown();
        System.out.println(Value.counter);
    }
}
