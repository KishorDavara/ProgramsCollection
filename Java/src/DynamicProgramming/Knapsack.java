/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

/**
 *
 * @author KK Davara
 */
public class Knapsack {

    /**
     * @param args the command line arguments
     */
    public static int maximumProfit(int []v,int w[],int weight){
         int n=v.length;
        int [][]dp=new int[n+1][weight+1];
        for(int i=0;i<n+1;i++) {
            dp[i][0]=0;
        }
        for(int i=0;i<weight+1;i++) {
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<weight+1;j++){
                if(j<w[i-1]){
                    dp[i][j]=dp[i-1][j];
                }          
                else {
                    dp[i][j]=Math.max(v[i-1]+dp[i-1][j-w[i-1]],dp[i-1][j]);
                }
            }
        }
        return dp[n][weight];
    }
    //Time Complexity would be O(n*weight)
    public static void main(String[] args) {
      int []wt={1,3,4,5};
      int []val={1,4,5,7};
      int w=7;
        System.out.println("Maximum Profit earned will be "+maximumProfit(val,wt,w));
    }
    
}
