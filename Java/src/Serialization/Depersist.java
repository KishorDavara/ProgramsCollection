/*
  we are going to Deserialize the object of Student class. 
The readObject() method of ObjectIntputStream class provides the functionality to Deserialize the object. 
We are reading serialized state from the file named f.txt and reconstructing the original state of the object.
age will give value as 0(default value of the instance variable)when displayed because it is declared as transient.
Any variable or data member declared as a transient can not be serialized.  
*/
package Serialization;

/**
 *
 * @author KK Davara
 */
import java.io.*;  
class Depersist{  
 public static void main(String args[])throws Exception{  
    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("E:\\Java\\f.txt"));  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name+" "+s.age);   
  in.close();  
 }  
}  