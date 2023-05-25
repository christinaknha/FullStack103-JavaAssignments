package Threads.Demo5;

// thread synchronization
// issue: interleaving thread

/*both threads run at the same time but the program doesn't wait until
they are done before running sout. To fix, use .join which waits until
code execution is finished

when calling code, it should print 20000, but doesn't always because the
code written takes 3 steps to complete (pull count, add 1 to count, then
store variable back to count.

To fix this, write a method that increments and make the method synchronized
Sets an intrinsic lock where only one thread can access it at a time.
 */


public class App {

    private int count = 0;

    public synchronized void increment(){
        count ++;
    }


   public static void main(String[] args){
       App app = new App();

       app.doWork();
   }

   public void doWork() {

       Thread t1 = new Thread(new Runnable() {
           public void run() {
               for (int i = 0; i < 10000; i++) {
                   increment();
               }
           }
       });
       Thread t2 = new Thread(new Runnable() {
           public void run() {
               for (int i = 0; i < 10000; i++) {
                   increment();
               }
           }
       });
       t1.start();
       t2.start();

       try {
           t1.join();
           t2.join();
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

       System.out.println("Count is: " + count);
   }
}




