/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

/**
 *
 * @author KK Davara
 */
public class CompareTwoInteger {
//Without using any comparision operator
    /**
     * @param args the command line arguments
     */
    public static boolean isEqual(int a,int b) {
        Integer num1=new Integer(a);
        Integer num2=new Integer(b);
        int ans=num1.compareTo(num2);
        if(ans==0)
             return true;
        return false;
    }
    public static void main(String[] args) {
        if(isEqual(10,10)) {
            System.out.println("Both the integers are equals..");
        }
        else {
            System.out.println("Both the integers are not equals..");
         }
        
    }
    
}
