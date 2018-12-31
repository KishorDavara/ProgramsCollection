/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

import java.util.Scanner;

/**
 *
 * @author KK Davara
 */
public class FibonacciNumber {
    /**
     * @param args the command line arguments
     */
    public static long fib(int n)
    {
        long fib[]=new long[n+1];
        int i=0;
        fib[0]=0;fib[1]=1;
        for(i=2;i<=n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n;
       System.out.println("Which numbered fibonacci number you want..?");
       n=sc.nextInt();
       System.out.println(n+" th fibonacci number is "+fib(n));
    }
    
}
