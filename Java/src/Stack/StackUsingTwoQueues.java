package Stack;

import java.util.LinkedList;
import java.util.Queue;

/*
   Idea is to push all the value into queue1
   Then pop queue1 and push into queue2 until the size of the queue will become 1 remove and return last element of the queue1
   Then swap the name of queue1 and queue2 
   follow above step untill queue1 become empty
*/
/**
 *
 * @author KK Davara
 */
public class StackUsingTwoQueues {
/**
     * @param args the command line arguments
     */
    static Queue<Integer> queue1=new LinkedList<>();
    static Queue<Integer> queue2=new LinkedList<>();
 //Method-1 By making push operation costly
    public static void push(int val)
    {
        if(queue1.isEmpty()) {
           queue1.add(val);
        }
        else {
            while(!queue1.isEmpty())
            {
                queue2.add(queue1.remove());
            }
            queue1.add(val);
            while(!queue2.isEmpty())
            {
                queue1.add(queue2.remove());
            }
        }
    }
    public static int pop()
    {
        return queue1.remove();
    } 
    
    public static void displayStack()
    {
      while(queue1.size()>0) {
          System.out.print(pop()+" ");
      }  
    }
 /*   
 //Method-2 By making pop operation costly
    public static void push(int val)
    {
      queue1.add(val);
    }
    
    public static int pop()
    { 
        while(queue1.size()>1)
        {
            queue2.add(queue1.remove());
        }
        int element=queue1.remove();
        Queue<Integer> temp=new LinkedList<>();
        temp=queue1;
        queue1=queue2;
        queue2=temp;
        return element; 
    }
    public static void displayStack()
    {
      while(queue1.size()>0) {
          System.out.println(pop());
      }  
    }
   */ 
    
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        displayStack();
    }
    
}
