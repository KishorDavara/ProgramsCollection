/*
 *Add two numbers represented by linked lists | Set 1
Given two numbers represented by two lists, write a function that returns sum list. The sum list is list representation of addition of two input numbers.

Example 1

Input:
  First List: 5->6->3  // represents number 365
  Second List: 8->4->2 //  represents number 248
Output
  Resultant list: 3->1->6  // represents number 613
Example 2

Input:
  First List: 7->5->9->4->6  // represents number 64957
  Second List: 8->4 //  represents number 48
Output
  Resultant list: 5->0->0->5->6  // represents number 65005
 */
package LinkedList;

/**
 *
 * @author KK Davara
 */
class LinkedList1
{
    private Node head;
    public LinkedList1()
    {
        head=null;
    }
    public Node newNode(int num) {
        Node newNode=new Node();
        newNode.setData(num);
        newNode.setNext(null);
        return newNode;
    }
    
    public Node addTwoNumber(Node headA,Node headB) {
       Node res=null;
       Node temp=null,prev=null;
       int sum=0;
       int carry=0;
       while(headA!=null || headB!=null) {
           sum=carry+(headA!=null?headA.getData():0)+(headB!=null?headB.getData():0);
           //System.out.println(sum);
           carry=(sum>=10)?1:0;
           sum=sum%10;
           temp=newNode(sum);
           if(res==null)
               res=temp;
           else
               prev.setNext(temp);
           prev=temp;
           
           if(headA!=null) {
               headA=headA.getNext();
           }
           if (headB!=null) {
               headB=headB.getNext();
           }
       }
       if ( carry > 0 ) {
           temp.setNext(newNode(carry));
        }    
       return res;
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
public class AddTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList1 list=new LinkedList1();
        Node node;
        Node headA=new Node();
        Node headB=new Node();
        
        node=new Node();
        node.setData(3);
        headA=node;
        
        node=new Node();
        node.setData(6);
        headA.setNext(node);
        
        node=new Node();
        node.setData(5);
        headA.getNext().setNext(node);
        
        node=new Node();
        node.setData(2);
        headB=node;
        
        node=new Node();
        node.setData(4);
        headB.setNext(node);
        
        node=new Node();
        node.setData(8);
        headB.getNext().setNext(node);
        
        list.display(headA);
        list.display(headB);
        
        Node res=list.addTwoNumber(headA, headB);
        System.out.println("Resultant list is: ");
        list.display(res);
    }
    
}
