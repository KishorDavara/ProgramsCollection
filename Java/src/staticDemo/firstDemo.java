package staticDemo;

class A{
 int i = 10;
 static int j = 10;
}

public class firstDemo {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a1.i++;
		
		a2.i++;
		a2.i++;
		
		a1.j++;
		
		a2.j++;
		
		A.j++;
		
		System.out.println("a1.i= "+a1.i);
		System.out.println("a2.i= "+a2.i);
		System.out.println("a1.j= "+a1.j);
		System.out.println("a2.i= "+a2.j);
		System.out.println("A.j= "+A.j);
	}

}
