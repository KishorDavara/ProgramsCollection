package DynamicProgramming;

import java.util.Scanner;

/**
 *
 * @author KK Davara
 */
//We have to find the maximum revenue by cutting the road into smaller size

public class CuttingRoad {

    public static int max(int a,int b)
    {
        return (a>b?a:b);
    }
    public static int cutRoad(int price[],int roadSize)
    {
        int val[]=new int[roadSize+1];
        val[0]=0;
        int max_value=0;
        for(int i=1;i<=roadSize;i++)
        {
            max_value=0;
            for(int j=0;j<i;j++)
            {
                max_value=max(max_value,price[j]+val[i-j-1]);
            }
            val[i]=max_value;
        }
        return val[roadSize];
    }
    public static void main(String[] args) {
         int price[] = {1, 5, 8, 9, 10, 17, 17,20,24,30};
         Scanner sc=new Scanner(System.in);
         int roadSize;
         System.out.println("Enter the road size:");
         roadSize=sc.nextInt();
         System.out.println("Maximum revenue for cutting the road is : "+cutRoad(price, roadSize));
    }
    
}
