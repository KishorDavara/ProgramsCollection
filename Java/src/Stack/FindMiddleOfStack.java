/*
 How to implement a stack which will support following operations in O(1) time complexity?
1) push() which adds an element to the top of stack.
2) pop() which removes an element from top of stack.
3) findMiddle() which will return middle element of the stack.
4) deleteMiddle() which will delete the middle element.
 */
package Stack;

/**
 *
 * @author KK Davara
 */

class DNode
{
    private DNode next;
    private DNode prev;
    private int data;

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
}

class DLinkedList {
  private DNode head;
  private DNode mid;
  private int count;
  public DLinkedList()
  {
      head=null;
      mid=null;
      count=0;
  }
  public int getCount() {
      return count;
  }
  public void push(int data) {
    DNode newNode=new DNode();
    newNode.setData(data);
    newNode.setPrev(null);
    newNode.setNext(head);
    count++;
    if(count==1) {
       head=newNode;
       mid=head;
    }
    else {
        head.setPrev(newNode);
        head=newNode;
        if(count%2!=0) {
            mid=mid.getPrev();
        }
    }     
  }
   
  public int pop() {
    if(count==0) {
        System.out.println("Stack is Empty..");
        return -1;
    }  
    int val=head.getData();
    head=head.getNext();
    if( head!=null ) {
        head.setPrev(null);
    }
    count--;
    if(count%2==0) {
        mid=mid.getNext();
    }
    return val;
  }
  
  public int getMiddle() {
      if(count==0) {
          System.out.println("Stack is Empty");
          return -1;
      }
     return mid.getData();
  }
  
 public int deleteMiddle() {
    int data=0;
    DNode prev=null;
    DNode next=null;
    if(count==0) {
        return -1;
    }
     if(count==1) {
         data=head.getData();
         head=null;
         mid=null;
         count--;
         return data;
     }
     prev=mid.getPrev();
     if(mid.getNext()==null) {
         data=mid.getData();
         mid.setPrev(null);
         prev.setNext(null);
         mid=prev;
         count--;
       return data;
     }
     count--;
     next=mid.getNext();
     data=mid.getData();
     prev.setNext(next);
     next.setPrev(prev);
     mid=prev;
     return data;    
 } 
 
}

public class FindMiddleOfStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DLinkedList list=new DLinkedList();
       list.push(1);
       list.push(2);
       
       System.out.println("Middle Element deleted from the stack was "+list.deleteMiddle());
       
       list.push(3);
       //System.out.println(list.getCount());
       System.out.println("Middle Element of the stack is:"+list.getMiddle());
       System.out.println("Middle Element deleted from the stack was "+list.deleteMiddle());
       System.out.println("Middle Element of the stack is:"+list.getMiddle());
       list.push(4);
       list.push(5);
       list.push(6);
       list.push(7);
       System.out.println("Middle Element of the stack is:"+list.getMiddle());
        System.out.println(list.pop()+" deleted from the stack");
       System.out.println("Middle Element of the stack is:"+list.getMiddle());
        System.out.println("Middle Element deleted from the stack was "+list.deleteMiddle());
       System.out.println("Middle Element of the stack is:"+list.getMiddle());
    }
    
}
