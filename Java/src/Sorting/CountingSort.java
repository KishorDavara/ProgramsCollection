/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author KK Davara
 */
public class CountingSort {

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
    public static void CountSort(int a[])
    {
        int m=max(a);
        int b[]=new int[m+1];
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[a[i]]++;
        }
        for(int i=1;i<=m;i++)
        {
            b[i]=b[i-1]+b[i];
        }
        for(int i=a.length-1;i>=0;i--)
        {
           c[b[a[i]]-1]=a[i];
           b[a[i]]--;
        }
        for(int i=0;i<a.length;i++)
        {
            a[i]=c[i];
        }
    }
    public static void main(String[] args) {
       int array[]={4,5,8,1,2,1,0,3,5,2,4,3,0};
       CountSort(array);
       for(int i=0;i<array.length;i++)
           System.out.print(array[i]+" ");
    }
    
}
