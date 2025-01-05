package dev.prakhar.architect.multithreading.producerconsumer;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class ConsumerTask implements Runnable{
    private final Queue<Object> queue;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    private int size;
    @Override
    @SneakyThrows
    public void run() {
        while (true) {
            consumerSemaphore.acquire();
            if (!queue.isEmpty()) {
                System.out.println("Consuming task" + " " + Thread.currentThread());
                queue.remove();
            }
            producerSemaphore.release();

        }
    }
}