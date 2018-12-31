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
public class ReverseWord {

    public static String reverseWords(String s) {
       if(s.length()==0)
         return s;
       int i=0;
       int size=s.length();
       s=s.trim();
       //while(i<size && s.charAt(i)==' ')
         //i++;
       //if(i==s.length())
         //return "";
       if(s.equals(""))
           return s;
       String ans="";
       String temp="";
       
       for(i=0;i<s.length();i++) {
           char ch=s.charAt(i);
           if(ch!=' ') {
              temp+=ch; 
           }
           else {
               while(i+1<s.length() && s.charAt(i+1)==' ')
                   i++;
               if(i==s.length()-1)
                 {
                  ans=temp+ans;
                  return ans;
                 }
               ans=temp+" "+ans;
               temp="";      
           }
       }
       ans=temp+" "+ans;
       return ans.trim();
    }
    public static void main(String[] args) {
        //String s="            ";
        //String s="a ";
        String s="the sky               is  blue";
        //Answer should be : "blue is sky the"
        String ans=reverseWords(s);
        System.out.println("The reverse String is "+ans+" and its length is "+ans.length());
    }
    
}
