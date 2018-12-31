/*
 Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
Example: 
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
Asked In Amazon ,Google
 */
package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author KK Davara
 */
public class LongestConsecutiveOccurences {

    	public static int longestConsecutive(final List<Integer> A) {
	    int longestOccurences=1;
	    int count=1;
         Set<Integer> set=new HashSet<Integer>();
         for(Integer x:A) {
             set.add(x);
         }
         for(Integer x:A) {
             int left=x-1;
             int right=x+1;
             count=1;
             
             while(set.contains(left)) {
                 count++;
                 set.remove(left);
                 left--;
             }
             
             while(set.contains(right)) {
                 count++;
                 set.remove(right);
                 right++;
             }
            if(count>longestOccurences)  
                 longestOccurences=count;
         }
      	return longestOccurences;
    }
        
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(19);
        list.add(100);
        list.add(4);
        list.add(200);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(13);
        list.add(12);
        list.add(15);
        list.add(18);
        list.add(16);
        list.add(17);
        list.add(14);
        list.add(14);
        list.add(19);
        System.out.println("Longest Occuring Consecutive Sequence is of length "+longestConsecutive(list));
    }
    
}
