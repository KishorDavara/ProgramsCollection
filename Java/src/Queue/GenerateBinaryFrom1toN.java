/*
   
 */
package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author KK Davara
 */
public class GenerateBinaryFrom1toN {

    /**
     * @param args the command line arguments
     */
    public static void generateBinary(int n) {
        Queue<String> q=new LinkedList<String>();
        q.add("1");
        while(n-->0) {
            String s1=q.peek();
            q.remove();
            System.out.println(s1);
            String s2=s1;
            q.add(s1.concat("0"));
            q.add(s2.concat("1"));
          }
        //System.out.println(q.peek());
    }
    public static void main(String[] args) throws IOException {
        int n=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter N");
        n=Integer.parseInt(br.readLine());
        generateBinary(n);
    }
    
}
