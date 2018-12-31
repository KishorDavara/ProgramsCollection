/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author KK Davara
 */
class Stack
{
    int top;
    int N;
    int stack[];
    
    Stack()
    {
        top=-1;
        N=1;
        stack=new int[N];
    }
    
    Stack(int N)
    {
        top=-1;
        this.N=N;
        stack=new int[N];
    }
    
    public int pop()
    { 
        if( isEmpty() ) {
             System.out.println("Stack Empty");
             return -1;
        }
        int val=stack[getTop()];
        decreaseTop();
        return val;
    }
    
    public void push(int val)
    {
        if( isFull() ) {
            System.out.println( "Stack Full.. " );
            return;
        }
        increaseTop();
        stack[getTop()]=val;
    }
    
    public int peek()
    {
        if( isEmpty() ) {
             System.out.println("Stack Empty");
             return -1;
        }
        return stack[getTop()];
    }
    
    public void increaseTop()
    {
        top++;
    }
    
    public void decreaseTop()
    {
        top--;
    }
    
    public int getTop()
    {
        return top;
    }
    
    public boolean isEmpty()
    {
        if( getTop()== -1) {
            return true;
        }
        return false;
    }
    
    public boolean isFull()
    {
       if( getTop()==N-1) {
            return true;
        }
      return false;  
    }
 
    public void display()
    {
        if(isEmpty())
        {
            System.out.println(" Stack is Empty..");
            return;
        }
        System.out.println("Elemens of the stack are:");
        for(int i=0;i<=getTop();i++)
        {
            System.out.println("Stack["+i+"]:"+stack[i]);
        }
    }
}
public class StackArrayDemo {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        System.out.println("Top Element is "+s.peek()+" and top is "+s.getTop());
        s.push(30);
        System.out.println("Element poped from the stack was "+s.pop());
        s.push(56);
        s.display();
    }    
}
