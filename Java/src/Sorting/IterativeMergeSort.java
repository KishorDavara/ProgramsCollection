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
public class IterativeMergeSort {

    /**
     * @param args the command line arguments
     */
    public static void merge(int A[],int p,int q,int r)
    {
        int N=r-p+1;
        int B[]=new int[N];
        int i=p,j=q+1,k=0;
        while(i<=q && j<=r)
        {
            if(A[i]<A[j])
            {
                B[k++]=A[i];
                i++;
            }
            else
             {
                B[k++]=A[j];
                j++;
            }   
        }
        while(i<=q)
        {
            B[k++]=A[i];
            i++;
        }
        while(j<=r)
        {
            B[k++]=A[j];
            j++;
        }
        for(i=0;i<N;i++)
            A[p+i]=B[i];
    }
    public static void mergeSort(int []a,int start,int end) {
        
    }
    public static void main(String[] args) {
       int array[]={16,4,10,14,7,9,3,2,8,1};
       mergeSort(array,0,9);
       for(int i=0;i<array.length;i++)
             System.out.print(array[i]+" ");
    }
    
}
