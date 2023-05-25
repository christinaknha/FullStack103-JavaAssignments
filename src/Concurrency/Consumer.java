package Concurrency;
public class Consumer implements Runnable{
        private SharedBuffer queue;
        private volatile int sum;
        private volatile boolean running;

        public Consumer(SharedBuffer queue, int sum) {
            this.queue = queue;
            this.sum = sum;
            this.running = true;
        }

        public void run(){
            while(running) {
                sum += queue.removeBufferNumber();
                System.out.println(sum);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public void stopConsuming(){
            running = false;
        }
    }

