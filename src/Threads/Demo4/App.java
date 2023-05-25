package Threads.Demo4;

// thread synchronization
// issue: cached data

/* This example ran an infinite loop that printed Hello, paused for
100 ms and then started over again.

To exit loop gracefully, you can use thread interruptions (will cover later)

Show example of how to use data
 */

import java.util.Scanner;

class Processor extends Thread{

//  use volatile keyword to indicate a value within a thread that can be changed elsewhere in the code
//  rather than being ignored since there are two instances of the thread running.
    private volatile boolean running = true;
    public void run(){
        while(running){
            System.out.println("Hello");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown(){
        running = false;
    }
}
public class App {
    public static void main(String[] args){
        Processor proc1 = new Processor();
        proc1.start();

        System.out.println("Press return to stop ...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        proc1.shutdown();


    }
}
