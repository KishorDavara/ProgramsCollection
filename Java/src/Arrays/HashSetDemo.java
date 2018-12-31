/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author KK Davara
 */
public class HashSetDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<Integer>();
    	//Set<Integer> set=new TreeSet<Integer>();
        set.add(100);
        set.add(4);
        set.add(200);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
    
}
