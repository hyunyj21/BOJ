/*
 * 1932. 정수 삼각형
 * https://www.acmicpc.net/problem/1932
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1932 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int[][] dp = new int[n][n+2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			
			if (i == 0) {
				dp[i][1] = Integer.parseInt(st.nextToken());
				continue;
			}
			
			for (int j = 0, len = i+1; j < len; j++) {
				dp[i][j+1] = Math.max(dp[i-1][j], dp[i-1][j+1]) + Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(dp[n-1]);
		
		System.out.println(dp[n-1][n+1]);
	}
}