/*
 * 2193. 이친수
 * https://www.acmicpc.net/problem/2193
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2193 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		long[] dp = new long[N];
		
		dp[0] = 1;
		if (N > 1) dp[1] = 1;
		
		for (int i = 2; i < N; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[N-1]);
	}
}