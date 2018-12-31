package LinkedList;
/**
 *
 * @author KK Davara
 */
class List2
{
    private Node head;
    
    public boolean isPalindrome()
    {
        //Method 1
     /* if(head==null)
          return false;
      if(head.getNext()==null)
          return true;
      int size=count();
      int middle=size/2;
      if((size%2)!=0)
          middle++;
      Node current=head;
      Node rev=head;
      int count=0;
      while(count<middle-1)
      {
          rev=rev.getNext();
          count++;
      }
      rev.setNext(reverse(rev.getNext()));
      rev=rev.getNext();
      while(rev!=null)
      {
          if(rev.getData()!=current.getData())
              return false;
          current=current.getNext();
          rev=rev.getNext();
      }
      return true;  */
        //Method2 Better Approach
        Node slow_ptr=head,fast_ptr=head;
        Node middle=null,second_half=null;
        Node prev_slow=head;
        boolean res=true;
        if(head!=null && head.getNext()!=null)
        {
           while(fast_ptr!=null && fast_ptr.getNext()!=null)
           {
               fast_ptr=fast_ptr.getNext().getNext();
               prev_slow=slow_ptr;
               slow_ptr=slow_ptr.getNext();
           }
           if(fast_ptr!=null)
           {
               middle=slow_ptr;
               slow_ptr=slow_ptr.getNext();
           }    
           prev_slow.setNext(null);
           
           second_half=reverse(slow_ptr); //reverse the second half
           res=compare(head, second_half); // compare first half with second half
           
           //Construct the original list back
           second_half=reverse(second_half);
           if(middle!=null)
           {
               prev_slow.setNext(middle);
               middle.setNext(second_half);
           }
           else
               prev_slow.setNext(second_half);
        }
        return res;
    }
    boolean compare(Node head,Node second_half)
    {
        while(second_half!=null)
           {
               if(head.getData()!=second_half.getData())
                   return false;
               head=head.getNext(); 
               second_half=second_half.getNext();      
           }
        return true;
    }
    public int count()
    {
        //if(head==null) return 0;
        //Not required here as we check it above 
        //if(head.getNext()==null)
        //{
          //  return 1;
       // }
        int count=0;
        
        Node ptr=head;
        while(ptr!=null)
         {
                count++;
                ptr=ptr.getNext();
         }
        
        return count;

    }
    public Node reverse(Node head)
    {
       Node prev=null;
       Node curr=head;
       Node next=null;
       while(curr!=null)
       {
           next=curr.getNext();
           curr.setNext(prev);
           prev=curr;
           curr=next;
       }
       return prev;
    }
    
    public void ReverseList()
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

public class PalindromeList {
 public static void main(String[] args) {
        List2 list=new List2();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        //list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        if(list.isPalindrome())
            System.out.println("The linked list is palindrome ");
        else
            System.out.println("The linked list is not palindrome ");
        list.display();
    }
    
}
