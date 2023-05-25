package Threads.Demo1;

//Extend thread to a class example
class Runner extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 10; i ++){
            System.out.println("Hello "+ i );
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
    public static void main(String[] args){
        Runner runner1 = new Runner();
//      Start looks for code to run
//      Don't call run because that will cause run to run inside the main.
//      Rather than in its own thread.
        runner1.start();
        
        Runner runner2 = new Runner();
//      Start looks for code to run
//      Don't call run because that will cause run to run inside the main.
//      Rather than in its own thread.
        runner2.start();
    }
}
