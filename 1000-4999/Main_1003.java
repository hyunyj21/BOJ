/*
 * 1003. 피보나치 함수
 * https://www.acmicpc.net/problem/1003
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1003 {
	public static void main(String[] args) throws Exception {
		int[][] dp = new int[41][2];
		dp[0][0] = 1;
		dp[1][1] = 1;
		
		for (int i = 2; i < 41; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-2][0];
			dp[i][1] = dp[i-1][1] + dp[i-2][1];
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 0; t < tc; t++) {
			int N = Integer.parseInt(in.readLine());
			
			System.out.println(dp[N][0] + " "+ dp[N][1]);
		}
	}
}