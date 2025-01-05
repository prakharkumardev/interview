package dev.prakhar.architect.multithreading.AdderSubtractor;

public class Subtractor implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i <= 50000 ; ++i){
            Value.counter--;
        }
    }
}
