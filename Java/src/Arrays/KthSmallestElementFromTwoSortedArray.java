/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author KK Davara
 */
public class KthSmallestElementFromTwoSortedArray {

    /**
     * @param args the command line arguments
     */
    public static int kthSmallestElement(int []list1,int []list2,int k) {    // O(k)
      if(list1==null || list2==null) {
          throw new IllegalArgumentException("Arrays can not be empty");
      }
      int sizeA=list1.length;
      int sizeB=list2.length;
      if(k<0 || k>sizeA+sizeB) {
          throw new IllegalArgumentException("k is not within the range");
      }
      int i=0;
      int j=0;
      int count=0;
      int smallest=list1[i];
      while(count!=k && i<list1.length && j<list2.length) {             
       if(list1[i]<=list2[j]) {
          smallest=list1[i];
           i++;
          count++;
       }   
       else if(list2[j]<list1[i]){
           smallest=list2[j];
           j++;
           count++;
       }
      }
      
      while(i<list1.length && count!=k) {
              smallest=list1[i];
               i++;
              count++;
      }
      
      while(j<list2.length && count!=k) {
              smallest=list2[j];
              j++;
              count++;
      }
      
      return smallest;
    }
    public static void main(String[] args) {
      int[] list1 ={ 3, 4, 10, 23,45,55, 56, 58, 60, 65 };
      int[] list2 ={ 3, 3, 3, 15, 16, 28,50, 70, 71 };
      int k = 19;
      System.out.println("Kth Smallest Element From the Given two list is "+kthSmallestElement(list1, list2, k));
    }
    
}
