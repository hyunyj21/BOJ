/*
 * 2468. 안전 영역
 * https://www.acmicpc.net/problem/2468
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_2468 {
	static int N;
	static int[][] map;
	static boolean[][] result;
	static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		map = new int[N][N];
		
		int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			StringTokenizer st  = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < N; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				map[i][j] = tmp;
				min = Math.min(min, tmp);
				max = Math.max(max, tmp);
			}
		}
		
		int ans = 1;
		if (min == max) {
			System.out.println(ans);
			return;
		}
		
		int cnt = 0;
		for (int i = min; i <= max; i++) {
			result = new boolean[N][N];
			rain(i);
			
			cnt = 0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (result[j][k]) {
						bfs(j, k);
						cnt++;
					}
				}
			}
			
			ans = Math.max(ans, cnt);
		}
		
		System.out.println(ans);
	}
	
	public static void rain(int num) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] > num) result[i][j] = true;
			}
		}
	}
	
	public static void bfs(int row, int col) {
		LinkedList<int[]> q = new LinkedList<>();
		q.offer(new int[] {row,col});
		result[row][col] = false;
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int r = cur[0];
			int c = cur[1];
			
			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];
				
				if (nr>-1 && nr<N && nc>-1 && nc<N && result[nr][nc]) {
					q.offer(new int[] {nr, nc});
					result[nr][nc] = false;
				}
			}
		}
	}
}