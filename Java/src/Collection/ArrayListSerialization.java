package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialization {

	public static void main(String[] args) {
		 ArrayList<String> al=new ArrayList<String>();
	       al.add("Hello");
	       al.add("Hi");
	       al.add("Howdy");
	       
           //serialization
	       try{
	         FileOutputStream fos= new FileOutputStream("myfile.txt");
	         ObjectOutputStream oos= new ObjectOutputStream(fos);
	         oos.writeObject(al);
	         oos.close();
	         fos.close();
	       }catch(IOException ioe){
	            ioe.printStackTrace();
	        }

	       //De-serialization
	       
	       try
	        {
	            FileInputStream fis = new FileInputStream("myfile.txt");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            al = (ArrayList) ois.readObject();
	            ois.close();
	            fis.close();
	         }catch(IOException ioe){
	             ioe.printStackTrace();
	             return;
	          }catch(ClassNotFoundException c){
	             System.out.println("Class not found");
	             c.printStackTrace();
	             return;
	          }
	        for(String tmp: al){
	            System.out.println(tmp);
	        }
	}

}
