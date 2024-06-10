package dev.harsh.architect.multithreading.addersubtractersynchronizedmethod;

public class Value {
    public static int counter = 0;
    public static synchronized void increment(){
        counter++;
    }
    public static synchronized void decrement(){
        counter--;
    }
}
