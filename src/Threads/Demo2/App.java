package Threads.Demo2;

// implement runnable and pass it to the constructor of the thread class??
class Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
//          sleep pauses program for specified milliseconds
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

    public class App {
        public static void main(String[] args) {
            Thread t1 = new Thread(new Runner());
            Thread t2 = new Thread(new Runner());

            t1.start();
            t2.start();
        }
    }
