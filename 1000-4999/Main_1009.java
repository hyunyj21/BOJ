/*
 * 1009. 분산처리
 * https://www.acmicpc.net/problem/1009
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1009 {
	static int[][] ans = {{10}, {1}, {2,4,8,6}, {3,9,7,1}, {4,6}, {5}, {6}, {7,9,3,1}, {8,4,2,6}, {9,1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc =  Integer.parseInt(in.readLine());
		
		for (int t = 0; t < tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int a = Integer.parseInt(st.nextToken()) % 10;
			int b = Integer.parseInt(st.nextToken())-1;
			
			sb.append(ans[a][b%(ans[a].length)]).append("\n");
		}
		
		System.out.print(sb);
	}
}