/*
   This program is intended to check whether given Object is a type of interface or not
  and for the class implements any interface or not
 */
package Miscellaneous;

/**
 *
 * @author KK Davara
 */
interface A{
}
class B implements A {
	
}
class C
{
	
}

public class ObjectReflection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	  Class a=A.class;
	  Class b=B.class;
	  Class c=C.class;
	  Class []interfaces=b.getInterfaces();
	  Class []interfaces1=c.getInterfaces();
	  if(a.isInterface()) {
	  	System.out.println("Given type "+a.getSimpleName()+" is an interface");
	  }
	  else
	  {
	  	System.out.println("Given type "+a.getSimpleName()+" is not an interface");
	  }
	  
	  if(b.isInterface()) {
	  	System.out.println("Given type "+b.getSimpleName()+" is an interface");
	  }
	  else
	  {
	  	System.out.println("Given type "+b.getSimpleName()+" is not an interface");
	  }
	  
	  if(interfaces.length==0) {
	  	System.out.println("Class B doesn't implement the interface");
	  }
	  else {
	  	System.out.println("Class B implements the interface");
	  }
	  
	  if(interfaces1.length==0) {
	  	System.out.println("Class C doesn't implement the interface");
	  }
	  else {
	  	System.out.println("Class C implements the interface");
	  } 
	} 
}
    
    

