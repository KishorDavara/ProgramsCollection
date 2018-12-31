/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miscellaneous;

/**
 *
 * @author KK Davara
 */
public class FindElement {

    /*
    1. Find an element in the array following the condition a[i] =i.
    int arr[] = {0,1,3,5}
    output = 0 0r 1
     */
    public static void main(String[] args) {
        int arr[] ={0,1,3,5,4,6,6,15,8,19,11};
        int flag=1;
        String ans="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==i)
            {
              if(flag==1)   
                ans+=i+"";    
              else
                ans+=" or "+i+"";  
               flag=0;  
            }
        }
        System.out.println(ans);
    }
    
}
