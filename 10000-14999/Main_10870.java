/*
 * 10870. 피보나치 수 5
 * https://www.acmicpc.net/problem/10870
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10870 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine()) + 1;
		int[] fn = new int[n];
		
		if (n > 1) fn[1] = 1;
		if (n > 2) fn[2] = 1;
		
		for (int i = 3; i < n; i++) {
			fn[i] = fn[i-1] + fn[i-2];
		}
		
		System.out.println(fn[n-1]);
	}
}