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

class ReverseStack
{
   Node head;

    public ReverseStack() {
        head=null;
    }
    
    public Node newNode(int val)
    {
        Node newNode=new Node();
        newNode.setData(val);
        newNode.setNext(null);
        return newNode;
    }
    
    public void push(int val)
    {
          Node newNode=new Node();
          newNode=newNode(val);
          newNode.setNext(head);
          head=newNode;
    }
    
    public int pop()
    {
     if(isEmpty())
     {
         System.out.println("Stack is Empty..");
         return -1;
     }
     int data=head.getData();
     head=head.getNext();
     return data;    
    }
    
    public Node getHead()
    {
        return head;
    }
    
    public int peek()
    {
      if(isEmpty())
      {
         System.out.println("Stack is Empty..");
         return -1;
      }
        return head.getData();
    }
    
    public void display()
    {
       if(isEmpty())
       {
         System.out.println("Stack is Empty..");
         return;
       }       
       Node ptr=head;
        System.out.println("\nData of the stack:");
       while(ptr!=null)
       {
           System.out.print(ptr.getData()+"-->");
           ptr=ptr.getNext();
       }
    }
    
    public boolean isEmpty()
    {
        if(head==null)
        {
            return true; 
        }
        return false;
    }
    
   public void reverse(Node ptr)
   {
       if(ptr==null)
            return ;
       if(ptr.getNext()==null) {
           head=ptr;
           return;
       }
         reverse(ptr.getNext());
         ptr.getNext().setNext(ptr);
         ptr.setNext(null);
   }
}

public class ReverseStackRecursion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReverseStack stack=new ReverseStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.reverse(stack.getHead());
        stack.display();
    }
    
}
