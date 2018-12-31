/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author KK Davara
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection c=new ArrayList();
        HashSet<Integer> set=new HashSet<Integer>();
	set.add(10);set.add(20);set.add(30);set.add(null);set.add(null);
	Iterator<Integer> itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
    }
    
}
