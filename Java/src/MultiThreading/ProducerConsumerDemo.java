package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        // Starting two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new ProdTask(buffer));
        executor.execute(new ConTask(buffer));
        executor.shutdown();
    }

}

/**
 * 
 * 
 *
 */
class ProdTask implements Runnable{
    Buffer buffer;
    ProdTask(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            buffer.put(i);
        }
    }
}

/**
 * 
 * 
 *
 */
class ConTask implements Runnable{
    Buffer buffer;
    ConTask(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            buffer.get();;
        }
    }    
}

//Shared class used by threads
class Buffer{
    int i;
    // Bouded ArrayBlockingQueue of size 1
    BlockingQueue<Integer> arrayBlockingQ = new ArrayBlockingQueue<Integer>(1);
    public void get(){
        try {
            // take method to get from blockingqueue
            System.out.println("Consumer recd - " + arrayBlockingQ.take());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void put(int i){
        this.i = i;
        try {
            // putting in blocking queue
            arrayBlockingQ.put(i);
            System.out.println("Putting - " + i);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}