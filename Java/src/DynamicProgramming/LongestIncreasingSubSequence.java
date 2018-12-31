/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

/**
 *
 * @author KK Davara
 */
public class LongestIncreasingSubSequence {
    /**
     * @param args the command line arguments
     */
    public static int longestIncreasingSubSequence(int a[]) {
     int max=0;
     int [] count=new int[a.length];
     count[0]=1;
     for(int i=1;i<a.length;i++) {
         count[i]=1;
         for(int j=0;j<i;j++) {
             if(a[i]>a[j] && count[i]<count[j]+1) {
                 count[i]=count[j]+1;
             }
         }
     }
     for(int i=0;i<a.length;i++) {
      if(max<count[i])
          max=count[i];
     }
     return max;
    }
    public static void main(String[] args) {
      int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println("Longest increasing subsequence is of the length "+longestIncreasingSubSequence(arr));
    }
    
}
