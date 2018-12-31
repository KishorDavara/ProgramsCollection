package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author KK Davara
 */
public class SpiralArray {

    	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 int l=0;
		 int r=A.get(0).size()-1;
		 int t=0;
		 int b=A.size()-1;
		 int dir=0;
		 while(l<=r && t<=b)
		 {
		     if(dir==0)
		     {
		       for(int k=l;k<=r;k++)
		          result.add(A.get(t).get(k));
		       t++;    
		     }
		     else if(dir==1)
		     {
		       for(int k=t;k<=b;k++)
		          result.add(A.get(k).get(r));
		       r--; 
		     }
		     else if(dir==2)
		     {
		       for(int k=r;k>=l;k--)
		          result.add(A.get(b).get(k));
		         b--;
		       }
		   else if(dir==3)
		     {
		       for(int k=b;k>=t;k--)
		          result.add(A.get(k).get(l));
		         l++;
		       }
		       dir=(dir+1)%4;

		 }    
		 return result;
	}
    public static void main(String[] args) {
        List<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        ArrayList<Integer> c=new ArrayList<>();
        c.add(7);
        c.add(8);
        c.add(9);
        matrix.add(a);
        matrix.add(b);
        matrix.add(c);
        ArrayList<Integer> ans=spiralOrder(matrix);
        System.out.println("Array in the spiral manner:");
        Iterator itr = ans.iterator();
        while(itr.hasNext()) 
        {
         Object element = itr.next();
         System.out.print(element + " ");
        }
    }

}