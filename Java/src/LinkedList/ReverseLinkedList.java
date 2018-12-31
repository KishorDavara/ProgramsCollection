package LinkedList;

/**
 *
 * @author KK Davara
 */
class List1
{
    private Node head;
    
    public void recursiveReverese(Node currentNode)
    {     
        //check for empty list
        if(currentNode==null)
            return;
        
        // if we are at the TAIL node:  recursive base case:
        if(currentNode.getNext()==null)
        {
             head=currentNode;
             return; //since this is the base case
        }
        recursiveReverese(currentNode.getNext());
        
        currentNode.getNext().setNext(currentNode);
        currentNode.setNext(null);
    }
    
    public void doReverse()
    {
        recursiveReverese(head);
    }
    
    public void ReverseList()  //Iterative Method
    {
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null)
        {
            next=curr.getNext();
            curr.setNext(prev);
            prev=curr;
            curr=next;        
        }
        head=prev;
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

public class ReverseLinkedList {
    public static void main(String[] args) {
        List1 list=new List1();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.display();
        list.ReverseList();
        list.display();
        //recursive reverse
        list.doReverse();
        list.display();
    }
    
}
