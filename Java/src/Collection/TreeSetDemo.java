package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author KK Davara
 */

public class TreeSetDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedSet<String> set=new TreeSet<String>();
        List<String> list=new ArrayList<String>();
        list.add("abc");list.add("xyz");list.add("123");list.add("456");list.add("0456");
        String []str=list.toArray(new String[0]);
        for(String s:str)
          System.out.println(s);
        System.out.println("");
        addElements(set,list);
        showElement(set);
    }
    
    public static void addElements(Collection<String> col,List<String> list){
        col.add("kishor");
        col.add("john");
        col.add("mike");
        col.add("ghano");
        col.add("Chrish");
        col.addAll(list);
    }
    
    public static void showElement(Collection<String> col){
        //By default it displays the elements as per ascii value 
       for(String str:col){
           System.out.println(str);
       } 
    }
}
