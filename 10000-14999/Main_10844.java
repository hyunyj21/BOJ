/*
 * 10844. 쉬운 계단 수
 * https://www.acmicpc.net/problem/10844
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10844 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		long[][] dp = new long[N+1][10];
		
		for (int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) dp[i][j] = dp[i-1][j+1];
				else if (j == 9) dp[i][j] = dp[i-1][j-1];
				else dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
				
				dp[i][j] %= 1000000000;
			}
		}
		
		long ans = 0;
		for (int i = 0; i < 10; i++) {
			ans += dp[N][i];
			ans %= 1000000000;
		}
		
		System.out.println(ans);
	}
}