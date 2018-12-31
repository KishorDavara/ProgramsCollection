package DynamicProgramming;
/**
 *
 * @author KK Davara
 */
public class MaximumProductSubArray {

    /**
     * @param args the command line arguments
     */
    public static int maxProductSubArray(int a[])
    {
       int max=a[0];
       int positivehistory=a[0];
       int negativehistory=a[0];
       for(int i=1;i<a.length;i++)
       {
           positivehistory*=a[i];
           negativehistory*=a[i];
           if(negativehistory>positivehistory)
           {
               positivehistory^=negativehistory;
               negativehistory^=positivehistory;
               positivehistory^=negativehistory;
           }
           positivehistory=Math.max(positivehistory,a[i]);
           negativehistory=Math.min(negativehistory,a[i]);
           max=Math.max(positivehistory,max);
       }
       return max;
    }
    public static void main(String[] args) {
        int nums[]={3,-1,4};
        //int nums[]={0,2};
        //int nums[]={-4,-3};
        //int nums[]={-4,-3,-2};
        System.out.println("Maximum product subarray is "+maxProductSubArray(nums));
    }
    
}