package ExceptionHandling;

import java.util.Scanner;
/*
 * Can we write only try block without catch and finally blocks?
Yes, From java 7 onwards, if a class implements AutoCloseable interface, 
then it could be used as an argument in the try section and then it is not compulsory to have catch or finally block.
Please refer to the below example. Here Scanner class implements AutoCloseable interface.
 * */
public class TryWithoutCatchFinally {

	public static void main(String[] args) throws Exception {
		//After the completion of try block, the scanner object would be auto closed.
		try(Scanner sc = new Scanner(System.in)){
		System.out.println(sc.hashCode());
		throw new Exception();
		}
//		catch(Exception e){ //ArrayIndexOutOfBoundsException 
//			System.out.println(e);
//		}
		//System.out.println("Outside of try block");
	}

}
