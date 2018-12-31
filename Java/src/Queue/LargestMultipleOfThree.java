/*
 Given an array of non-negative integers. Find the largest multiple of 3 that can be formed from array elements.

For example, if the input array is {8, 1, 9}, the output should be “9 8 1″, 
and if the input array is {8, 1, 7, 6, 0}, output should be “8 7 6 0″.
This problem has been solved by 3 queue but it takes lot of space into memory so we can do it using 3 variable
*/
package Queue;

import java.util.ArrayList;
import static java.util.Arrays.sort;

/**
 *
 * @author KK Davara
 */
public class LargestMultipleOfThree {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Integer> findLargestMultipleOfThree(int []a) {
        ArrayList<Integer> ans=new ArrayList<>();
        int zero=-1,one=-1,two=-1;
        int sum=0;
        for(int i=0;i<a.length;i++ ) {
            sum+=a[i];
        }
        sort(a);
        if(sum%3==0) {
           for(int i=a.length-1;i>=0;i-- ) {
               ans.add(a[i]);
           } 
           return ans;
        }
        for(int i=0;i<a.length;i++) {
            if(sum%3==1) {
             
            }
            else  {
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       int []a={8,1,7,6,0};
       ArrayList<Integer> ans=findLargestMultipleOfThree(a);
    }
    
}
