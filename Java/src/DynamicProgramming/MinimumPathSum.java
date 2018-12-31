/*
  Given a m x n grid filled with non-negative numbers, 
  find a path from top left to bottom right which minimizes the sum of all numbers along its path.
  Note: You can only move either down or right at any point in time.
 */
package DynamicProgramming;
/**
 *
 * @author KK Davara
 */
public class MinimumPathSum {
    public static int minPathSum(int[][] grid) {
     int m=grid.length;
     int n=grid[0].length;
     
     for(int i=1;i<m;i++)
      grid[i][0]+=grid[i-1][0];
     
     for(int i=1;i<n;i++)
       grid[0][i]+=grid[0][i-1];
       
     for(int i=1;i<m;i++)
       for(int j=1;j<n;j++)
         grid[i][j]+=Math.min(grid[i][j-1],grid[i-1][j]); //if diagnolly we can move then grid[i-1][j-1];
         
     return grid[m-1][n-1];     
    }
    public static void main(String[] args) {
        int cost[][] ={ {1, 2, 3},
                        {4, 8, 2},
                        {1, 5, 3} };
        System.out.println("Minimum path cost is "+minPathSum(cost)); 
    }
    
}
