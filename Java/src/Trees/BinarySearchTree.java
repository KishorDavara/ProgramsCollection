/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author KK Davara
 */
class BST {

    private TreeNode root;

    public BST() {
        root = null;
    }

    public TreeNode insertNode(TreeNode root, int val) {

        if (root == null) {
            TreeNode node = new TreeNode();
            node.setVal(val);
            node.setLeft(null);
            node.setRight(null);
            root = node;
        } else {
            if ((int) root.getVal() <= val) {
                root.setRight(insertNode(root.getRight(), val));
            } else if ((int) root.getVal() > val) {
                root.setLeft(insertNode(root.getLeft(), val));
            }
        }
        return root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode node) {
        root = node;
    }
    
    public boolean searchElement(TreeNode ptr,int val){
        if(ptr==null)
            return false;
        if((int)ptr.getVal()==val)
            return true;
        if((int)ptr.getVal()<val)
            return searchElement(ptr.getRight(),val);
        //else if((int)ptr.getVal()>val)
       return searchElement(ptr.getLeft(),val); 
     //return false;   
    }
    
    public TreeNode findMin(TreeNode root) {
        if(root.getLeft()==null)
            return root;
        return findMin(root.getLeft());
    }
    
    public TreeNode deleteElement(TreeNode root,int val) {
        if(root==null)
            return root;
        if((int)root.getVal()<val) 
            root.setRight(deleteElement(root.getRight(), val));
        else if((int)root.getVal()>val) 
            root.setLeft(deleteElement(root.getLeft(), val));
        else {
            //Case 1: No Children
            if(root.getLeft()==null && root.getRight()==null) {
                root=null;
            }
            //Case 2 : One Children
            else if(root.getLeft()==null) {
                TreeNode temp=root;
                root=root.getRight();
                temp=null;
            }
            else if(root.getRight()==null) {
                TreeNode temp=root;
                root=root.getLeft();
                temp=null;
            }
            //Case 3: Two Children
            else {
              TreeNode temp=findMin(root.getRight());
              root.setVal(temp.getVal());
              root.setRight(deleteElement(root.getRight(),(int)temp.getVal()));
            }
        }
        return root;
    }
    
    public void preOrderTraversal(TreeNode root) {
     Stack<TreeNode> stack=new Stack<TreeNode>();
     stack.push(root);
      System.out.println("\nPreOrder Traversal is");
     while(!stack.empty()) {
         TreeNode node=stack.pop();
         System.out.print((int)node.getVal()+"->");
         if(node.getRight()!=null)
               stack.push(node.getRight());
         if(node.getLeft()!=null)
               stack.push(node.getLeft());
     }
    }
    
    public void postOrderTraversal(TreeNode root) {
         Stack<TreeNode> stack=new Stack<TreeNode>();
         stack.push(root);
         ArrayList<String> postorder=new ArrayList<String>();
     while(!stack.empty()) {
         TreeNode node=stack.pop();
         postorder.add(node.getVal().toString());
         if(node.getLeft()!=null)
               stack.push(node.getLeft());
         if(node.getRight()!=null)
               stack.push(node.getRight());
     }
        Collections.reverse(postorder);
        Iterator<String> itr=postorder.iterator();
        System.out.println("\nPostOrder Traversal is");
        while(itr.hasNext()){
            System.out.print(itr.next()+"->");
        }
    }
    
    public void inOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        TreeNode current=root;
        System.out.println("\nInOrder Traversal is");
        while(!stack.empty() || current!=null) {
            if(current!=null) {
                stack.push(current);
                current=current.getLeft();
            }
            else {
                TreeNode node=stack.pop();
                System.out.print(node.getVal()+"->");
                current=node.getRight();
            }
        }
    }
}

public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BST bst = new BST();
        bst.setRoot(bst.insertNode(bst.getRoot(), 10));
        bst.setRoot(bst.insertNode(bst.getRoot(), 15));
        bst.setRoot(bst.insertNode(bst.getRoot(), 5));
        bst.setRoot(bst.insertNode(bst.getRoot(), 22));
        bst.setRoot(bst.insertNode(bst.getRoot(), 45));
        bst.setRoot(bst.insertNode(bst.getRoot(), 3));
        bst.setRoot(bst.insertNode(bst.getRoot(),8));
        bst.setRoot(bst.insertNode(bst.getRoot(),12));
        bst.setRoot(bst.insertNode(bst.getRoot(),40));
        bst.preOrderTraversal(bst.getRoot());
        bst.postOrderTraversal(bst.getRoot());
        bst.inOrderTraversal(bst.getRoot());
        
        if(bst.searchElement(bst.getRoot(),22))
          System.out.println("\nElement 22 is present");
        else
          System.out.println("\nElement 22 is not present");
        
        //Delete Element
        //bst.setRoot(bst.deleteElement(bst.getRoot(),40));
        //bst.setRoot(bst.deleteElement(bst.getRoot(),45));
        bst.setRoot(bst.deleteElement(bst.getRoot(),10));
        bst.preOrderTraversal(bst.getRoot());
        bst.postOrderTraversal(bst.getRoot());
        bst.inOrderTraversal(bst.getRoot());
    }

}
