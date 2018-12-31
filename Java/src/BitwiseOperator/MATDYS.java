package BitwiseOperator;
//https://www.codechef.com/LTIME51/problems/MATDYS

/*import java.util.Scanner;
 
public class MATDYS {
 
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();
 
            for (int test = 0; test < T; test++) {
                int N = in.nextInt();
                long K = Long.parseUnsignedLong(in.next());
 
                System.out.println(Long.toUnsignedString(reverseBits(K, N)));
            }
        }
    }
 
    static long reverseBits(long num, int NO_OF_BITS){
        long reverse_num = 0, i;
 
        for (i = 0; i < NO_OF_BITS; i++){
            if (((num >> i) & 1) == 1)
            reverse_num |= (1L << ((NO_OF_BITS - 1) - i));
        }
 
        return reverse_num;
    }
} */

//1 3 4   => 1
//1 3 6   => 6
//1 3 2   => 2
//1 64 11047805202224836936  => 1337369305470044825
import java.util.Scanner;

public class MATDYS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q-- > 0) {
			int n = sc.nextInt();
			long k = Long.parseUnsignedLong(sc.next());
			for (int i = 0, j = n - 1; i < j; i++, j--) {
				// System.out.println("i: "+i+" i&1: "+(i&1)+" j: "+j+" j&1: "+
				// (j&1));
				// System.out.println("(k>>i&1): "+(k>>i&1)+" (k>>j&1):
				// "+(k>>j&1));
				if (((k >> i) & 1) != ((k >> j) & 1)) {
					// System.out.println("1L<<i: "+(1L<<i));
					k ^= 1L << i;
					// System.out.println("1L<<j: "+(1L<<j));
					k ^= 1L << j;
				}
			}
			System.out.println(Long.toUnsignedString(k));
		}
	}
}

/*
 * Let us try to find the binary representation of K and the final answer and
 * try to spot some observations based on it. (Assume below that all binary
 * representations are N bit long).
 * 
 * Let N=3 
 * N=3 Below is the table :
 * K   ANS 
 * 000 000 
 * 001 100 
 * 010 010 
 * 011 110 
 * 100 001 
 * 101 101 
 * 110 011 
 * 111 111 
 * Do you spot the relationship between the two of them? Yes, the answer is simply the
 * reverse of KK in binary representation.
 * 
 * Thus, we can simply find the binary representation of KK. Then try to
 * construct the answer from the reverse of the binary representation found.
 */
