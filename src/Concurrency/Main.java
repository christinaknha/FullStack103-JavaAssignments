package Concurrency;

public class Main {
    public static void main(String[] args){
        SharedBuffer buffer = new SharedBuffer(5);

        Consumer consumer = new Consumer(buffer, 0);
        Producer producer = new Producer(buffer);

        Thread consumerT = new Thread(consumer);
        Thread producerT = new Thread(producer);

        consumerT.start();
        producerT.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        consumer.stopConsuming();
        producer.stopProducing();
    }
}
