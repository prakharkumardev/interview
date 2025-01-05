package dev.prakhar.architect.multithreading.producerconsumer;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class ProducerTask implements Runnable{
    private final Queue<Object> queue;
    private Semaphore producerSemaphore;
    private Semaphore consumeSemaphore;
    private int size;
    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            producerSemaphore.acquire();
            if (queue.size() < size) {
                System.out.println("Producing task" + " " + Thread.currentThread());
                queue.add(new Object());
            }

            consumeSemaphore.release();

        }

    }
}
