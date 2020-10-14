/*
 * 1103. 게임
 * https://www.acmicpc.net/problem/1103
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1103 {
	static int N, M, ans;
	static int[][] board, dp;
	static boolean check;
	static boolean[][] visited;
	static int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		board = new int[N][M];
		for (int i = 0; i < N; i++) {
			String tmp = in.readLine();
			
			for (int j = 0; j < M; j++) {
				board[i][j] = tmp.charAt(j) - '0';
			}
		}
		
		dp = new int[N][M];
		visited = new boolean[N][M];

		dp[0][0] = 1;
		visited[0][0] = true;
		
		dfs(0, 0, 1);

		if (check) System.out.println(-1);
		else System.out.println(ans);
	}
	
	public static void dfs(int r, int c, int cnt) {
		if (check) return;
		
		for (int i = 0; i < 4; i++) {
			int nr = r + dir[i][0]*board[r][c];
			int nc = c + dir[i][1]*board[r][c];
			
			if (nr>-1 && nr<N && nc>-1 && nc<M && board[nr][nc] != 24) {
				if (visited[nr][nc]) {
					check = true;
					return;
				}
				
				if (dp[nr][nc] > cnt) continue;
				
				dp[nr][nc] = cnt+1;
				visited[nr][nc] = true;
				
				dfs(nr, nc, cnt+1);
				
				visited[nr][nc] = false;
			} else {
				ans = Math.max(ans, cnt);
			}
		}
	}
}