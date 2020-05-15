/*
 * 2636. 치즈
 * https://www.acmicpc.net/problem/2636
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_2636 {
	static int N, M, cnt;
	static boolean[][] pan, visited;
	static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		pan = new boolean[N][M];
		
		cnt = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			for (int j = 0; j < M; j++) {
				if (st.nextToken().equals("1")) {
					pan[i][j] = true;
					cnt++;
				}
			}
		}
		
		int ans = 0, time = 0;
		while(cnt != 0) {
			ans = cnt;
			time++;

			visited = new boolean[N][M];
			bfs();
		}
		
		System.out.println(time);
		System.out.println(ans);
	} //end main()
	
	public static void bfs() {
		LinkedList<int[]> q = new LinkedList<>();
		q.offer(new int[] {0,0});
		visited[0][0] = true;
		
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int r = cur[0];
			int c = cur[1];
			
			for (int i = 0; i < 4; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];
				
				if (nr>-1 && nr<N && nc>-1 && nc<M && !visited[nr][nc]) {
					if (!pan[nr][nc]) q.offer(new int[] {nr, nc});
					else {
						pan[nr][nc] = false;
						cnt--;
					}
					
					visited[nr][nc] = true;
				}
			}
		}
	} //end bfs()
}