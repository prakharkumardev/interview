package dev.harsh.architect.multithreading.hellowordprinter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new HelloWorldPrinter());
        Runnable runnable = ()->{
            System.out.println("Hello world lamdba! " + Thread.currentThread());
        };
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        t1.join();t2.join();
        System.out.println("Hello World Main");
    }
}
