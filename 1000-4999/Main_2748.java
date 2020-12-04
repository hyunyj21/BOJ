/*
 * 2748. 피보나치 수 2
 * https://www.acmicpc.net/problem/2748
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2748 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		long[] fn = new long[n+1];
		
		fn[0] = 0;
		fn[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			fn[i] = fn[i-1] + fn[i-2];
		}
		
		System.out.println(fn[n]);
	}
}