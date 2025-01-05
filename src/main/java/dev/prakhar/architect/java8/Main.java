package dev.prakhar.architect.java8;

import dev.prakhar.architect.java8.wait.SumTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SumTask sumTask = new SumTask();
        Thread thread = new Thread(sumTask);
        thread.start();
        synchronized (sumTask){
            sumTask.wait();
            System.out.println(sumTask.getTotal());
        }
        synchronized (sumTask){
            sumTask.wait(3000);
            System.out.println(sumTask.getTotal());
        }
    }
}
