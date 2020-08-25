/*
 * 2178. 미로 탐색
 * https://www.acmicpc.net/problem/2178
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_2178 {
	static int N, M;
	static boolean[][] map;
	static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String tmp = in.readLine();
			
			for (int j = 0; j < M; j++) {
				if (tmp.charAt(j) == '1') map[i][j] = true;
			}
		}
		
		int ans = bfs(0,0,1);
		System.out.println(ans);
	}
	
	public static int bfs(int row, int col, int cnt) {
		LinkedList<int[]> q = new LinkedList<>();
		q.offer(new int[] {row, col, cnt});
		map[row][col] = false;
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int r = cur[0];
			int c = cur[1];
			int num = cur[2];
			
			if (r==N-1 && c==M-1) return num;
			
			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];
				
				if (nr>-1 && nr<N && nc>-1 && nc<M && map[nr][nc]) {
					q.offer(new int[] {nr, nc, num+1});
					map[nr][nc] = false;
				}
			}
		}
		
		return -1;
	}
}