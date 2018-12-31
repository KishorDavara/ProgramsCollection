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
public class AddTwoNumber {

    /**
     * @param args the command line arguments
     */
    public static int addNum(int x,int y) {
        // Iterate till there is no carry  
        while(y!=0) {
            // carry now contains common set bits of x and y
            int carry= x & y;
            System.out.println("carry "+carry);
            // Sum of bits of x and y where at least one of the bits is not set
            x = x ^ y;
            System.out.println("x "+x);
             // Carry is shifted by one so that adding it to x gives the required sum
            y = carry << 1;
            System.out.println("y "+y);
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println("Sum of the number 15 and 20 is "+addNum(15, 10));
    }
    
}
