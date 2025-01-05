package dev.prakhar.architect.java8.wait;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        int [] a = {0};
        Object object = new Object();
       Runnable runnable = ()->{
           while(a[0] <= 100){

               if(a[0] % 2 == 0 && Thread.currentThread().getName().equals("even")){
                   synchronized (object){
                       System.out.println(Thread.currentThread().getName() + " " + a[0]);
                        ++a[0];
                        object.notify();
                   }
               }
               if(a[0] % 2 != 0 && Thread.currentThread().getName().equals("odd")){
                   synchronized (object){
                       System.out.println(Thread.currentThread().getName() + " " + a[0]);
                       ++a[0];
                       try {
                           object.wait();
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
               }
           }
       };

       Thread even = new Thread(runnable,"even");
       Thread odd = new Thread(runnable,"odd");
       even.start();odd.start();
       even.join();odd.join();

    }
}
