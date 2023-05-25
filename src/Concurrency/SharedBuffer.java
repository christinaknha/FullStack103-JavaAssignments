package Concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class SharedBuffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int maxSize;

    public SharedBuffer(int maxSize) {
        this.maxSize = maxSize;
    }

    public int qSize(){
        int qsize = queue.size();
        return qsize;
    }

    public synchronized void addToBuffer(int num) {
        while (queue.size() == maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.add(num);
        notifyAll();
    }

    public synchronized Integer removeBufferNumber() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Integer num = queue.remove();
        notifyAll();
        return num;
    }
}


