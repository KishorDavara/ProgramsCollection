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

public class T12 implements Ab{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new T12().sum(a,b);
    }

    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
    
}
