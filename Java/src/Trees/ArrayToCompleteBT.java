/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.Stack;

/**
 *
 * @author KK Davara
 */
class CompleteBT
{
    TreeNode root;

    public CompleteBT() {
    root=null;
    }
    
    public TreeNode getRoot()
    {
        return root;
    }
    
    public void setRoot(TreeNode node) {
        root=node;
    }
    
    public TreeNode insertNode(TreeNode root,int []a,int index) {
        if(index>a.length-1) {
            return null;
        }
        if(root==null) {
          TreeNode node=new TreeNode();  
          node.setVal(a[index]);
          node.setLeft(null);
          node.setRight(null);
          root=node;
        } 
        root.setLeft(insertNode(root.getLeft(),a,2*index+1));
        root.setRight(insertNode(root.getRight(),a,2*index+2));
      return root;
    }
    
    public void preOrder(TreeNode root) {
        if(root==null)
            return;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.empty()) {
           TreeNode node=stack.pop();
           System.out.print(node.getVal()+"->");
           if(node.getRight()!=null) {
               stack.push(node.getRight());
           }
           if(node.getLeft()!=null) {
               stack.push(node.getLeft());
           }
        }
    }
    
    
    
}
public class ArrayToCompleteBT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int []a={1,2,3,4,5,6,7,8,9,10,11};   
     CompleteBT bt=new CompleteBT();
     bt.setRoot(bt.insertNode(bt.getRoot(),a,0));
     bt.preOrder(bt.getRoot());
     
    }
    
}
