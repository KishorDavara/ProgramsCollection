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
class Node
{
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
class StackLinkedList
{
   Node head;

    public StackLinkedList() {
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
        System.out.println("Data of the stack:");
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
   
}
public class StackLinkedListDemo {

    public static void main(String[] args) {
        StackLinkedList stack=new StackLinkedList();
        stack.display();
        stack.peek();
        System.out.println("\nElement removed from the stack is "+stack.pop());
        stack.push(45);
        stack.push(89);
        System.out.println("\nTop Element of the stack is "+stack.peek());
        stack.display();
        System.out.println("\nElement removed from the stack is "+stack.pop());
        stack.display();
        
    }
    
}
