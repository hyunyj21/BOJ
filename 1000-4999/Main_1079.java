/*
 * 1079. 마피아
 * https://www.acmicpc.net/problem/1079
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1079 {
	static int N, remainder, mafia, ans;
	static int[] crime;
	static int[][] R;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		crime = new int[N];
		for (int i = 0; i < N; i++) {
			crime[i] = Integer.parseInt(st.nextToken());
		}
		
		R = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(in.readLine());
			
			for (int j = 0; j < N; j++) {
				R[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		mafia = Integer.parseInt(in.readLine());
		
		remainder = N;
		dfs(0);
		
		System.out.println(ans);
	}
	
	public static void dfs(int cnt) {
		if (remainder % 2 != 0) {
			boolean check = true;
			check = day();
			
			if (!check) {
				ans = Math.max(ans, cnt);
				return;
			}
		}
		
		if (remainder == 1) {
			ans = Math.max(ans, cnt);
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (i != mafia && crime[i] != Integer.MIN_VALUE) {
				int num = remainder;
				int[] tmp = crime.clone();
				
				crime[i] = Integer.MIN_VALUE;
				remainder--;
				
				change(i);
				dfs(cnt+1);
				
				crime = tmp.clone();
				remainder = num;
			}
		}
	}
	
	public static boolean day() {
		int max = Integer.MIN_VALUE, idx = 0;
		for (int i = 0; i < N; i++) {
			if (crime[i] == Integer.MIN_VALUE) continue;
			
			if (crime[i] > max) {
				max = crime[i];
				idx = i;
			}
		}
		
		remainder--;
		
		if (idx == mafia) return false;
		
		crime[idx] = Integer.MIN_VALUE;
		return true;
	}
	
	public static void change(int idx) {
		for (int i = 0; i < N; i++) {
			if (crime[i] == Integer.MIN_VALUE) continue;
			
			crime[i] += R[idx][i];
		}
	}
}