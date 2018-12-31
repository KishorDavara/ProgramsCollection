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
public class FindFirstTwoNone_RepeatingElement {

    /**
     * @param args the command line arguments
     */
    public static int[] findTwoNonRepeatingElement(int a[]) {
        int ans[]=new int[2];
        int x=0;
        int y=0;
        int xor=a[0];
        int setbits=0;
        for(int i=1;i<a.length;i++) {
            xor^=a[i];
        }
        setbits=xor & ~(xor-1); /* Get the rightmost set bit in set_bit_no */
        
         for(int i=0;i<a.length;i++) {
            if((a[i]&setbits)>=1) {
                x=x^a[i];
            }
            else {
                y=y^a[i];
            }
        } 
        ans[0]=x;
        ans[1]=y;
        return ans;
    } 
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 9, 11, 2, 3, 11};
        int ans[]=findTwoNonRepeatingElement(arr);
        System.out.println("Two non repeating elements are "+ans[0]+" and "+ans[1]);
    }
    
}
