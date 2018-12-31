/*
 We are given a string of digits containing 1 and 0 
 1 represents head and 0 represents tail
 we have to convert tail into head to get the maximum tail 
 we have to convert tail into head which has maximum range
ex:10000011000100100 then modified string is
11111111000100100
We have to count number of head 
here in this case number of head is 10
 */
package Miscellaneous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author KK Davara
 */
public class FlipDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int count=0;
        int max=0;
        for(int i=0;i<str.length();i++) {
                while(i<str.length() && str.charAt(i)=='0') {
                  count++;
                  i++;
                }
                if(count>max) 
                    max=count;
                count=0;
        }
       count=0; 
       for(int i=0;i<str.length();i++) {
           if(str.charAt(i)=='1')
               count++;
       } 
       count+=max;
        System.out.println("Maximum number of head the string can have is "+count);
    }
    
}
