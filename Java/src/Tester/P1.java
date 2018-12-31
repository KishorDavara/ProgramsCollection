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
/*public class P1 {

    public static void main(String[] args) {
        int x[]={1,2,3};
        int y[]=x;
        //int y[]=x.clone();
     y[1]=5;
		for(int i=0;i<3;i++)
		   System.out.println("int: "+x[i]);
for(int i=0;i<3;i++)
		   System.out.println("int: "+y[i]);

    }
    
}
*/
class a {
public a( ) { System.out.print("A");}
}
class b extends a {
public b( ) { System.out.print("B");}
}
class c extends b {
public c( ) { System.out.print("C");}
}
class P1 {
public static void main(String[] args) {
a A = new c( );
} //Your Answer: _________________
}
