package dev.harsh.architect.java8.wait;

import java.util.Comparator;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinter {
    private static final Object object = new Object();
    private static final IntPredicate evenCondition = value -> (value & 1) != 0;
    private static final IntPredicate oddCondition = value -> (value & 1) == 0;

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(()->EvenOddPrinter.printNumber(evenCondition));
        CompletableFuture.runAsync(()->EvenOddPrinter.printNumber(oddCondition));
        Thread.sleep(1000);
    }

    public static void printNumber(IntPredicate predicate){
        IntStream.rangeClosed(1,10).filter(predicate).forEach(EvenOddPrinter::execute);
    }

    public static void execute(int no){
        synchronized (object){
            try {
                System.out.println(Thread.currentThread().getName() + " " + no);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
