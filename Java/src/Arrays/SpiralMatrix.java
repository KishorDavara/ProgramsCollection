/*
 Given an integer n, generate a square matrix filled with elements from 1 to n^2 in spiral order.

Example:

Given n = 3,

You should return the following matrix:
 [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ] 
 */
package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KK Davara
 */
public class SpiralMatrix {
	//https://www.programcreek.com/2014/05/leetcode-spiral-matrix-ii-java/
   public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int val=1;
        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<A;i++)
        {
            ArrayList<Integer> C=new ArrayList<Integer>();
            for(int j=0;j<A;j++)
            {
             C.add(0);
            }
            B.add(C);
        }
     for (int level = 0; level < A; ++level, --A) 
     {  
     // top  
     for(int i=level; i < A; ++i) 
        B.get(level).set(i,val++);  
     // right  
     for(int i=level+1; i < A; ++i) 
      B.get(i).set(A-1, val++);  
     // bottom  
     for(int i=A-2; i >= level; --i)
       B.get(A-1).set(i,val++);  
     // left  
     for(int i=A-2; i > level; --i)
        B.get(i).set(level,val++);  
     }  
        return B;
        
        /*
         int l=0,r=A-1,t=0,b=A-1;
        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<A;i++)
        {
            ArrayList<Integer> C=new ArrayList<Integer>();
            for(int j=0;j<A;j++)
            {
             C.add(0);
            }
            B.add(C);
        }
        int num=0,dir=0;
        for( ;num<=(A*A);)
        {
            if(dir==0)
            {
              for(int j=l;j<=r;j++)
              {
                B.get(t).set(j,num+1);
                num=B.get(t).get(j);
             }
             t++;
            }     
            else if(dir==1)
            {
              for(int j=t;j<=b;j++)
              {
                B.get(j).set(r,num+1);
                num=B.get(j).get(r);
             }
             r--;
            }
            else if(dir==2)
            {
              for(int j=r;j>=l;j--)
              {
                B.get(b).set(j,num+1);
                num=B.get(b).get(j);
             }
             b--;
            }
            else if(dir==3)
            {
              for(int j=b;j>=t;j--)
              {
                B.get(j).set(l,num+1);
                num=B.get(j).get(l);
             }
             l++;
            }
            dir=(dir+1)%4;
        }
        return B;
        */
}		
		
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter n for n*n spiral matrix:\n");
        n=sc.nextInt();
        ArrayList<ArrayList<Integer>> A=generateMatrix(n);
        //Iterator<ArrayList<Integer>> itr=A.iterator();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A.get(i).get(j)+" ");
            }
            System.out.println("");
        }
                
    }
    
}
