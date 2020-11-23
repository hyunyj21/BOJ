/*
 * 1912. 연속합
 * https://www.acmicpc.net/problem/1912
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1912 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int[] dp = new int[n];
		dp[0] = Integer.parseInt(st.nextToken());
		
		int ans = dp[0];
		for (int i = 1; i < n; i++) {
			dp[i] = Integer.parseInt(st.nextToken());
			
			if (dp[i-1] > 0 && dp[i]+dp[i-1] > 0) dp[i] += dp[i-1];
			if (dp[i] > ans) ans = dp[i];
		}
		
		System.out.println(ans);
	}
}