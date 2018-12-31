package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/*
 * @Author KDavara
 *  
 * Create class ConcurrentHashMapVsSynchronizedHashMap.java
 * Create object for each HashTable, SynchronizedMap and ConcurrentHashMap
 * Add and retrieve 500k entries from Map
 * Measure start and end time and display time in milliseconds
 * We will use ExecutorService to run 5 threads in parallel
 */

public class ConcurrentHashMapVsSynchronizedMap {
	public final static int THREAD_POOL_SIZE = 5;
	 
	public static Map<String, Integer> hashTableObject = null;
	public static Map<String, Integer> synchronizedMapObject = null;
	public static Map<String, Integer> concurrentHashMapObject = null;
	
	public static void main(String[] args) throws InterruptedException {
		// Test with Hashtable Object
		        hashTableObject = new Hashtable<String, Integer>();
				performTest(hashTableObject);
		 
				// Test with synchronizedMap Object
				synchronizedMapObject = Collections.synchronizedMap(new HashMap<String, Integer>());
				performTest(synchronizedMapObject);
		 
				// Test with ConcurrentHashMap Object
				concurrentHashMapObject = new ConcurrentHashMap<String, Integer>();
				performTest(concurrentHashMapObject);	
     
	}
	
	public static void performTest(final Map<String, Integer> threads) throws InterruptedException {
		 
		System.out.println("Test started for: " + threads.getClass());
		long averageTime = 0;
	
		for (int i = 0; i < 5; i++) {
 
			long startTime = System.nanoTime();
			ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
 
			for (int j = 0; j < THREAD_POOL_SIZE; j++) {
				executorService.execute(new Runnable() {
					@SuppressWarnings("unused")
					@Override
					public void run() {
 
						for (int i = 0; i < 500000; i++) {
							Integer randomNumber = (int) Math.ceil(Math.random() * 550000);
 
							// Retrieve value. We are not using it anywhere
							Integer value = threads.get(String.valueOf(randomNumber));
 
							// Put value
							threads.put(String.valueOf(randomNumber), randomNumber);
						}
					}
				});
			}
 
			// Make sure executor stops
			executorService.shutdown();
 
			// Blocks until all tasks have completed execution after a shutdown request
			executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
 
			long endTime = System.nanoTime();
			//System.out.println(startTime+" "+endTime);
			long totalTime = (endTime - startTime) / 1000000L;
			averageTime += totalTime;
			System.out.println("2500K entried added/retrieved in " + totalTime + " ms");
		}
		System.out.println("For " + threads.getClass() + " the average time is " + averageTime / 5 + " ms\n");
	}
}


