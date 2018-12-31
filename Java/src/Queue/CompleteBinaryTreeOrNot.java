/*
 Program to check whether the tree is complete binary tree or not
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author KK Davara
 */
class Node
{
   private int data;
   private Node left;
   private Node right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
   
}
public class CompleteBinaryTreeOrNot {

    
 
    public static Node newNode(int data) {
        Node newNode=new Node();
        newNode.setData(data);
        newNode.setLeft(null);
        newNode.setRight(null);
        return newNode;
    }   
    public static boolean isFull(Node root) {
        return root.getLeft()!=null && root.getRight()!=null ;
    }
    
    public static boolean isLeaf(Node root) {
        return root.getLeft()==null && root.getRight()==null ;
    }
    
    public static boolean isCompleteBT(Node root) {
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        boolean flag=false;
        while(!queue.isEmpty()) {
          Node ptr=queue.remove();
         
          if(!flag && isFull(ptr)) {
              queue.add(ptr.getLeft());
              queue.add(ptr.getRight());
              continue;
          }
          else if(isLeaf(ptr)) {
              flag=true;
              continue;
          }
          
         if(flag && !isLeaf(ptr)) {
             return false;
         } 
         
         if(ptr.getLeft()!=null && !flag) {
             queue.add(ptr.getLeft());
             flag=true;
         }
         else if(ptr.getRight()!=null) {
             return false;
         }
         else {
             return false;
         }
         
        }
        return true; 
    }
    
    public static void main(String[] args) {
        Node root=new Node();
        root=newNode(1);
        root.setLeft(newNode(2));
        root.setRight(newNode(3));
        root.getLeft().setLeft(newNode(4));
        //root.getLeft().setRight(newNode(5));
        root.getRight().setRight(newNode(6));
        if(isCompleteBT(root)) {
            System.out.println("The given tree is the complete binary tree");
        }
        else {
            System.out.println("NO....The given tree is not a complete binary tree");
        } 
    }
    
}
