package Collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtableExample {

	public static void main(String[] args) {
		   Enumeration names;
		 
		   // Creating a Hashtable
		   Hashtable<String, String> hashtable = new Hashtable<String, String>();
		 
		   // Adding Key and Value pairs to Hashtable
		   hashtable.put("Key1","Chaitanya");
		   hashtable.put("Key2","Ajeet");
		   hashtable.put("Key3","Peter");
		   hashtable.put("Key4","Ricky");
		   hashtable.put("Key5","Mona");
		   
		   //Display elements of hashtable
		   
		   //Method 1
		   
		   Set<String> keys = hashtable.keySet();
		
		   for(String key:keys){
			   System.out.println("Value of "+key+" is: "+hashtable.get(key));
		   }
		   
		   //Method 2
		   Iterator itr = hashtable.keySet().iterator();
		   
		   while(itr.hasNext()){
			 String key = (String)itr.next();   
			 System.out.println("Value of "+key+" is: "+hashtable.get(key));
		   }
		   
		   //Method 3
		   names = hashtable.keys();
		   while(names.hasMoreElements()){
			  String key = (String)names.nextElement();
			  System.out.println("Value of "+key+" is: "+hashtable.get(key));
		   }
	}

}
