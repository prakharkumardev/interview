package dev.harsh.architect.multithreading.AdderSubtractor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Adder implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i <= 50000 ; ++i){
            Value.counter++;
        }
    }
}
