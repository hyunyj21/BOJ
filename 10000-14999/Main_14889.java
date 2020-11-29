/*
 * 14889. 스타트와 링크
 * https://www.acmicpc.net/problem/14889
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_14889 {
	static int N, half, idx, result;
	static int[] team, pair, ans;
	static int[][] stat;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		half = N / 2;
		stat = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			for (int j = 0; j < N; j++) {
				stat[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		long top = 1, bottom = 2;
		for (int i = 0; i < half; i++) {
			top *= N - i;
			bottom *= i + 1;
		}
		
		team = new int[half];
		pair = new int[2];
		ans = new int[(int) (top/bottom)];
		idx = 0;
		
		combi(0, 0);
		
		Arrays.sort(ans);
		System.out.println(ans[0]);
	}
	
	public static void combi(int i, int cnt) {
		if (cnt == half) {
			result = 0;
			pick(0, 0);

			if (team[0] == 0) {
				ans[idx] = result;
				idx++;
			} else {
				idx--;
				ans[idx] = Math.abs(result - ans[idx]);
			}
			
			return;
		}
		
		for (; i < N; i++) {
			team[cnt] = i;
			combi(i+1, cnt+1);
		}
	}
	
	public static void pick(int i, int cnt) {
		if (cnt == 2) {
			result += stat[pair[0]][pair[1]] + stat[pair[1]][pair[0]];
			return;
		}
		
		for (; i < half; i++) {
			pair[cnt] = team[i];
			pick(i+1, cnt+1);
		}
	}
}