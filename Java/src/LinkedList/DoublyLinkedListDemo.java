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
  public DLinkedList()
  {
      head=null;
  }
  
  public void insertLast(int data) {
      DNode newNode=new DNode();
      newNode.setData(data);
      newNode.setNext(null);
      
      if(head==null) {
          newNode.setPrev(null);
          head=newNode;
      }
      else {
          DNode ptr=head;
          DNode prev;
          while(ptr.getNext()!=null) {
              ptr=ptr.getNext();
          }
          newNode.setPrev(ptr);
          ptr.setNext(newNode);
      }
  }
  
 public void display() {
     if( head == null ) {
         System.out.println("\nLinkedList is Empty...");
         return;
     }
     DNode ptr=head;
     DNode prev=null;
     System.out.println("Traversal in forward direction..");
     while(ptr!=null) {
         System.out.print(ptr.getData()+"-->");
         prev=ptr;
         ptr=ptr.getNext();
     }
     System.out.println("null");
     
     System.out.println("Traversal in backward direction..");
     while(prev!=null) {
         System.out.print(prev.getData()+"-->");
         prev=prev.getPrev();
     }
     System.out.println("null");
 } 
}

public class DoublyLinkedListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DLinkedList list=new DLinkedList();
        list.insertLast(10);
        list.insertLast(25);
        list.insertLast(12);
        list.insertLast(56);
        list.insertLast(89);
        list.display();
    }
    
}
