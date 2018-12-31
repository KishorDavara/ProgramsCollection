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
abstract class xyz{
    
}
final class abc{
    
}
class pqr {
    
}
//top level class can not be private or protected below class declaration gives compiletime error
/*protected ab{

}

private class  df{

}
*/
public class Modifier {
    transient int i;
    volatile int j;
    private int x;
    public int y;
    int z;
//Below gives error because final varibale must be initialized and we can not declare variable as abstract
//final int a;
//abstract int b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
