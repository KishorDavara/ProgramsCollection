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
interface Aa
{
	public void add(int a,int b);
	public static void display()    //static  method in interface is supported in java 8 
	{
		System.out.println("Hello World");
	}
}	
public class StaticInterfaceMethod implements Aa{

    /**
     * @param args the command line arguments
     */
    public void add(int a,int b) {
		System.out.println(a+b);
	}
    public static void main(String[] args) {
        // TODO code application logic here
       	Aa a=new StaticInterfaceMethod();
        a.add(10,5);
        Aa.display();
    }
    
}
