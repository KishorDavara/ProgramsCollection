/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PascalTriangleRow
{
	public static List<Integer> getRow(int rowIndex) {
	ArrayList<Integer> result = new ArrayList<Integer>();
 
	if (rowIndex < 0)
		return result;
 
	result.add(1);
	for (int i = 1; i <= rowIndex; i++) {
            System.out.println(result.size());
		for (int j = result.size() - 2; j >= 0; j--) {
			result.set(j + 1, result.get(j) + result.get(j + 1));
		}
		result.add(1);
	}
	return result;
}
	public static void main (String[] args) throws java.lang.Exception
	{
		/*ArrayList<Integer> A=new ArrayList<Integer>(6);
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(2,5);
		Iterator<Integer> itr=A.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		List<Integer> A=getRow(3);
		Iterator<Integer> itr=A.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
}