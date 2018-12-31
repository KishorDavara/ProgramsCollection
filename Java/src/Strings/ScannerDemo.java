/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author KK Davara
 */
public class ScannerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter line");
      String str[]=sc.nextLine().split(" ");
      for(int i=0;i<str.length;i++) {
          System.out.println(str[i]);
      }
    }
    
}
