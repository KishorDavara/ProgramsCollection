/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author KK Davara
 */
class SpiralPrint
{
    TreeNode root;
    Queue<TreeNode> q=new LinkedList<TreeNode>();
    public SpiralPrint()
    {
        root=null;
    }
    
    public void insertNode(Object val) {
        TreeNode newNode=new TreeNode();
        newNode.setVal(val);
        newNode.setLeft(null);
        newNode.setRight(null);
        if(root==null) {
            root=newNode;
            q.add(newNode);
        }
        else if(root.getLeft()==null) {
            root.setLeft(newNode);
            q.add(newNode);
        }
        else if(root.getRight()==null) {
            root.setRight(newNode);
            q.add(newNode);
            q.remove();
        }
        else {
           TreeNode node=q.peek();
           if(node.getLeft()==null) {
               node.setLeft(newNode);
               q.add(newNode);
           }
           else if(node.getRight()==null) {
               node.setRight(newNode);
               q.add(newNode);
               q.remove();
           }
        }
    }
    
     public void inOrder(TreeNode root) {
        if(root==null)
             return;
        inOrder(root.getLeft());
        System.out.print(root.getVal()+"-->");
        inOrder(root.getRight());
    }
     
    public void levelOrder(TreeNode root) {
        TreeNode ptr=root;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(ptr);
        while(!q.isEmpty()) {
            ptr=q.remove();
            System.out.print(ptr.getVal()+"->");
            if(ptr.getLeft()!=null) {
                q.add(ptr.getLeft());
            }
            if(ptr.getRight()!=null) {
                q.add(ptr.getRight());
            }
        }
    } 
    
    //Time Complexity O(n)
    //Space Complexity O(n)
    public void levelOrderSpiralPrint(TreeNode root) {
        if(root==null)
             return;
         Stack<TreeNode> stack1=new Stack<TreeNode>();
         Stack<TreeNode> stack2=new Stack<TreeNode>();
         stack1.push(root);
         while(!stack1.empty() || !stack2.empty()) {
             TreeNode temp;
             while(!stack1.empty()) {
                 temp=stack1.pop();
                 System.out.print(temp.getVal()+"-->");
                 if(temp.getRight()!=null)
                     stack2.push(temp.getRight());
                 if(temp.getLeft()!=null)
                     stack2.push(temp.getLeft());
             }
             while(!stack2.empty()) {
                 temp=stack2.pop();
                 System.out.print(temp.getVal()+"-->");
                 if(temp.getLeft()!=null)
                     stack1.push(temp.getLeft());
                 if(temp.getRight()!=null)
                     stack1.push(temp.getRight());
             }
         }
    }
    
    //Iterative using queue
    public boolean checkChildrenSum(TreeNode root)
    {
        TreeNode ptr=root;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(ptr);
        while(!q.isEmpty()) {
            int sum=0;
            ptr=q.remove();
            if(ptr.getLeft()!=null) {
                q.add(ptr.getLeft());
                sum+=(int)ptr.getLeft().getVal();
            }
            if(ptr.getRight()!=null) {
       
                q.add(ptr.getRight());
                sum+=(int)ptr.getRight().getVal();
            }
            
           if((int)ptr.getVal()!=sum && ptr.getLeft()!=null && ptr.getRight()!=null)
               return false;
           if((int)ptr.getVal()!=sum && 
              ((ptr.getLeft()!=null && ptr.getRight()==null)||(ptr.getLeft()==null && ptr.getRight()!=null)) ) 
             return false;  
        }     
       return true;
    }
    /*
     Given a binary tree, write a function that returns true if the tree satisfies below property.
     For every node, data value must be equal to sum of data values in left and right children.
     Consider data value as 0 for NULL children. 
    */
    public boolean checkChildrenSumRecursive(TreeNode root) {
     int leftSum=0;
     int rightSum=0;
     if(root==null ||(root.getLeft()==null && root.getRight()==null)) 
         return true;
     else {
          if(root.getLeft()!=null) 
             leftSum=(int)root.getLeft().getVal();
          if(root.getRight()!=null) 
             rightSum=(int)root.getRight().getVal();
          if( ((int)root.getVal()==leftSum+rightSum) && 
                checkChildrenSumRecursive(root.getLeft()) 
                &&
                checkChildrenSumRecursive(root.getRight())
                )
            return true;
     }
     return false;   
    }
    public TreeNode getRoot() {
        return root;
    }
}
public class SpiralLevelOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SpiralPrint t=new SpiralPrint();
        t.insertNode(10);
        t.insertNode(20);
        t.insertNode(30);
        t.insertNode(40);
        t.insertNode(50);
        t.insertNode(60);//violates children sum property
        
        //t.insertNode(70);
        //t.insertNode(80);
        //t.insertNode(90);
        System.out.println("Level Order traversal of given tree");
        t.levelOrder(t.getRoot());
        System.out.println("\nLevel Order traversal of given tree in spiral order");
        t.levelOrderSpiralPrint(t.getRoot());
        if(t.checkChildrenSumRecursive(t.getRoot()))
            System.out.println("\nThe given tree satisfies the children sum property ");
        else
            System.out.println("\nThe given tree does not satisfy the children sum property ");
    }
    
}
