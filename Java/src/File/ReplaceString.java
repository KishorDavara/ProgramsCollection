/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KK Davara
 */
public class ReplaceString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
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
         System.out.println("Enter the word to replace with");
         replace=sc.next();
         for(int i=0;i<str.size();i++) {
           str.set(i,str.get(i).replaceAll(original,replace));
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
