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
class List3 {

    private Node head;

    public List3() {
        head = null;
    }
    
    public int intersectPoint(Node head1,Node head2)
    {
        int count1=0,count2=0;
        Node ptr1=head1,ptr2=head2;
        //count number of node of the list1
        while(ptr1!=null)
        {
            count1++;
            ptr1=ptr1.getNext();
        }
        //count number of node of the list2
        while(ptr2!=null)
        {
            count2++;
            ptr2=ptr2.getNext();
        }
        
        ptr1=head1;
        ptr2=head2;
        
        int d=0,c=0;
        if(count1>count2)
        {
            d=count1-count2;
            
            while(c<d)
            {
                if(ptr1==null)
                    return -1;
                ptr1=ptr1.getNext();
                c++;
            }
        }
        else
        {
            d=count2-count1;
            while(c<d)
            {
                if(ptr2==null)
                    return -1;
                ptr2=ptr2.getNext();
                c++;
            }
        }
        
        //find the merge or intersection point of the two list
        while(ptr1!=null && ptr2!=null)
        {
            if(ptr1==ptr2)
                return ptr1.getData();
            ptr1=ptr1.getNext();
            ptr2=ptr2.getNext();
        }
        return -1;
    }
    public void display(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node print = head;
        if (print.getNext() == null) {
            System.out.println(print.getData() + " ");
        } else {
            while (print != null) {
                System.out.print(print.getData() + "-->");
                print = print.getNext();
                //System.out.println(print);
            }//while(print!=null);
            System.out.println("NULL");
        }
    }

}

public class InterSectionPoint {
    public static void main(String[] args) {
         List3 list=new List3();
         Node newNode;
        
         Node headA=new Node();
         headA.setData(3);
        
         Node headB=new Node();
         headB.setData(10);
        
         newNode=new Node();
         newNode.setData(6);
         headA.setNext(newNode);
        
         newNode=new Node();
         newNode.setData(9);
         headA.getNext().setNext(newNode);
        
        // newNode=new Node();
        // newNode.setData(25);
        // headB.setNext(newNode);
         
         newNode=new Node();
         newNode.setData(15);
         headB.setNext(newNode);
         headA.getNext().getNext().setNext(newNode);
         
         newNode=new Node();
         newNode.setData(30);
         headB.getNext().setNext(newNode);
         headA.getNext().getNext().getNext().setNext(newNode);
         
         headB.getNext().getNext().setNext(null);
         headA.getNext().getNext().getNext().getNext().setNext(null);
         
         list.display(headA);
         
         list.display(headB);
         
         System.out.println("Intersection point of two linkedlist is "+list.intersectPoint(headA, headB));
    }
    
}
