/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KK Davara
 */
interface A
{
  void display();
}
class B implements A
{
    public void display() {
        System.out.println("Am in class B");
    }
 
}
class C extends B
{
    @Override
    public void display() {
        System.out.println("Am in class C");
    }
}    
public class UpcastingDownCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Upcasting from subclass to super class.
        A aRef=new C();
 
        aRef.display();//Am in class C

         //Downcasting of reference to subclass reference.
        B bRef=(B) aRef;
        bRef.display();//Am in class C

        }
    
}
