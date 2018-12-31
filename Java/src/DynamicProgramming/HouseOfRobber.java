/*
 You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
package DynamicProgramming;

/**
 *
 * @author KK Davara
 */
public class HouseOfRobber {

    /**
     * @param args the command line arguments
     */
    public static int max(int a,int b)
    {
        return a>b?a:b;
    }
    public static void main(String[] args) {
     //int num[]={2,3,4,10,15};
     //int num[]={4,6,8,2,9};
     int num[]={4,6,8,9,2};
        int last = 0;
        int now = 0;
        int prev;
        for (int n :num) {
            prev = now;
            now = max(last + n, now);
            last = prev;
        }
     System.out.println("Maximum sum earned will be "+now);
    }
    
}
