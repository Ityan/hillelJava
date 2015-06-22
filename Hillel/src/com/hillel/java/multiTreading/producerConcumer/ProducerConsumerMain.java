package com.hillel.java.multiTreading.producerConcumer;

/**
 * Created by ITyan on 22.06.2015.
 */
public class ProducerConsumerMain {

    public static void main(String[] args) {

        Bucket bucket = new Bucket();

        Producer producer = new Producer(bucket);
        Consumer consumer = new Consumer(bucket);

        producer.start();
        consumer.start();

        try {
            Thread.currentThread().sleep(10);
        } catch (InterruptedException e) {}

        producer.interrupt();
        consumer.interrupt();

        try {
            producer.join();
        } catch (InterruptedException e) {}

        try {
            consumer.join();
        } catch (InterruptedException e) {}

        System.out.println(bucket);
    }


}
