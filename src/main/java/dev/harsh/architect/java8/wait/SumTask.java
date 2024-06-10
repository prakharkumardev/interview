package dev.harsh.architect.java8.wait;

import lombok.Getter;

@Getter
public class SumTask implements Runnable{
    private int total = 0;
    @Override
    public void run() {
        synchronized (this){
            for(int i = 0 ; i < 100 ; ++i){
                total += i;
            }
            this.notify();
        }

    }
}
