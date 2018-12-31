/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author KK Davara
 */
class PostorderTree
{
   TreeNode root;
    Queue<TreeNode> q=new LinkedList<TreeNode>();
    PostorderTree() {
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
    
       
  public ArrayList<Integer> postorderTraversal(TreeNode root) {
      ArrayList<Integer> postorder=new ArrayList<>();
      Stack<TreeNode> stack=new Stack<TreeNode>();
      stack.push(root);
      
      while(!stack.empty()) {
          TreeNode node=stack.pop();
          
          postorder.add((int)node.getVal());
          
          if(node.getLeft()!=null) {
              stack.push(node.getLeft());
          }
          
          if(node.getRight()!=null) {
              stack.push(node.getRight());
          }
          
      } 
      Collections.reverse(postorder);
      return postorder;
  }  
  
   public TreeNode getRoot() {
      return root;
  }  
}
public class PostOrderTraversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PostorderTree t=new PostorderTree();
        t.insertNode(10);
        t.insertNode(20);
        t.insertNode(30);
        t.insertNode(40);
        t.insertNode(50);
        //t.insertNode(60);
        //t.insertNode(70);
        //t.insertNode(80);
        //t.insertNode(90);
        ArrayList<Integer> postorder=t.postorderTraversal(t.getRoot());
        Iterator<Integer> itr=postorder.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+"-->");
        }
    }
    
}
