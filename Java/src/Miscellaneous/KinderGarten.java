/*
Alice is a teacher of kindergarten. She wants to give some candies to the children in her class.
All the children sit in a line and each of them has a rating score according to his or her usual performance.
Alice wants to give at least 1 candy for each children. Because children are somehow jealousy.
Alice must give her candies according to their ratings subjects to for any adjacent 2 children if one's rating is higher than the other he/she must get more candies than the other.
Alice wants to save money so she wants to give as few as candies in total.
 */
package Miscellaneous;

import java.util.Scanner;

/**
 *
 * @author KK Davara
 */
public class KinderGarten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int []rating=new int[N];
      int sum[]=new int[N];
      for(int i=0;i<N;i++) {
          rating[i]=sc.nextInt();
          sum[i]=1;
      }
     
      for(int i=1;i<N;i++) {
          if(rating[i]>rating[i-1]) {
              sum[i]=Math.max(sum[i-1]+1,sum[i]);
          }
      }
      
      for(int i=N-2;i>=0;i--) {
          if(rating[i]>rating[i+1]) {
              sum[i]=Math.max(sum[i+1]+1,sum[i]);
          }
      }
      
     int minCost=0;
     for(int i=0;i<N;i++) {
         minCost+=sum[i];
     }
     
     System.out.println("Minimum cost for distributing candies will be "+minCost);
   }
}
