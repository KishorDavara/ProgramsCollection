/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

/**
 *
 * @author KK Davara
 */
public class SubMatrixWithLargetSum {

    /**
     * @param args the command line arguments
     */
    public static int maxSubArray(int a[])
    {   
        int maxSum=a[0];
        int startindex=0,endindex=0,sum=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(sum<0)
            {
                sum=a[i];
                startindex=i;
            }
            else
            {
                sum+=a[i];
            }
            if(sum>maxSum)
            {
                maxSum=sum;
                endindex=i;
            }
        }
        //System.out.println("Maximum sum subarray is between index "+(startindex)+" and "+endindex);
        return maxSum;
    }
    
    public static int maximumSumSubMatrix(int matrix[][]) {
      int maxSum=0;
       for (int left = 0; left < matrix[0].length; left++)
       {
          int temp[] =new int[matrix.length];
 
           for (int right = left; right < matrix[0].length; right++)
          {
            // Find sum of every mini-row between left and right columns and save it into temp[]
            for (int i = 0; i < matrix.length; ++i)
                temp[i] += matrix[i][right];
 
            // Find the maximum sum subarray in temp[].
            int sum = maxSubArray(temp);
 
            if (sum > maxSum)
                maxSum = sum;
        }
    }
      return maxSum;
    }
    public static void main(String[] args) {
        int M[][] = {{1, 2, -1, -4, -20},
                       {-8, -3, 4, 2, 1},
                       {3, 8, 10, 1, 3},
                       {-4, -1, 1, 7, -6}
                      };
        System.out.println("Maximum sum of the submatrix is "+maximumSumSubMatrix(M));
    }
    
}
