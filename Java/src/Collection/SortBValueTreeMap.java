package Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// https://www.programcreek.com/2013/03/java-sort-map-by-value/

public class SortBValueTreeMap {

	public static void main(String[] args) {
		  TreeMap<String, String> treemap = new TreeMap<String, String>();

		    // Put elements to the map
		    treemap.put("Key1", "Jack");
		    treemap.put("Key2", "Rick");
		    treemap.put("Key3", "Kate");
		    treemap.put("Key4", "Tom");
		    treemap.put("Key5", "Steve");
		 
		    // Calling the method sortByvalues
		    Map sortedMap = sortByValues(treemap);
		 
		    // Get a set of the entries on the sorted map
		    Set set = sortedMap.entrySet();
		 
		    // Get an iterator
		    Iterator i = set.iterator();
		 
		    // Display elements
		    while(i.hasNext()) {
		      Map.Entry me = (Map.Entry)i.next();
		      System.out.print(me.getKey() + ": ");
		      System.out.println(me.getValue());
		    }
	}

	private static <K,V extends Comparable<V>> Map<K,V> sortByValues(final Map<K,V> map) {
		
		Comparator<K> valueComparator =  new Comparator<K>() {
			public int compare(K k1, K k2) {
		        int compare = map.get(k1).compareTo(map.get(k2));
		        if (compare == 0) 
		             return 1;
		         else 
		             return compare;
		      }     
	      };
	       
	      Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
	      //Map<K, V> sortedByValues = new TreeMap<K, V>(new ValueComparator(map));
	      sortedByValues.putAll(map);
	   return sortedByValues;  
	}

}

class ValueComparator<K> implements Comparator<K> {
	Map map;
 
	public ValueComparator(Map map) {
		this.map = map;
	}
    //descending order
	public int compare(Object keyA, Object keyB) {
		Comparable valueA = (Comparable) map.get(keyA);
		Comparable valueB = (Comparable) map.get(keyB);
		return valueB.compareTo(valueA);
	}
}
