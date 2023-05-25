package Threads.Demo3;

// running one method in its own thread without creating separate class
public class App {
    public static void main(String[] args){
        Thread t1 =new Thread(new Runnable(){

            @Override
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
        });
        t1.start();
    }
}
