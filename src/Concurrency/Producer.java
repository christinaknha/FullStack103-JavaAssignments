package Concurrency;

import java.util.Random;

public class Producer implements Runnable {
    private SharedBuffer queue;
    private volatile boolean running;

    public Producer(SharedBuffer queue) {
        this.queue = queue;
        this.running = true;
    }

    public void run() {
        Random random = new Random();

        while (running) {
            int num = random.nextInt(10);
            queue.addToBuffer(num);
            System.out.println(num);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stopProducing(){
        running = false;
    }


}
