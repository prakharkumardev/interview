package dev.prakhar.architect.multithreading.producerconsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class PncClient {
    public static void main(String[] args) throws InterruptedException {
        Queue<Object> queue = new ConcurrentLinkedDeque<>();
        Semaphore producerSemaphore = new Semaphore(6);
        Semaphore consumerSemaphore = new Semaphore(0);
        Thread [] producers = new Thread[3];
        Thread [] consumers = new Thread[6];
        for(int i = 0 ; i < 3 ; ++i){
            producers[i] = new Thread(new ProducerTask(queue,producerSemaphore,consumerSemaphore,6));
        }
        for(int i = 0 ; i < 6 ; ++i) {
            consumers[i] = new Thread(new ConsumerTask(queue,producerSemaphore,consumerSemaphore,6));
        }
        for(Thread t : consumers){
            t.start();
        }
        for(Thread t : producers){
            t.start();
        }
    }
}
