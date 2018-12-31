package MultiThreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CyclicBarrierExample {

	// Runnable task for each thread
	private static class Task implements Runnable {

		private CyclicBarrier barrier;

		public Task(CyclicBarrier barrier) {
			this.barrier = barrier;
		}

		@Override
		public void run() {
			try {
				System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
				barrier.await();
				System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
			} catch (InterruptedException ex) {
				Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
			} catch (BrokenBarrierException ex) {
				Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	public static void main(String[] args) {
		Runnable barrierAction = new Runnable() {
			@Override
			public void run() {
				//This task will be executed once all thread reaches barrier
                System.out.println("All parties are arrived at barrier, lets play");
			}
		};
		
		//creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
		final CyclicBarrier cyclicBarrier = new  CyclicBarrier(3,barrierAction);
		
		//starting each of thread
        Thread t1 = new Thread(new Task(cyclicBarrier),"Thread1");
        Thread t2 = new Thread(new Task(cyclicBarrier),"Thread2");
        Thread t3 = new Thread(new Task(cyclicBarrier),"Thread3");
        
        t1.start();
        t2.start();
        t3.start();
	}

}
