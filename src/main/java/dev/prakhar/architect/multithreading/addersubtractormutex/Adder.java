package dev.prakhar.architect.multithreading.addersubtractormutex;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Adder implements Runnable{
    private Lock lock;
    @Override
    public void run() {
        for(int i = 0 ; i < 10000 ; ++i){
            lock.lock();
            Value.counter++;
            lock.unlock();
        }
    }
}
