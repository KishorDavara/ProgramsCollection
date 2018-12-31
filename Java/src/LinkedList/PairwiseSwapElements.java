/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author KK Davara
 */
class List5
{
    private Node head;
    public List5()
    {
        head=null;
    }
    
    public void pairwiseSwap()
    {
        if(head==null || head.getNext()==null)
             return;
        Node prev=head;
        Node curr=head.getNext();
        Node next=null;
        head=curr;
        while(true)
        {
          next=curr.getNext();
          curr.setNext(prev);
          if(next==null || next.getNext()==null)
          {
              prev.setNext(next);
              break;
          }
          prev.setNext(next.getNext());
          prev=next;
          curr=prev.getNext();
        }
    }
    public Node pairWiseSwapRecur(Node head)
    {
        // Base Case: The list is empty or has only one node
        if(head==null || head.getNext()==null)
            return head;
        
        // Store head of list after two nodes
        Node remaining=head.getNext().getNext();
        
         // Change head
        Node newHead=head.getNext();
        
        // Change next of second node
        head.getNext().setNext(head);
        
        // Recur for remaining list and change next of head
        head.setNext(pairWiseSwapRecur(remaining));
       
         // Return new head of modified list
        return newHead;
    }
    
    public void callRecurSwap()
    {
        head=pairWiseSwapRecur(head);
    }
    
    public void insertLast(int data)
    {
        Node newNode=new Node();
        newNode.setData(data);
        if(head==null)
        {
            newNode.setNext(null);
            head=newNode;
        }
        else
        {
            Node ptr=head;
            while(ptr.getNext()!=null)
            {
                ptr=ptr.getNext();
            }
            newNode.setNext(null);
            ptr.setNext(newNode);
            
        }
    }
    
    
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node print = head;
        if (print.getNext() == null)
        {
            System.out.println(print.getData() + " ");
        } 
        else 
        {
            while (print != null)
            {
                System.out.print(print.getData() + "-->");
                print = print.getNext();
                //System.out.println(print);
            }//while(print!=null);
            System.out.println("NULL");
        }
    }
}
public class PairwiseSwapElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List5 list=new List5();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        //list.insertLast(6);
        list.display();
        //list.pairwiseSwap();
         list.callRecurSwap();
        list.display();
    }
    
}
