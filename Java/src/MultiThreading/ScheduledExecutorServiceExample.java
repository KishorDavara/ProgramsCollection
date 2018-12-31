package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {

	public static void main(String[] args) {
   ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
   
   ScheduledFuture scheduledFuture = scheduledExecutorService.schedule(new Callable() {
	@Override
	public Object call() throws Exception {
		System.out.println("Executed!");
        return "Called!";
	}
	   
   }, 1, TimeUnit.MINUTES);
   
   try {
	scheduledFuture.cancel(true);   
	//System.out.println("scheduled future "+ scheduledFuture.get());
	System.out.println("scheduled task done "+ scheduledFuture.isDone());
	System.out.println("scheduled task cancelled "+ scheduledFuture.isCancelled());
	}
// catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//} catch (ExecutionException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
   catch(Exception e) {
	   e.printStackTrace();
   }
  
   ScheduledFuture sf = scheduledExecutorService.schedule(new Runnable() {

	@Override
	public void run() {
		System.out.println("schedule service for runnable");
	}
	   
   }, 10 , TimeUnit.SECONDS);

  
	   try {
		System.out.println("runnable scheduled task "+ sf.get());
	} catch (ExecutionException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
	}
}
