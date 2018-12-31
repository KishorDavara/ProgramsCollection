/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author KK Davara
 */
class LevelOrderPrint
{
    TreeNode root;
    Queue<TreeNode> q=new LinkedList<TreeNode>();
    public LevelOrderPrint()
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
    
    public void levelBylevelTravesalUsingTwoQueue(TreeNode root){
      if(root==null) {
          return;
      }  
      Queue<TreeNode> q1=new LinkedList<TreeNode>();
      Queue<TreeNode> q2=new LinkedList<TreeNode>();
      q1.add(root);
      while(!q1.isEmpty() || !q2.isEmpty()){
          while(!q1.isEmpty()) {
              root=q1.poll();
              System.out.print(root.getVal()+" ");
              if(root.getLeft()!=null) {
                 q2.offer(root.getLeft());
              }
              if(root.getRight()!=null) {
                 q2.offer(root.getRight());
              }
          }
          System.out.println();
          while(!q2.isEmpty()) {
              root=q2.poll();
              System.out.print(root.getVal()+" ");
              if(root.getLeft()!=null) {
                 q1.offer(root.getLeft());
              }
              if(root.getRight()!=null) {
                 q1.offer(root.getRight());
              }
          }
          System.out.println();
      }
    } 
    public TreeNode getRoot() {
        return root;
    }
    public void levelBylevelTravesalUsingOneQueueAndDelimiter(TreeNode root){
        if(root==null)
             return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            root=q.poll();
            if(root!=null){
                System.out.print(root.getVal()+" ");
                if(root.getLeft()!=null){
                  q.offer(root.getLeft());
                }
                if(root.getRight()!=null){
                  q.offer(root.getRight());
                }
            }
            else {
                if(!q.isEmpty()){
                    System.out.println();
                    q.add(null);
                }
            }
        }
    } 
    
}
public class LevelOrderTraversalLineWise {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        LevelOrderPrint t=new LevelOrderPrint();
        t.insertNode(10);
        t.insertNode(20);
        t.insertNode(30);
        t.insertNode(40);
        t.insertNode(50);
        t.insertNode(60);
        t.levelBylevelTravesalUsingTwoQueue(t.getRoot());
        t.levelBylevelTravesalUsingOneQueueAndDelimiter(t.getRoot());
    }
    
}
