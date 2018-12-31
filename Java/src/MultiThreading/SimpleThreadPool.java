package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class WorkerThread implements Runnable {
	  
    private String command;
    
    public WorkerThread(String s){
        this.command=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.command;
    }
}

public class SimpleThreadPool {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for( int i=0; i<10 ; i++) {
			Runnable worker = new WorkerThread(""+i);
			executorService.execute(worker);
		}
		
		Future future = executorService.submit( //submit(Runnable)
				new Runnable() {
					@Override
					public void run() {
						System.out.println("Asynchronous task");
					}	
				});
		try {
			System.out.println(future.get());  //returns null if the task has finished correctly.
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		//submit(Callable)
		Future future1 = executorService.submit(new Callable() {
			@Override
			public Object call() throws Exception {
				 System.out.println("Asynchronous Callable");
			     return "Callable Result";
			}
		});
		try {
			System.out.println("future.get() = " + future1.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorService.shutdown();
	}

}
