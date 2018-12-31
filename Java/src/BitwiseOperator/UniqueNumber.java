/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitwiseOperator;

/**
 *
 * @author KK Davara
 */
public class UniqueNumber {

    /*
      Find out elements which is not duplicate in the given array.
      int arr[] = {1,3,5,7,1,3,5}
      Output = 7
     */
    public static void main(String[] args) {
       int arr[]= {1,3,5,7,1,3,5};
       int uniqueNumber=0;
       for(int i=0;i<arr.length;i++)
       {
           uniqueNumber^=arr[i];
       }
       System.out.println("Unique number from the given array is "+ uniqueNumber);
    }
    
}
