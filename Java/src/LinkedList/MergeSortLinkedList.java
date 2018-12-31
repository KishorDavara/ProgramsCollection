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
class List8
{
    private Node head;
    //private Node headA=null;
    //private Node headB=null;
    
    public List8()
    {
        head=null;
    }
    
   public Node mergeSort(Node head)
   {
       if(head==null) 
           return null;
       if(head.getNext()==null)
           return head;
       Node first=head;
       Node mid=findMiddle(head);
       Node second=mid.getNext();
       mid.setNext(null);
       Node left=mergeSort(first);
       Node right=mergeSort(second);
       Node result=sortedMerge(left,right);
       return result;
   }
   
   public Node findMiddle(Node head)
   {
       if(head==null || head.getNext()==null)
           return head;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.getNext()!=null && fast.getNext().getNext()!=null)
        {
            slow=slow.getNext();
            fast=fast.getNext().getNext();
        }
        return slow;
   }
   
   public Node sortedMerge(Node a,Node b)
   {
       Node result=null;
       
       if(a==null && b==null)
           return null;
       if(a==null && b!=null)
            return b;
       if(a!=null && b==null)
            return a;
       
       if(a.getData()<=b.getData())
       {
           result=a;
           result.setNext(sortedMerge(a.getNext(),b));
       }
       else
       {
           result=b;
           result.setNext(sortedMerge(a,b.getNext()));
       }
       return result;
   }
   
   public Node getHead()
    {
        return head;
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
    
    public void display(Node head) {
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

public class MergeSortLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List8 list=new List8();
        list.insertLast(5);
        list.insertLast(2);
        list.insertLast(10);
        list.insertLast(3);
        list.insertLast(25);
        list.insertLast(15);
        list.insertLast(20);
        System.out.println("Unsorted list:");
        list.display(list.getHead());
        Node merge=list.mergeSort(list.getHead());
        System.out.println("Sorted list:");
        list.display(merge);
        
    }
    
}
