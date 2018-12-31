package Java8;

interface Interface1{

void method1();

default void log(String str) {
	System.out.println("Interface1 "+ str);
}
}

interface Interface2{

void method1();

default void log(String str) {
	System.out.println("Interface2 "+ str);
}
}

public class InterfaceDefaultMethodDemo implements Interface1,Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDefaultMethodDemo I = new InterfaceDefaultMethodDemo();
		I.log("log 123");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface2.super.log(str);
	}

	

}
