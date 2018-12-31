package LinkedList;
/**
 *
 * @author KK Davara
 */
class List6
{
    private Node head;
    
    public List6()
    {
        head=null;
    }
    
    public Node intersectList(Node a,Node b)
    {
      if(a==null || b==null)
          return null;
      if(a.getData()<b.getData())
          return intersectList(a.getNext(),b);
      if(a.getData()>b.getData())
         return intersectList(a, b.getNext());
      
      //Below lines will executed only when a.getData()==b.getData()
      Node temp=new Node();
      temp.setData(a.getData());
      temp.setNext(intersectList(a.getNext(), b.getNext()));
     return temp;
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
public class IntersectionOfSortedLinkedLists {

    public static void main(String[] args) {
          List6 list=new List6();
          Node a=null;
          Node b=null;
          Node intersect=null;
          Node newNode;
          
          a=new Node();
          a.setData(1);
          
          newNode=new Node();
          newNode.setData(2);
          a.setNext(newNode);
          
          newNode=new Node();
          newNode.setData(3);
          a.getNext().setNext(newNode);
          
          newNode=new Node();
          newNode.setData(4);
          a.getNext().getNext().setNext(newNode);
          
          newNode=new Node();
          newNode.setData(6);
          a.getNext().getNext().getNext().setNext(newNode);
          a.getNext().getNext().getNext().getNext().setNext(null);
          
          b=new Node();
          b.setData(2);
          
          newNode=new Node();
          newNode.setData(4);
          b.setNext(newNode);
          
          newNode=new Node();
          newNode.setData(6);
          b.getNext().setNext(newNode);
          
          newNode=new Node();
          newNode.setData(8);
          b.getNext().getNext().setNext(newNode);
          
          b.getNext().getNext().getNext().setNext(null);
          
          System.out.println("list1: ");
          list.display(a);
          
          System.out.println("list2: ");
          list.display(b);
          
          intersect=list.intersectList(a, b);
          
          System.out.println("InterSection list: ");
          list.display(intersect);
    }
    
}
