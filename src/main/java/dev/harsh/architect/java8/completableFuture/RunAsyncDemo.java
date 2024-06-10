package dev.harsh.architect.java8.completableFuture;

public class RunAsyncDemo {
    public static long fib(int n){
        //Base Case
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
}
