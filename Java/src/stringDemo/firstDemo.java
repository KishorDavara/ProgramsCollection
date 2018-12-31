package stringDemo;

public class firstDemo {
 public static void main(String []args){
	String s1 = "HelloWorld";
	String s2 = "HelloWorld";
	String s3 = "Hello";
	String s4 = "World";
	String s5 = s3+s4;
	String s6 = new String("HelloWorld");
	//using ==
	System.out.println("s1==s2 "+ s1==s2);
	System.out.println("s1==s5 "+ (s1==s5));
	System.out.println("s1==s6 "+ (s1==s6));
	
	//using equals() method
		System.out.println("s1.equals(s2)"+ s1.equals(s2));
		System.out.println("s1.equals(s2)"+ s1.equals(s5));
		System.out.println("s1.equals(s2)"+ s1.equals(s6));
		
 }
}
