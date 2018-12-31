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
interface I {  }
abstract class A2 {  }
class B2 extends A2 implements I {  }
class C2 extends B2 {  }
public class P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // I obj = new I();
      // I obj1 = new A(); 
/*I obj2 = new B(); 
I obj3 = new C(); 
//A obj4 = new A();
A obj5 = new B(); 
C c = new C();
A obj6 = (B) c; 
C d = new C();
I obj7 = (B)c;
*/
A2 c = new C2();
I obj = (B2) c;
I x = new C2();
A2 obj1 = (B2) x; 

}
    
}
