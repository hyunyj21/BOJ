/*
 * 14501. 퇴사
 * https://www.acmicpc.net/problem/14501
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14501 {
	static int N, ans;
	static int[][] work;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		work = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			work[i][0] = Integer.parseInt(st.nextToken());
			work[i][1] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0);
		
		System.out.println(ans);
	}
	
	public static void dfs(int idx, int total) {
		if (idx >= N) {
			ans = Math.max(ans, total);
			return;
		}
		
		if (idx + work[idx][0] <= N) dfs(idx + work[idx][0], total + work[idx][1]);
		dfs(idx + 1, total);
	}
}