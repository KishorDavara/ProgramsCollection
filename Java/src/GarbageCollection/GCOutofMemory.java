/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GarbageCollection;

/**
 *
 * @author KK Davara
 */
import java.util.LinkedList;
import java.util.List;

public class GCOutofMemory {
	public static void main(String[] main) {
		List l = new LinkedList();
		// Enter infinite loop which will add a String to the list: l on each
		// iteration.
		do {
			l.add(new String("Hello, World"));
		} while (true);
                
	}
}