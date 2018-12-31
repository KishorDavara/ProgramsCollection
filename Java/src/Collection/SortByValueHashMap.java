package Collection;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
// https://www.programcreek.com/2013/03/java-sort-map-by-value/
public class SortByValueHashMap implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 207540851724369711L;

public static void main(String []args){
	  HashMap<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(11, "C");
      hmap.put(4, "Z");
      hmap.put(77, "Y");
      hmap.put(5, "A");
      hmap.put(9, "P");
      hmap.put(66, "Q");
      hmap.put(0, "R");
      
      System.out.println("Before Sorting:");
      Set set = hmap.entrySet();
      System.out.println(hmap);
      System.out.println(set);
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
           Map.Entry me = (Map.Entry)iterator.next();
           System.out.print(me.getKey() + ": ");
           System.out.println(me.getValue());
      }
      
      System.out.println();
      //Map<Integer,String> map = sortedByValues(hmap);
      Map<Integer,String> map = sortbyValue(hmap);
      Iterator itr= map.entrySet().iterator();
      while(itr.hasNext()){
    	  Map.Entry me = (Map.Entry)itr.next();
          System.out.print(me.getKey() + ": ");
          System.out.println(me.getValue());
      }
  }
  
  public static Map sortedByValues(HashMap map){
	List list = new LinkedList(map.entrySet());
	
	Collections.sort(list,new Comparator(){
      public int compare(Object o1,Object o2){
    	  return ((Comparable)((Map.Entry)(o1)).getValue())
    			  .compareTo(((Map.Entry)(o2)).getValue()); 
      }
	});
	
	// Here I am copying the sorted list in HashMap
    // using LinkedHashMap to preserve the insertion order
	
	HashMap sortedMap = new LinkedHashMap();
	
	Iterator itr = list.iterator();
	
	while(itr.hasNext()){
	  Map.Entry entry = (Map.Entry) itr.next();
	  sortedMap.put(entry.getKey(),entry.getValue());
	}
	
	return sortedMap;
  }
  
  private static <K,V extends Comparable<? super V>> Map<K,V> sortbyValue(Map<K,V> map){
	  List<Map.Entry<K,V>> list= new LinkedList<Map.Entry<K,V>>(map.entrySet());
	  
	  Collections.sort(list,new Comparator<Map.Entry<K, V>>(){

		@Override
		public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
			return (o1.getValue()).compareTo(o2.getValue());
		}
		  
	  });
	  
	  Map<K,V> sortedMap = new LinkedHashMap<K,V>();
	  for(Map.Entry<K, V> entry: list){
		  sortedMap.put(entry.getKey(), entry.getValue());
	  }
	 return sortedMap; 
  }
}
