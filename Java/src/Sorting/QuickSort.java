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
public class QuickSort {

    
    public static void swap(int arr[],int i,int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

public static int partition(int a[],int left,int right)
{
    //******************************************
    //First element as a pivot element
    ///*
    int pivot=a[left];
    int pindex=left;
    for(int i=left+1;i<=right;i++)
    {
        if(a[i]<=pivot)
        {
            pindex++;
            swap(a,pindex,i);
        }
    }
    swap(a,pindex,left);
    return pindex;
    //*/
    //*********************************************
    //Last Element As pivot Elements
    /*int pivot=a[right];
    int pindex=left-1;
    for(int i=left;i<right;i++)
    {
        if(a[i]<=pivot)
        {
            pindex++;
            swap(a,pindex,i);
        }
    }
    swap(a,pindex+1,right);
    return pindex+1;
    */
    //************************************************
    //Middle Element as a pivot element
     /*int i = left, j = right;
     int pivot = a[(left + right) / 2];
     while (i <= j) {
            while (a[i] < pivot)
                  i++;
            while (a[j] > pivot)
                  j--;
            if (i <= j) {
                swap(a,i,j);  
                i++;
                j--;
            }
      }
     return i;*/
}
    
public static void quickSort(int a[],int start,int end)
{
    if(start<end)
    {
        int pindex=partition(a,start,end);
        if(start<pindex-1)
           quickSort(a,start,pindex-1);
        if(pindex+1<end)
           quickSort(a,pindex+1,end);
    }
}
    public static void printArray(int array[])
    {
       for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" "); 
    }
    public static void main(String[] args) {
       //int array[]={16,4,10,14,7,9,3,2,8,1};
       int array[]={25,45,8,23,4,6,10,89,456,72,82};
        quickSort(array,0,array.length-1);
       printArray(array);
    }
    
}
