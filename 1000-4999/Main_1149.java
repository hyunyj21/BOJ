/*
 * 1149. RGB거리
 * https://www.acmicpc.net/problem/1149
 */

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Main_1149 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int[][] dp = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			if (i == 0) {
				for (int j = 0; j < 3; j++) {
					dp[0][j] = Integer.parseInt(st.nextToken());
				}
				
				continue;
			}
			
			for (int j = 0; j < 3; j++) {
				int price = Integer.parseInt(st.nextToken());
				
				switch (j) {
				case 0:
					dp[i][j] = Math.min(dp[i-1][1] + price, dp[i-1][2] + price);
					break;
				case 1:
					dp[i][j] = Math.min(dp[i-1][0] + price, dp[i-1][2] + price);
					break;
				case 2:
					dp[i][j] = Math.min(dp[i-1][0] + price, dp[i-1][1] + price);
					break;
				}
			}
		}
		
		int ans = Math.min(dp[N-1][0], dp[N-1][1]);
		if (ans > dp[N-1][2]) ans = dp[N-1][2];
		
		System.out.println(ans);
	}
}