/*
 * 1010. 다리 놓기
 * https://www.acmicpc.net/problem/1010
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1010 {
	static int N, M, ans;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 0; t < tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			ans = 0;
			combi(0,0);
			
			System.out.println(ans);
		}
	}
	
	public static void combi(int cnt, int start) {
		if (cnt == N) {
			ans++;
			return;
		}
		
		for (int i = start; i < M; i++) {
			combi(cnt+1, i+1);
		}
	}
}