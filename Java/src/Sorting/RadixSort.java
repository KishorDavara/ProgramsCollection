package Sorting;
/**
 *
 * @author KK Davara
 */
public class RadixSort {

    public static int max(int a[])
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
    public static void countSort(int a[],int exp)
    {
        int n=a.length;
        int count[]=new int[10];
        int output[]=new int[n];
        for(int i=0;i<n;i++)
        {
            count[(a[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++)
        {
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            output[count[(a[i]/exp)%10]-1]=a[i];
            count[(a[i]/exp)%10]--;
        }
        for(int i=0;i<n;i++)
            a[i]=output[i];
    }
    public static void RadixSort(int a[])
    {
       int m=max(a);
       for(int exp=1;m/exp>0;exp*=10)
       {
           countSort(a,exp);
       }
    }
    public static void main(String[] args) {
       int array[]={170,45,890,75,123,69,2,50};
       RadixSort(array);
       for(int i=0;i<array.length;i++)
           System.out.print(array[i]+" ");
    }
    
}
