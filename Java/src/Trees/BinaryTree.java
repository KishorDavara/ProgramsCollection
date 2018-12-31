package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author KK Davara
 */
class TreeNode 
{
    private Object val;
    private TreeNode left;
    private TreeNode right;

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

class Tree
{
    TreeNode root;
    Queue<TreeNode> q=new LinkedList<TreeNode>();
    Tree() {
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
   // public static int countExternal=0;
    public int noOfExternalNode(TreeNode root) {
        /*if(root!=null) {
            if(root.getLeft()==null && root.getRight()==null) {
                countExternal++;
            }
            else if(root.getLeft()!=null && root.getRight()!=null) {
                noOfExternalNode(root.getLeft());
                noOfExternalNode(root.getRight());
            }
            else if(root.getLeft()!=null) {
                noOfExternalNode(root.getLeft());
            }
            else if(root.getRight()!=null) {
                noOfExternalNode(root.getRight());
            }
        }
      return countExternal;*/
        if(root==null)
            return 0;
        if(root.getLeft()==null && root.getRight()==null)
            return 1;
        else
            return noOfExternalNode(root.getLeft())+noOfExternalNode(root.getRight());
    }
    
    //public static int countInternal=0;
    public int noOfInternalNode(TreeNode root) {
       /* if(root!=null) {
            if(root.getLeft()!=null && root.getRight()!=null) {
                countInternal++;
                noOfInternalNode(root.getLeft());
                noOfInternalNode(root.getRight());
            }
            else if(root.getLeft()!=null) {
                countInternal++;
                noOfInternalNode(root.getLeft());
            }
            else if(root.getRight()!=null) {
                countInternal++;
                noOfInternalNode(root.getRight());
            }
        }
      return countInternal;*/
        if(root==null)
             return 0;
        if(root.getLeft()!=null || root.getRight()!=null)
              return 1+noOfInternalNode(root.getLeft())+noOfInternalNode(root.getRight());
          
        return 0;
    }
    
    public int heightOfTree(TreeNode root) {
        if(root==null) {
            return -1;
        }
        return 1+Math.max(heightOfTree(root.getLeft()),heightOfTree(root.getRight()));
    }
    
    public int heightOfNode(TreeNode root) {
        if(root==null) {
            return -1;
        }
        return 1+Math.max(heightOfTree(root.getLeft()),heightOfTree(root.getRight()));
    }
    
    public void inOrder(TreeNode root) {
        if(root==null)
             return;
        inOrder(root.getLeft());
        System.out.print(root.getVal()+"-->");
        inOrder(root.getRight());
    }
    
    public void preOrder(TreeNode root) {
        if(root==null)
             return;
        System.out.print(root.getVal()+"-->");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    
    public void postOrder(TreeNode root) {
        if(root==null)
             return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getVal()+"-->");
    }
    
    public void levelOrder(TreeNode root) {
        if(root==null) 
            return;
        Queue<TreeNode> level=new LinkedList<>();
        level.add(root);
       /* while(root!=null){
         if(root.getLeft()!=null)
            level.add(root.getLeft());
         if(root.getRight()!=null)
            level.add(root.getRight());
         System.out.print(root.getVal()+"-->");
         level.remove();
         root=level.peek();
        }*/
        while(!level.isEmpty()){
         root=level.remove();  
         if(root.getLeft()!=null)
            level.add(root.getLeft());
         if(root.getRight()!=null)
            level.add(root.getRight());
         System.out.print(root.getVal()+"-->");
        }
    }
    
    public void levelOrderLineWise(TreeNode root) {
        if(root==null) 
            return;
        Map<TreeNode,Integer> map=new HashMap<>();
        Queue<TreeNode> level=new LinkedList<>();
        level.add(root);
        map.put(root,0);
        int line=0;
        while(root!=null){
        if(root.getLeft()!=null){
            level.add(root.getLeft());
            map.put(root.getLeft(),map.get(root)+1);
        }
        if(root.getRight()!=null){
            level.add(root.getRight());
            map.put(root.getRight(),map.get(root)+1);
        }
        
         System.out.print(root.getVal()+"-->");
         level.remove();
         root=level.peek();
         if(root!=null && map.get(root)==line+1) {
             line++; 
             System.out.println();
         }
        }
    }
    
    public void levelOrderReverse(TreeNode root){
      if(root==null)
           return;
      Queue<TreeNode> q=new LinkedList<TreeNode>();
      Stack<TreeNode> s=new Stack<TreeNode>();
      q.add(root);
      s.push(root);
      while(!q.isEmpty()){
         root=q.remove();
       if(root.getRight()!=null){
           q.add(root.getRight());
           s.push(root.getRight());
       }
       if(root.getLeft()!=null){
           q.add(root.getLeft());
           s.push(root.getLeft());
       }
      }
      while(!s.empty()){
          System.out.print(s.pop().getVal()+" "); 
      }
    }
    
    public TreeNode getRoot() {
        return root;
    }
    
    public void deleteBT(TreeNode root) {
        if(root==null)
            return;
        else {
           
            deleteBT(root.getLeft());
            deleteBT(root.getRight());
            System.out.println("The node which is deleted is.."+root.getVal());
            root.setLeft(null);
            root.setRight(null);
            root=null;
            //System.gc();
        }
    }
    public void _deleteBT(TreeNode root) {
        deleteBT(root);
        //System.gc();
        root=null;
        //System.gc();
    }
    
    //Mirror Image
    public void mirrorImage(TreeNode root) {
        if(root==null)
             return;
        mirrorImage(root.getLeft());
        mirrorImage(root.getRight());
        //Swap the root.left && root.right
        TreeNode temp=root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);
    }
}
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree t=new Tree();
        t.insertNode(10);
        t.insertNode(20);
        t.insertNode(30);
        t.insertNode(40);
        t.insertNode(50);
        t.insertNode(60);
        t.insertNode(70);
        t.insertNode(80);
        t.insertNode(90);
        
        //t.insertNode("Hello");
        //t.insertNode(t);
        System.out.println("Inorder Traversal Of the given tree:");
        t.inOrder(t.getRoot());
        System.out.println("\nPreorder Traversal Of the given tree:");
        t.preOrder(t.getRoot());
        System.out.println("\nPostorder Traversal Of the given tree:");
        t.postOrder(t.getRoot());
        System.out.println("\nLevelOrder Traversal Of the given tree:");
        t.levelOrder(t.getRoot());
        System.out.println("\nLevelOrder Reverse Traversal Of the given tree:");
        t.levelOrderReverse(t.getRoot());
        System.out.println("\nLevelOrder Traversal Of the given tree Level wise:");
        t.levelOrderLineWise(t.getRoot());
        System.out.println("\nNumber of exteral node in the given tree is "+t.noOfExternalNode(t.getRoot()));
        System.out.println("\nNumber of interal node in the given tree is "+t.noOfInternalNode(t.getRoot()));
        System.out.println("\nHeight of the given tree is "+t.heightOfTree(t.getRoot()));
        System.out.println("\nHeight of the given node is "+t.heightOfNode(t.getRoot().getLeft().getLeft()));
        //***********************************************
        /*t._deleteBT(t.getRoot());
        System.out.println("\nNumber of exteral node in the given tree is "+t.noOfExternalNode(t.getRoot()));
        System.out.println("\nNumber of interal node in the given tree is "+t.noOfInternalNode(t.getRoot()));
        System.out.println("\nHeight of the given tree is "+t.heightOfTree(t.getRoot()));
        //System.out.println("\nHeight of the given node is "+t.heightOfNode(t.getRoot().getLeft().getLeft()));
        */
        //***********************************************
        t.mirrorImage(t.getRoot());
        System.out.println("Mirror Image of the binary tree is:");
        System.out.println("Inorder Traversal Of the given tree:");
        t.inOrder(t.getRoot());
        System.out.println("\nHeight of the given tree is "+t.heightOfTree(t.getRoot()));
    }
    
}
