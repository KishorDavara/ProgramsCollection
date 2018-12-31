package Sorting;
/**
 *
 * @author KK Davara
 */
public class InsertionSort {

    public static void insertionSort(int a[])
    {
        int val=0,hole=0;
        for(int i=1;i<a.length;i++)
        {
            val=a[i];
            hole=i;
            while(hole>0 && a[hole-1]>val)
            {
                a[hole]=a[hole-1];
                hole--;
            }
            a[hole]=val;
        }
    }
    public static void main(String[] args) {
        int array[]={45,1,23,98,7,12,56,89,74};
        insertionSort(array);
        for(int i=0;i<array.length;i++)
           System.out.print(array[i]+" ");
    }
    
}
