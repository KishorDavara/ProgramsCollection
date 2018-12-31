/*
 Given a list of non negative integers, arrange them such that they form the largest number.
For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.
 */
package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author KK Davara
 */
public class LargestNum {

   public static String largestNumber(final List<Integer> A) {
	 
	    if(A.size()==0)
	      return "";
	    String []arr=new String[A.size()];
	    
	    for(int i=0;i<A.size();i++)
	    {
	        arr[i]=String.valueOf(A.get(i));
	    }
	    
	    Arrays.sort(arr, comparator);
	    
	    String result = "";
    	
    	for (String str: arr) {
            System.out.println(str);
    		result = str + result;
    	}
    	  //System.out.println("Result "+result);
    	int i = 0; 
        //handle special case where string contains all 0
    	while(result.charAt(i)=='0' && i<result.length()-1) 
    	  i++;
    	
    	return result.substring(i);
	}
   
	 public static Comparator<String> comparator = new Comparator<String>() {
 
		@Override
		public int compare(String o1, String o2) {
			String comb1 = o1 + o2; 
			String comb2 = o2 + o1;
			
			return comb1.compareTo(comb2);
		}
	};
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<Integer>();
        num.add(3);num.add(30);num.add(34);num.add(5);num.add(9);
        //num.add(0);num.add(0);
        System.out.println(largestNumber(num));
    }
    
}
