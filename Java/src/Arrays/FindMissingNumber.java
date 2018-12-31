/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author KK Davara
 */
public class FindMissingNumber {
public static int findMissingNumber(int a[],int n)
{
    //Method1
    /*
    int total=(n+1)*(n+2)/2;
    int sum=0;
    for(int i=0;i<n;i++)
        sum+=a[i];
    return total-sum;
   */
    //Method2
    //public int x1=a[0]; will give error because local variable can not contains any access modifier except final
    int x1=a[0];
    int x2=1;
    for(int i=1;i<n;i++)
        x1=x1^a[i];
    for(int i=2;i<=n+1;i++)
        x2=x2^i;
    return (x1^x2);
}
        public static void main(String[] args) {
        int a[]={1,2,3,5,6};
        System.out.println("Missing number in the given array is "+findMissingNumber(a,5));
    }
    
}
