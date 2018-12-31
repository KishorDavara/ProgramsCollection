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
public class MinMaxWithoutBranching {

public static int min(int x, int y)
{
  //return y ^ ((x ^ y) & -(x < y));
    return 0;
}

/*Function to find maximum of x and y*/
public static int max(int x, int y)
{
  //return x ^ ((x ^ y) & -(x < y));
    return 0;
}

    public static void main(String[] args) {
        int x = 15;
        int y = 6;
        System.out.println("Min of "+x+" and " + y +" is" + min(x, y) );
        System.out.println("Max of "+x+" and " + y +" is" + max(x, y) );
    }
    
}
