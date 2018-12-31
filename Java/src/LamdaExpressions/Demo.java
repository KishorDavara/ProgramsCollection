package LamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
	 List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	 //Without using Lambda Expressions
	    
	 for(int i = 0;i<numbers.size();i++){
		 System.out.println(numbers.get(i));
	 }
	 System.out.println(); 
	 for(int n : numbers){
		 System.out.println(n);
	 }
	 System.out.println(); 
	 //Using Lambda Expressions
	 
	 numbers.forEach(
        (Integer value) -> System.out.println(value));
	 
	 numbers.forEach(
		        (value) -> System.out.println(value));
	 
	 numbers.forEach(value -> System.out.println(value));
	 
	 numbers.forEach(System.out::println); //method reference
	}

}
