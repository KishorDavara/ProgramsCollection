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
public class Output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a[][]=new int[8][10];
      int c=0,i,j;
      for(i=0;i<10;i++) {
          for(j=0;j<8;j++) {
              a[j][i]=c++;
          }
      }
      System.out.println(a[3][6]);
    }
    
}
