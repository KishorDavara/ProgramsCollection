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
class List {

    private Node head;

    public List() {
        head = null;
    }

    public void generateLoop()
    {
        head.getNext().getNext().getNext().getNext().getNext().setNext(head.getNext());
    }
    public void detectAndRemoveLoop()
    {
        Node ptr1=head;
        Node ptr2=head;
        while(ptr1!=null && ptr2!=null && ptr2.getNext()!=null)
        {
            ptr1=ptr1.getNext();
            ptr2=ptr2.getNext().getNext();
            if(ptr1==ptr2)
            {
                //System.out.println("Loop found in the given list at node "+ptr1.getData());
                System.out.println("Loop found in the given list");
                removeLoop(ptr1,head);
                return;
            }
        }
        System.out.println("There is no loop in the given list");
    }
    
    public void removeLoop(Node loopNode,Node headNode)
    {
       while(loopNode.getNext()!=headNode.getNext() )
        {
            loopNode=loopNode.getNext();
            headNode=headNode.getNext();
        }
        loopNode.setNext(null);
        System.out.println("Loop removed from the list");
        //Method 2
       /*
               Node ptr1 = loopNode;
       Node ptr2 = loopNode;
 
       int looplen = 1;
       // count the number of nodes in loop

    while(ptr1.getNext() != ptr2)
    {
       ptr1 = ptr1.getNext();
       looplen++;
    }

    ptr1 = headNode;
    ptr2 = headNode;
    for(int i=0; i < looplen; i++)
    {
        ptr2 = ptr2.getNext();
    }
    while(ptr2.getNext() != ptr1.getNext())
    {
        ptr1 = ptr1.getNext();
        ptr2 = ptr2.getNext();
    }
     
    ptr2.setNext(null); // breaking the loop
*/
    }
    
    
    
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        if (head == null) {
            newNode.setNext(null);
            head = newNode;
        } else {
            Node ptr = head;
            while (ptr.getNext() != null) {
                ptr = ptr.getNext();
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

public class DetectAndRemoveLoop {

    public static void main(String[] args) {
        List list=new List();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.generateLoop();
        list.detectAndRemoveLoop();
        list.display();
        
    }

}
