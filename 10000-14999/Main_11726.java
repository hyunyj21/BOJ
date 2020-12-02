/*
 * 11726. 2×n 타일링
 * https://www.acmicpc.net/problem/11726
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11726 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		long[] dp = new long[n+1];
		
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007; 
		}
		
		System.out.println(dp[n]);
	}
}