package dev.prakhar.architect.multithreading.addersubtractersynchronizedmethod;

public class Subtractor implements Runnable{
    @Override
    public void run() {
        for(int i = 1 ; i <= 50000 ; ++i){
            Value.decrement();
        }
    }
}
