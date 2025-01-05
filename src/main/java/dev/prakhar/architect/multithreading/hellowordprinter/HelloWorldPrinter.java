package dev.prakhar.architect.multithreading.hellowordprinter;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World from Run()" + Thread.currentThread());
    }
}
