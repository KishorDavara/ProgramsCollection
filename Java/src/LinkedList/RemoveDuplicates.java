/*
 remove duplicates when unsorted linked list will be given
 */
package LinkedList;

import java.util.Hashtable;

/**
 *
 * @author KK Davara
 */
class List4
{
    private Node head;
    public List4()
    {
        head=null;
    }
    
    
    public void removeDuplicateMethod1()//O(n^2)
    {
        Node ptr1,ptr2,dup;
        ptr1=head;
        while(ptr1!=null && ptr1.getNext()!=null)
        {
            ptr2=ptr1;
            while(ptr2.getNext()!=null)
            {
                if(ptr1.getData()==ptr2.getNext().getData())
                {
                    dup=ptr2.getNext();
                    ptr2.setNext(dup.getNext());
                }
                else
                    ptr2=ptr2.getNext();
            }
            ptr1=ptr1.getNext();
        }
    }
    
    
    public void removeDuplicateMethod2() //O(n)
    {
        Hashtable<Integer,Boolean> table = new Hashtable<Integer, Boolean>();
        Node ptr1,ptr2=null;
        ptr1=head;
        while(ptr1!=null)
        {
            if(table.containsKey(ptr1.getData()))
            {
                while(ptr1.getData() == ptr1.getNext().getData()){  // 12 -> 11 -> 12 -> 12 -> 41 -> 43 ->NULL
                  ptr1 = ptr1.getNext();	
                }
            	ptr2.setNext(ptr1.getNext());
               
            }
            else
            {
               table.put((Integer)ptr1.getData(),true);
            }
            ptr2=ptr1;
            ptr1=ptr1.getNext();
        }
    }
    
    //Method3 O(nlogn) sort the linkedlist using merge sort and apply removeDuplicate on sorted list
    
    
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
            }
            System.out.println("NULL");
        }
    }
}
public class RemoveDuplicates { 

    
    public static void main(String[] args) {
        List4 list=new List4();
        list.insertLast(12);
        list.insertLast(11);
        list.insertLast(12);
        list.insertLast(12);
        list.insertLast(12);
        list.insertLast(41);
        list.insertLast(43);
        list.insertLast(21);
        list.insertLast(89);
        System.out.println("Original list:");
        list.display();
        System.out.println("List after removal of the duplicate elements");
        //list.removeDuplicateMethod1();  //O(n^2) method
        list.removeDuplicateMethod2();   //O(n) method
        list.display();
    }
    
}
