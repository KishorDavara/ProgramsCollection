/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author KK Davara
 */
public class BucketSort {

    public static void insertionSort(float a[])
    {
        float val=0;
        int hole=0;
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
    
    public static float[] bucketSort(float a[])
    {
        int n=a.length;
        ArrayList<ArrayList<Float>> B=new ArrayList<ArrayList<Float>>();
        
        for (int i=0; i<n; i++)
        {
            int bi=(int)(n*a[i]); // Index in bucket
            B.get(bi).add(a[i]);
        }
        
        for(int i=0;i<n;i++)
        {
            Collections.sort(B.get(i));
        }
        int index=0;
         for (int i=0; i<n; i++)
         {
              for(int j=0;j<B.get(i).size();j++)
              {
                  a[index++]=B.get(i).get(j);
              }
             
         }
 
        
        return a;
        
    }
    
    public static void main(String[] args) {
         float arr[] ={0.897f,0.565f,0.656f,0.1234f,0.665f,0.3434f};
         float ans[]=bucketSort(arr);
         for(int i=0;i<ans.length;i++)
             System.out.print(ans[i]+" ");
         
    }
    
}
