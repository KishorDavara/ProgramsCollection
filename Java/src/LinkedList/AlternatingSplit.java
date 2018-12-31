/*Alternating Split
0-->1-->0-->1-->0-->1--NULL
list1:0->0->0->NULL
list2:1->1->1->NULL
*/
package LinkedList;

/**
 *
 * @author KK Davara
 */
class List7
{
    private Node head;
    private Node headA;
    private Node headB;
    
    public List7()
    {
        head=null;
        headA=null;
        headB=null;
    }
    
    public void alternateSplit(Node a)
    {
        Node curr=a;
        if(a==null || a.getNext()==null)
            return;
        headA=curr;
        headB=curr.getNext();
        
        while(curr!=null && curr.getNext()!=null)
        {
            Node temp=curr.getNext();
            curr.setNext(temp.getNext());
            if(curr.getNext()!=null && curr.getNext().getNext()!=null)
            {
                temp.setNext(curr.getNext().getNext());
                
            }
            else
            {
                temp.setNext(null);
                return;
            }
            curr=curr.getNext();
        }
    }

    public Node getHead()
    {
        return head;
    }

    public Node getheadA()
    {
        return headA;
    }
    
    public Node getheadB()
    {
        return headB;
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
public class AlternatingSplit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List7 list=new List7();
      /*Node newNode;
      Node head=new Node();
      Node headA=null;
      Node headB=null;
      head.setData(0);
      
      newNode=new Node();
      newNode.setData(1);
      head.setNext(newNode);
      
      newNode=new Node();
      newNode.setData(0);
      head.getNext().setNext(newNode);
      
      newNode=new Node();
      newNode.setData(1);
      head.getNext().getNext().setNext(newNode);
      
      newNode=new Node();
      newNode.setData(0);
      head.getNext().getNext().getNext().setNext(newNode);
      
      newNode=new Node();
      newNode.setData(1);
      head.getNext().getNext().getNext().getNext().setNext(newNode);
      
      head.getNext().getNext().getNext().getNext().getNext().setNext(null);
      */
      
      list.insertLast(0);
      list.insertLast(1);
      list.insertLast(0);
      list.insertLast(1);
      list.insertLast(0);
      list.insertLast(1);
      
      list.display(list.getHead());
      
      list.alternateSplit(list.getHead());
      
      list.display(list.getheadA());
      
      list.display(list.getheadB());
      
    }
    
}
