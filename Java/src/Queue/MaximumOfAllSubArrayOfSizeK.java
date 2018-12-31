/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author KK Davara
 */
public class MaximumOfAllSubArrayOfSizeK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        findMax();
    }
    static void findMax(){
		int x[]={2,5,1,2,0,2,7,6,5,4,8};
		int i=0;
		int k=3;
 
	    // Create a Double Ended Queue, Qi that will store indexes of array elements
	    // The queue will store indexes of useful elements in every window and it will
	    // maintain decreasing order of values from front to rear in Qi, i.e., 
	    // arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
		Deque<Integer> q=new  ArrayDeque<Integer>();
 
		for(;i<k;i++){
			 // For every element, the previous smaller elements are useless so
	        // remove them from q
			while(!q.isEmpty() && x[q.peekLast()]<=x[i]){
				q.removeLast();
			}
			q.addLast(i); // Add new element at rear of queue
		}
		for ( ; i <x.length; ++i){
 
			// The element at the front of the queue is the largest element of
	        // previous window, so print it
			System.out.println(x[q.peek()]);
 
		       // Remove the elements which are out of this window
			while(!q.isEmpty() && q.peekFirst()<=i-k){
				q.removeFirst();// Remove from rear
			}
 
			// Remove all elements smaller than the currently
	        // being added element (remove useless elements)
			while(!q.isEmpty() && x[q.peekLast()]<=x[i]){
				q.removeLast();
			}
 
			q.addLast(i);
		}
 
		System.out.println(x[q.peek()]);
	}
}
    

