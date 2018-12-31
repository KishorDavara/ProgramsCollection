package Strings;
/**
 *
 * @author KK Davara
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grid {
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int T=Integer.parseInt(br.readLine()); 
        while(T>0) {
         int N=Integer.parseInt(br.readLine());
          String []str=new String[N];
          int i=0;
            while(i<N) {
             str[i]=new String(br.readLine());
             i++;
          } 
         for(i=0;i<str.length;i++) {
           char c[]=str[i].toCharArray();
           Arrays.sort(c);
           str[i]=new String(c);
          }  
         /*   System.out.println("");
         for(i=0;i<N;i++) {
             System.out.println(str[i]); 
         }*/
         int flag=1;
         for(i=1;i<N;i++) {
             for(int j=0;j<N;j++) {
               if(str[i-1].charAt(j)>str[i].charAt(j)){
                  flag=0;
                  break;
               }   
             }
         }
         if(flag==1) {
             System.out.println("YES");
         }
         else
         {
             System.out.println("NO");
         }
         T--;
        }
    }
}