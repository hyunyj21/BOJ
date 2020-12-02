/*
 * 1463. 1로 만들기
 * https://www.acmicpc.net/problem/1463
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1463 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int[] dp = new int[N+1];
		
		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i-1] + 1;
			
			if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
			else if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
		}
		
		System.out.println(dp[N]);
	}
}