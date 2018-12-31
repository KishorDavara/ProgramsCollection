package Miscellaneous;
class ATest {
	static int i = 100;
	static {
		i = i-- - --i;
		System.out.println("First "+ i);
	}
	{
		i = i++ + ++i;
		System.out.println("Second "+ i);
	}
}
class BTest extends ATest {
	static {
		i = --i - i--;
		System.out.println("Third "+ i);
	}
	{
		i = ++i + i++;
		System.out.println("Fourth "+ i);
	}
}
public class StaticBlockExample {

	public static void main(String[] args) {
        BTest b = new BTest();
        System.out.println(b.i);

	}

}
