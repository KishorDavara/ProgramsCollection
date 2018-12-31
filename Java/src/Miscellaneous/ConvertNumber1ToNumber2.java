/*
 Two Number A and B will given. We have to convert number A into number B into minimum number of moves
 We have to move only one digit at a time
 - Number A within rangle from 0<N<10^(10^10)
 */
package Miscellaneous;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author KK Davara
 */

public class ConvertNumber1ToNumber2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int N=Integer.parseInt(br.readLine());
      String A=br.readLine();
      String B=br.readLine();
      int count=0;
      for(int i=0;i<N;i++){
        int x=A.charAt(i)-48;
        int y=B.charAt(i)-48;
        if(x>y) {
          count+=Math.min(x-y,10-(Math.abs(x-y))); 
        }  
        else if(x<y) {
          count+=Math.min(y-x,10-(Math.abs(y-x)));  
        }
      }
      
        System.out.println("Number of minimum moves required to convert number "+A+" to number "+B+" is "+count);
    }
    
}
