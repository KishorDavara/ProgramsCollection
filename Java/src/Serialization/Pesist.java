/*
 we are going to serialize the object of Student class. 
The writeObject() method of ObjectOutputStream class provides the functionality to serialize the object. 
We are saving the state of the object in the file named f.txt.
 */
package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author KK Davara
 */
public class Pesist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
         Student s1 =new Student(211,"ravi",22);//creating object  
  
       FileOutputStream fout=new FileOutputStream("E:\\Java\\f.txt");  
       ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  

    }
    
}
