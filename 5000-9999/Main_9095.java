/*
 * 9095. 1, 2, 3 더하기
 * https://www.acmicpc.net/problem/9095
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9095 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		int[] dp = new int[11];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int i = 4; i < 11; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		for (int t = 0; t < tc; t++) {
			int n = Integer.parseInt(in.readLine());
			
			System.out.println(dp[n]);
		}
	}
}