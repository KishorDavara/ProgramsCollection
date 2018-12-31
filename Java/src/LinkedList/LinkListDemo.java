package LinkedList;

/**
 *
 * @author KK Davara
 */

//This is fully encapsulated implementation
class Node
{
  private int data;
  private Node next;
  public void setData(int data)
  {
      this.data=data;
  }
  public int getData()
  {
     return data;
  }
  public void setNext(Node next)
  {
      this.next=next;
  }
  public Node getNext()
  {
      return next;
  }
}

class LinkedList
{
    private Node head;
    public LinkedList()
    {
        head=null;
    }
    public void insertFirst(int data)
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
                 newNode.setNext(head);
                 head=newNode;
             }
    }
    public void insertLast(int data)
    {
        Node newNode=new Node();
        newNode.setData(data);
        newNode.setNext(null);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node ptr=head;
            while(ptr.getNext()!=null)
            {
                ptr=ptr.getNext();
            }
            ptr.setNext(newNode);
        }
    }
    public void insertBefore(int key,int data)
    {
        if(head==null)
        {
            return;
        }
        else
        {
            if(head.getData()==key)
            {  
            	Node newNode=new Node();
                newNode.setData(data);
                newNode.setNext(head);
                head=newNode;
            }
            else
            {
            	Node preptr=head;
            	Node ptr=head.getNext();
                
                while(ptr!=null && ptr.getData()!=key)
                {
                    preptr=preptr.getNext();
                    ptr=ptr.getNext();
                }
                if(ptr==null)
                {
                    System.out.println("Key "+key+" not found");
                    return;
                }
                Node newNode=new Node();
                newNode.setData(data);
                newNode.setNext(ptr);
                preptr.setNext(newNode);
            }
        }
    }
    public void insertAfter(int key,int data)
    {
        if(head==null)
        {
            return;
        }
        else
        {
            Node ptr=head;
            while(ptr!=null && ptr.getData()!=key)
            {
                ptr=ptr.getNext();
            }
            if(ptr==null)
                {
                    System.out.println("Key "+ key+" not found");
                    return;
                }
            Node newNode=new Node();
            newNode.setData(data);
            newNode.setNext(ptr.getNext());
            ptr.setNext(newNode);
        }
    }
    
    public void insertAtPosition(int position,int data)
    {
          int count=2;
          if(head==null) return;
          if(position==1)
          {   
        	  Node newNode=new Node();
              newNode.setData(data);
              newNode.setNext(head);
              head=newNode;
          }
          else
          {
        	  Node preptr=head;
        	  Node ptr=head.getNext();
              while(ptr!=null && position!=count)
              {
                  preptr=ptr;
                  ptr=ptr.getNext();
                  count++;
              }
              if(ptr==null) 
              {
                  if(position==count)
                  {
                	Node newNode=new Node();
                    newNode.setData(data);  
                    newNode.setNext(null);
                    preptr.setNext(newNode);
                  }
                  else
                  {
                      System.out.println("Position "+position+" is not found");
                  }
                 return;
              }
              Node newNode=new Node();
              newNode.setData(data);
              newNode.setNext(ptr);
              preptr.setNext(newNode);
          }
              
    }
   
    public void updateNode(int node,int data)
    {
        if(head==null)return;
        if(node==1)
        {
            head.setData(data);
            return;
        }
        int count=2;
        Node ptr=head.getNext();
        while(ptr!=null && count!=node)
        {
            ptr=ptr.getNext();
            count++;
        }
        if(ptr==null)
        {
            System.out.println("Node "+node+" not found in the given list");
            return;
        }
        ptr.setData(data);
    }
    
    public int deleteFirst()
    {
        if(head==null) return 0;
        Node ptr=head;
        head=head.getNext();
        return ptr.getData();
    }
    
    public int deleteLast()
    {
        if(head==null) return 0;
        Node ptr=head;
        int data;
        while(ptr.getNext().getNext()!=null)
        {
            ptr=ptr.getNext();
        }
        data=ptr.getNext().getData();
        ptr.setNext(null);
       return data;
    }
    
    public int deleteFromPosition(int position)
    {
        if(head==null) return 0;
        int count=2,data=0;
        if(position==1) //first position
        {
            data=head.getData();
            head=head.getNext();
            return data;
        }
        Node preptr=head;
        Node ptr=head.getNext();
        while(ptr!=null && count!=position)
        {
            preptr=ptr;
            ptr=ptr.getNext();
            count++;
        }
        if(ptr==null) //position not found
        {
            System.out.println("Position " + position+" not found in the given list");
            return 0;
        }
        if(ptr.getNext()==null) //position at last
        {
            data=ptr.getData();
            preptr.setNext(null);
        }
        else  //position between first and last node
        {
            data=ptr.getData();
            preptr.setNext(ptr.getNext());
            ptr.setNext(null);
        }
        return data;
    }
    
    public int deleteAtData(int data)
    {
        if(head==null)return 0;
        if(head.getData()==data)
        {
            head=head.getNext();
            return data;
        }
        Node ptr=head;
        while(ptr.getNext()!=null && ptr.getNext().getData()!=data)
        {
            ptr=ptr.getNext();
        }
        if(ptr.getNext()==null)
        {
            System.out.println("The node with the given data "+data+" is not found");
            return 0;
        }
        if(ptr.getNext().getNext()!=null)
        {
            ptr.setNext(ptr.getNext().getNext());
        }
        else
        {
            ptr.setNext(null);
        }
        return data;
    }
    
    public int countNode()
    {
        if(head==null) return 0;
        
        if(head.getNext()==null)
        {
            return 1;
        }
        int count=1;
        
        Node ptr=head.getNext();
        
        while(ptr!=null)
         {
                count++;
                ptr=ptr.getNext();
         }
        
        return count;
    }
    
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node print=head;
        if(print.getNext()==null)
        {
            System.out.println(print.getData()+" ");
        }
        else
        {
            while(print!=null)
            {
                System.out.print(print.getData()+"-->");
                print=print.getNext();
                //System.out.println(print);
            }//while(print!=null);
            System.out.println("NULL");
        }
    }
    
    void printReverse(Node head)   //recursive function for reverse print
    {
        if(head==null)
            return;
        printReverse(head.getNext());
        
        System.out.print(head.getData()+"-->");
    }
    void reversePrint()
    {
          System.out.println("Print Reverse List:");
           printReverse(head);
           System.out.println("NULL");
    }
    
    void removeDuplicates()// from sorted linked list
    {
        Node current=head,next_next;
        if(current==null)
             return;
        while(current.getNext()!=null)
        {
            if(current.getData()==current.getNext().getData())
            {
                next_next=current.getNext().getNext();
                current.setNext(next_next);
            }
            else
                current=current.getNext();
        }
    }
    
    
    void printAlternate(Node head)
    {
        if(head==null)
            return;
        System.out.print(head.getData()+" --> ");
       if(head.getNext()!=null)
            printAlternate(head.getNext().getNext());
        System.out.print(head.getData()+" --> "); // reverse alternate node
       
    }
    public Node getHead()
    {
        return head;
    }
}

public class LinkListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertFirst(120);list.insertFirst(12);list.insertFirst(45);list.insertFirst(5);
        list.insertLast(85);list.insertLast(95);list.insertLast(25);
        list.insertBefore(35,99);list.insertBefore(5,10);list.insertBefore(45,111);
        list.insertAfter(10,100);list.insertAfter(80,88);list.insertAfter(25,88);
        list.insertAtPosition(3,15);list.insertAtPosition(1,77);list.insertAtPosition(14,14);list.insertAtPosition(15,55);list.insertAtPosition(17,56);
        list.updateNode(12,5);list.updateNode(20,151);
        System.out.println("Deleted node from the beginning is "+list.deleteFirst());
        System.out.println("Deleted node from the last is "+list.deleteLast());
        list.display();
        System.out.println("Deleted node from the position 1st is "+list.deleteFromPosition(1));
        list.display();
        System.out.println("Deleted node from the position 12th is "+list.deleteFromPosition(12));
        list.display();
        System.out.println("Deleted node from the position 5th is "+list.deleteFromPosition(5));
        list.display();
        System.out.println("Deleted node from the position 8th is "+list.deleteFromPosition(11));
        list.display();
        System.out.println("Deleted node with the data 100 from the head is "+list.deleteAtData(100));
        list.display();
        System.out.println("Deleted node with the data 88 from the tail is "+list.deleteAtData(88));
        list.display();
        System.out.println("Deleted node with the data 111 from the middle is "+list.deleteAtData(111));
        list.display();
        System.out.println("Deleted node with the data 150 is "+list.deleteAtData(150));
        list.display();
        System.out.println("Total number of node in the given linkedlist is "+list.countNode());
        list.reversePrint();
        //list.printReverse(list.getHead());
        System.out.println("Alternate nodes of the list...");
        list.printAlternate(list.getHead());
        
    }
    
}
