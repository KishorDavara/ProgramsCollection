/*
 Problem Statement

In Jim's Burger, n hungry burger fans are ordering burgers. The ith order is placed by the ith fan at ti time and it takes di time to procees. What is the order in which the fans will get their burgers?

Input Format 
On the first line you will get n, the number of orders. Then n lines will follow. On the (i+1)th line, you will get ti and di separated by a single space.

Output Format 
Print the order ( as single space separated integers ) in which the burger fans get their burgers. If two fans get the burger at the same time, then print the smallest numbered order first.(remember, the fans are numbered 1 to n).

Constraints 
1≤n≤103 
1≤ti,di≤106

Sample Input #00

3
1 3
2 3
3 3
Sample Output #00

1 2 3
Explanation #00

The first order is placed at time 1 and it takes 3 units of time to process, so the burger is sent to the customer at time 4. The 2nd and 3rd are similarly processed at time 5 and time 6. Hence the order 1 2 3.

Sample Input #01

5
8 1
4 2
5 6
3 1
4 3
Sample Output #01

4 2 5 1 3
 */
//Better Approach
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class Solution {	
    BufferedReader reader;
    StringTokenizer tokenizer;
    PrintWriter out;
    
	public void solve() throws IOException {				
		int N = nextInt();
		final int[] T = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = nextInt() + nextInt();
        }
        Integer[] order = new Integer[N];
        for (int i = 0; i < N; i++) {
            order[i] = i;
        }
        Arrays.sort(order, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (T[a]==T[b]) return a-b;
                return T[a] < T[b]? -1: 1;
            }
        });
        for (int i = 0; i < N; i++) {
            out.print( (order[i]+1) + " ");
        }
        out.println();
	}
	
	public static void main(String[] args) {
		new Solution().run();
	}
	
	public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = null;
            out = new PrintWriter(System.out);
            solve();
            reader.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

}
*/




package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author KK Davara
 */
public class JimAndOrders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out=new PrintWriter(System.out);
    StringBuilder sbr=new StringBuilder();
    int N=Integer.parseInt(br.readLine());
    int []time=new int[N];
    int []process=new int[N];
    int []total=new int[N];    
    final Map<Integer,Integer> map=new HashMap<Integer,Integer>();   
     for(int i=0;i<N;i++) {
      String str[]=br.readLine().split(" ");
      time[i]=Integer.parseInt(str[0]);
      process[i]=Integer.parseInt(str[1]);
      total[i]=time[i]+process[i];
      map.put(i,total[i]);     
    }  
    final List<Map.Entry> list=new LinkedList<Map.Entry>(map.entrySet());
    Collections.sort(list,new Comparator()
                    {
                        @Override
                        public int compare(final Object o1,final Object o2) {
                            return 0-((Comparable)((Map.Entry)o2).getValue()).compareTo(((Map.Entry)o1).getValue());
                        }
                    });    
    int index=0;    
    for(int i=0;i<N;i++){
       index=(Integer)list.get(i).getKey();
        sbr.append(index+1).append(" ");
    }    
    out.println(sbr);
    br.close();
    out.flush();    
    out.close();
    }  
}
