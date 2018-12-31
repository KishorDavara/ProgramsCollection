/*
 Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

  [
    ["aa","b"],
    ["a","a","b"]
  ]
 */
package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KK Davara
 */
public class PalindromicPartition {

    /**
     * @param args the command line arguments
     */
    public static List<String> palindromePartitioning(String s) {
 
	List<String> result = new ArrayList<String>();
 
	if (s == null)
		return result;
 
	if (s.length() <= 1) {
		result.add(s);
		return result;
	}
 
	int length = s.length();
 
	int[][] table = new int[length][length];
 
	// l is length, i is index of left boundary, j is index of right boundary
	for (int l = 1; l <= length; l++) {
		for (int i = 0; i <= length - l; i++) {
			int j = i + l - 1;
			if (s.charAt(i) == s.charAt(j)) {
				if (l == 1 || l == 2) {
					table[i][j] = 1;
				} else {
					table[i][j] = table[i + 1][j - 1];
				}
				if (table[i][j] == 1) {
					result.add(s.substring(i, j + 1));
				}
			} else {
				table[i][j] = 0;
			}
		}
	}
 
	return result;
}
    public static void main(String[] args) {
        List<String> list=palindromePartitioning("nitin");
	    for(int i=0;i<list.size();i++) {
	    	System.out.println(list.get(i)+" ");
	    }
    }
    
}
