/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author KK Davara
 */
public class FirstNonRepeatingCharacter {

    /**
     * @param args the command line arguments
     */
    public static char firstNonRepeatingChar(String str) {
       char firstUnique=0;      
        int []count=new int[256];
        for(int i=0;i<str.length();i++) {
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++) {
            if(count[str.charAt(i)]==1) {
                firstUnique=str.charAt(i);
                break;
            }
        }
      return firstUnique;
    }
    public static void main(String[] args) {
       String str="geeksforgeeks";
        System.out.println("First non-repeating character in the given string is "+firstNonRepeatingChar(str));
    }
    
}
