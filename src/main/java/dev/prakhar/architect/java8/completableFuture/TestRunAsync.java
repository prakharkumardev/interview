package dev.prakhar.architect.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestRunAsync {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(()->{
            int n = 20;
            System.out.println("Thread:  " + Thread.currentThread().getName());
            IntStream.range(0,n).mapToLong(RunAsyncDemo::fib).forEach(System.out::println);
        }, Executors.newCachedThreadPool());

        completableFuture.get();

        CompletableFuture.supplyAsync(()->{
            int n = 20;
            System.out.println("Thread:  " + Thread.currentThread().getName());
            return IntStream.range(0,n).mapToLong(RunAsyncDemo::fib).boxed().toList();
        }).thenRunAsync(()->{
            System.out.println("as");
        });

//        System.out.println(completableFuture1.get());

    }
}
