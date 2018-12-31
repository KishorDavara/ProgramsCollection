/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apac2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author KK Davara
 */
public class GoogolString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token=new StringTokenizer("");
        StringBuilder str=new StringBuilder("001001100011011");
        for(int i=5;i<100000;i++){
         String s=str.toString();
         int rep=((s.length()+1)+((s.length()+1)/2))-1;
         str.append("0");
         //System.out.println(str.toString());
         str.append(s);
         //System.out.println(str.toString());
         if(str.charAt(rep)=='0')
         {
             str.insert(rep,'1');
             str.deleteCharAt(rep+1);
         }
         else
         {
             str.insert(rep,'0');
             str.deleteCharAt(rep+1);
         }
         //System.out.println(str.toString());
        }
    }
    
}
