/*
 this questions also on array given an array of size m * n .
and every row of array is sorted and contains unique element but different rows can contain same element present in other row . 
u have to sort the array and remove the duplicates and store in 1 1D array .
 */
package Collection;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.AbstractCollection;
/**
 *
 * @author KK Davara
 */
public class SortedArray {

    /**
     * @param args the command line arguments
     */
    public static Integer[] sortMatrix(int m[][]){
     Integer a[];
     TreeSet<Integer> set=new TreeSet<Integer>();
     for(int i=0;i<m.length;i++) {
         for(int j=0;j<m[i].length;j++){
             set.add(m[i][j]);
         }
     }
     a=set.toArray(new Integer[set.size()]);
     
     System.out.println("Size of the treeset is "+set.size());
     /*Iterator itr=set.iterator();
     
     while(itr.hasNext()) {
         System.out.print(itr.next()+" ");
     }*/
     return a;
    }
    public static void main(String[] args) {
        int matrix[][]={
                        {2,5,8,9},
                        {1,3,4,5},
                        {2,4,6,7}
                       };
        Integer sorted[]=sortMatrix(matrix);
        for(int i=0;i<sorted.length;i++) {
            System.out.println(sorted[i]);
        }
    }
    
}
