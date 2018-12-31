/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author KK Davara
 */
class CheckBST {
    private TreeNode root;
    Queue<TreeNode> q=new LinkedList<TreeNode>();
    public CheckBST() {
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
    
    public boolean isValidBST(TreeNode root,double min,double max) {
       if(root==null)
             return true;
       if((double)root.getVal()<=min || (double)root.getVal()>=max) 
           return false;
        return isValidBST(root.getLeft(),min,(double)root.getVal()) && isValidBST(root.getRight(),(double)root.getVal(), max);
    }
    
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
    }
    
    public TreeNode getRoot() {
        return root;
    }
}

public class CheckCompleteBST {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        CheckBST t=new CheckBST();
        t.insertNode(6.0);
        t.insertNode(4.0);
        t.insertNode(8.0);
        t.insertNode(3.0);
        t.insertNode(5.0);
        t.insertNode(7.5);
        t.insertNode(6.8);
        System.out.println("Inorder Traversal is: ");
        t.inOrder(t.getRoot());
        if(t.isValidBST(t.getRoot()))
           System.out.println("\nThe Given tree is a binary search tree");
        else
            System.out.println("\nThe Given tree is not a binary search tree");
    }
    
}
