package LamdaExpressions;

public class SimpleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		String s = "LambdaExpressions";
//		n -> n % 2 != 0;
//		(char c) -> c == 'y';
//		(x, y) -> x + y;
//		(int a, int b) -> a * a + b * b;
//		() -> 42;
//		() -> { return 3.14 };
//		(String s) -> System.out.println(s);
		MyLambda m = () -> System.out.println("Hello World!");
		m.greet();
		//addFunction = (int a,int b) -> a + b;
	}
	
  interface MyLambda{
	  void greet();
	  //void displayMessage(int a);
  }
}
