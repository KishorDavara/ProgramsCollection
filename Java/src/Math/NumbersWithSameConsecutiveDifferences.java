package Math;

import java.util.LinkedHashSet;
import java.util.Set;
/*
 * 
 * Return all non-negative integers of length N such that the absolute difference between every two 
 * consecutive digits is K.Note that every number in the answer must not have leading zeros except for the number 0 itself. 
 * For example, 01 has one leading zero and is invalid, but 0 is valid.
 * You may return the answer in any order.
 * Input: N = 3, K = 7
   Output: [181,292,707,818,929]
   Explanation: Note that 070 is not a valid number, because it has leading zeroes.
   https://leetcode.com/problems/numbers-with-same-consecutive-differences/
 * */
public class NumbersWithSameConsecutiveDifferences {
	public static int[] numsSameConsecDiff(int N, int K) {

		if (N == 1) {
			return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		}

		Set<Integer> set = new LinkedHashSet<>();

		for (int i = 1; i <= 9; i++) {
			set.add(i);
		}

		for (int step = 1; step <= N - 1; step++) {
			Set<Integer> tempSet = new LinkedHashSet<>();
			for (int num : set) {
				int d = num % 10;
				if ((d - K) >= 0) {
					tempSet.add(10 * num + (d - K));
				}
				if ((d + K) <= 9) {
					tempSet.add(10 * num + (d + K));
				}
			}
			set = tempSet;
		}

		return set.stream().mapToInt(Number::intValue).toArray();
	}

	public static void main(String[] args) {
     int ans[] = numsSameConsecDiff(3,7);
     for(int num:ans) {
    	System.out.println(num); 
     }
	}
}
