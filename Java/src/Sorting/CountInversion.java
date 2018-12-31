 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author KK Davara
 */
public class CountInversion {

    /**
     * @param args the command line arguments
     */
    public static int countInversion(int a[]) {
     if(a.length<=1)
         return 0;
     int countLeft=0,countRight=0,countMerge=0;
     int k;
     int mid=a.length/2;
     int []left=new int[mid];
     int []right=new int[a.length-mid];
      for (k = 0; k < mid; k++)
          left[k]=a[k];
      for (k = 0; k < a.length - mid; k++)
           right[k] = a[mid+k];
      countLeft=countInversion(left);
      countRight=countInversion(right);
      int []result=new int[a.length];
      countMerge=countMerge(left,right,result);
    for(k=0;k<a.length;k++) {
        a[k]=result[k];
    }
    return (countLeft+countRight+countMerge);
    }
    
    public static int countMerge(int []left,int []right,int []result) {
     int count=0;
     int i=0;
     int j=0;
     int k=0;
     while(i<left.length && j<right.length) {
         if(left[i]<=right[j]) {
             result[k++]=left[i++];
         }
         else{
             result[k++]=right[j++];
             count+=left.length-i;
         }
     }
     while(i<left.length){
         result[k++]=left[i++];
     }
     while(j<right.length){
         result[k++]=right[j++];
     }
     return count;
    } 
    public static void main(String[] args) {
       //int a[]={2,4,1,3,5};
       int a[]={1,4,3,2,7,5,6,10,9};
        System.out.println("Number of Inversion in the given array is "+countInversion(a));
       for(int i=0;i<a.length;i++) {
           System.out.println(a[i]);
       }
    }
    
}
