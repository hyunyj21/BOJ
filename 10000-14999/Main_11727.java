/*
 * 11727. 2×n 타일링 2
 * https://www.acmicpc.net/problem/11727
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11727 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int[] dp = new int[N+1];
		dp[1] = 1;
		if (N > 1) dp[2] = 3;
		
		for (int i = 3; i <= N; i++)
			dp[i] = (dp[i-1] + (2 * dp[i-2])) % 10007;
		
		System.out.println(dp[N]);
	}
}