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
public class StringImmutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s=new String("abcde");
        String x="hello";
        System.out.println(x.toString());
        //s="abcde";
        s.concat("xyz");
        System.out.println(s+" "+s.substring(0,2));
        StringBuilder sb=new StringBuilder("xyz");
        //sb="xyz"; // give error of incompatible type string can not be converted to stringbuilder 
        sb.append("hello");
        System.out.println(sb);
        
    }
    
}
