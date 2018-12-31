/*
 Write a Function to check if the given string contains the given number of unique characters 
(You should ignore case of character so a & A should be counted as same character.).
Input  :-  String :  NagarroisBestSoftwareCompany
	   N = 17
Output :- True or False 
 */
package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author KK Davara
 * {@link #containsNUniqueChars(String,int) containsNUniqueChars}
 */
public class CountOccurence {
   
    /**
     * @param args the command line arguments
     */
    public static boolean containsNUniqueChars(String str,int N){
        if(str==null && N>0)
             return false;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++) {
          if(map.containsKey(str.charAt(i))) {
              map.put(str.charAt(i),0);
          }  
          else {
              map.put(str.charAt(i),1);
          }
        }
        int count=0;
        for(Map.Entry entry:map.entrySet()) {
            if((int)entry.getValue()==1){
              count++;  
            }
        }
        if(N==count)
            return true;
        return false;
    }
    public static void main(String[] args) {
        String str="NagarroisBestSoftwareCompany";
        //int N=9;
        int N=9;
        if(containsNUniqueChars(str.toLowerCase(),N))
           System.out.println("String "+str+" contains "+N+" unique characters");
        else
            System.out.println("String "+str+" doesn't contains "+N+" unique characters");
       
    }
    
}
