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
 class DemoMain {

    /**
     * @param args the command line arguments
     */
    static {
        System.out.println("Hello welcome in static block");
    }
    
    final public static void main(final String []args) {
        System.out.println("Hello welcome in main");
    }
    /*private static void main(String[] args) {
        System.out.println("Hello");
    }*/
    
}
