package Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author KK Davara
 */
public class MaximumOccuringChar {
   /*
    write a function that returns the element which is having maximum occourance in the given string
    char input_str [] = "the things are thin"
    So it will returns "t" as it's occourance is 3 times.
     */
    public static char findMaximumOccuringCharacter(String str)
    {
        HashMap<Character,Integer> charmap=new HashMap<Character,Integer>();
        char currentChar;
        for(int i=0;i<str.length();i++)
        {
            
            currentChar=str.charAt(i);
            if(charmap.containsKey(currentChar))
            	charmap.put(currentChar,charmap.get(currentChar)+1);
            else
                charmap.put(currentChar,1);
               
        }
        int max=Collections.max(charmap.values());
        
        char maxCharacter='0';
        for(Entry<Character,Integer> entry : charmap.entrySet())
        {
           if(entry.getValue()==max)
           {
               maxCharacter=entry.getKey();
           }
        }
        
        return maxCharacter;      
    }
    public static void main(String[] args) {
     String str="hello friend how are you...";
     //="the things are thin";
     System.out.println("Maximum Occured Character of the given string is "+findMaximumOccuringCharacter(str));
    }
    
}
