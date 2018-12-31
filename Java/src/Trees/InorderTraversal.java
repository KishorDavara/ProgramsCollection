/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author KK Davara
 */
class InorderTree
{
   TreeNode root;
    Queue<TreeNode> q=new LinkedList<TreeNode>();
    InorderTree() {
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
    
  public ArrayList<Integer> inorderTraversal(TreeNode root) {
      ArrayList<Integer> inorder=new ArrayList<>();
      Stack<TreeNode> stack=new Stack<TreeNode>();
      TreeNode current=root;
    
      while(!stack.empty() || current!=null) {
          if(current!=null) {
              stack.push(current);
              current=current.getLeft();
          }
          else {
              TreeNode node=stack.pop();
              inorder.add((int)node.getVal());
              current=node.getRight();
          }
      }
      return inorder;
  }  
    
  public TreeNode getRoot() {
      return root;
  }  
  
}
public class InorderTraversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InorderTree t=new InorderTree();
        t.insertNode(10);
        t.insertNode(20);
        t.insertNode(30);
        t.insertNode(40);
        t.insertNode(50);
        t.insertNode(60);
        t.insertNode(70);
        t.insertNode(80);
        t.insertNode(90);
        ArrayList<Integer> inorder=t.inorderTraversal(t.getRoot());
        Iterator<Integer> itr=inorder.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+"-->");
        }
    }
    
}
