/*
 replace pattern like abc[0-9] to def 
where pattern contains any digit from 0-9 with abc
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author KK Davara
 */
public class ReplacePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File f=new File("E:/Java/File.txt");
        Scanner sc=new Scanner(System.in);
        String original=null;
        String replace=null;
        try{
         Scanner fileScanner=new Scanner(f);
         ArrayList<String> str=new ArrayList<String>();
         while(fileScanner.hasNext())  {
             str.add(fileScanner.nextLine());
         }
         System.out.println("Enter the word to replace");
         original=sc.next();
         int len=original.length();
         original=original.substring(0,len-5);
         System.out.println("Enter the word to replace with");
         replace=sc.next();
         String pattern=original+"[0-9]";
         Pattern p=Pattern.compile(pattern);
         for(int i=0;i<str.size();i++) {
           String s=str.get(i);
           Matcher m=p.matcher(s);
           s=m.replaceAll(replace);
           str.set(i,s);
           //str.set(i,str.get(i).replaceAll(original,replace));
         }
         for(int i=0;i<str.size();i++) {
             System.out.println(str.get(i));
         }
        }
        catch(FileNotFoundException ex) {
            System.out.println("File Doesn't E xists");
        }
    }
    
}
