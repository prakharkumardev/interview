package dev.prakhar.architect.multithreading.addersubtractersyncblock;

import dev.prakhar.architect.multithreading.addersubtractormutex.Value;

public class Subtractor implements Runnable{
    @Override
    public void run() {
        for(int i = 1 ; i <= 50000 ; ++i){
            synchronized (Value.class){
                Value.counter--;
            }
        }
    }
}
