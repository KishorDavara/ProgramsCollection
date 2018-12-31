package Keywords;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
* Java transient keyword is used in serialization. If we define any data member as transient, it will not be serialized.
* Let's take an example, I have declared a class as Student, it has three data members id, name and age.
* If you serialize the object, all the values will be serialized but I don't want to serialize one value, 
* e.g. age then we can declare the age data member as transient.
* */

class Student implements Serializable{  
	 int id;  
	 String name;  
	 transient int age;//Now it will not be serialized  
	 public Student(int id, String name,int age) {  
	  this.id = id;  
	  this.name = name;  
	  this.age=age;  
	 }  
	}  

public class TransientKeywordDemo {

	public static void main(String[] args) throws Exception {
	//code for serialize object
	 Student student=new Student(1,"Kishor", 24);
	  //writing object into file
	 FileOutputStream file=new FileOutputStream("file.txt");
	 ObjectOutputStream output=new ObjectOutputStream(file);
	 output.writeObject(student);
	 output.flush();
	 output.close();
	 file.close();
	 System.out.println("Student object is serialized successfully");
	
	 //code for deSerialize object	
     ObjectInputStream input = new ObjectInputStream(new FileInputStream("file.txt"));
     Student s=(Student)input.readObject();
     System.out.println(s.id+" "+s.name+" "+s.age);  
     input.close();
     System.out.println("Student object is deserialized successfully");
	}

}
