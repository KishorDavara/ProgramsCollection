/*
 You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

package DynamicProgramming;

/**
 *
 * @author KK Davara
 */
public class ClimbingStairs {
    public static int climbStairs(int n) {
        int step[]=new int[Math.max(n+1,3)];
        step[0]=0;
        step[1]=1;
        step[2]=2;
        for(int i=3;i<=n;i++)
        {
            step[i]=step[i-1]+step[i-2];
            /*If we are given that we are climbing 1 step or  j step at a time so for all i we have to check that (i-j)>=0 then only updated ans+=step[i-j] */
        }
        return step[n];
    }
    public static void main(String[] args) {
       System.out.println("Total distinct ways possible is "+climbStairs(4));
       System.out.println("Total distinct ways possible is "+climbStairs(5));
    }
    
}
