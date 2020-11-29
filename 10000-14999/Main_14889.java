/*
 * 14889. 스타트와 링크
 * https://www.acmicpc.net/problem/14889
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_14889 {
	static int N, tt, ans;
	static int[] idx, index, statSub;
	static int[][] stat;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		stat = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			for (int j = 0; j < N; j++) {
				stat[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int top = 1, bottom = 2;
		for (int i = 0; i < N/2; i++) {
			top *= N - i;
			bottom *= i + 1;
		}
		
		tt = 0;
		idx = new int[N/2];
		index = new int[2];
		statSub = new int[top/bottom];
		combi(0, 0);
		
		Arrays.sort(statSub);
		
		System.out.println(statSub[0]);
	}
	
	public static void combi(int i, int cnt) {
		if (cnt == N/2) {
			if (idx[0] == 0) {
				statSub[tt] = pick(0, 0, 0);
				tt++;
			} else {
				tt--;
				statSub[tt] = Math.abs(pick(0, 0, 0) - statSub[tt]);
			}
			return;
		}
		
		for (; i < N; i++) {
			idx[cnt] = i;
			combi(i+1, cnt+1);
		}
	}
	
	public static int pick(int i, int cnt, int result) {
		if (cnt == 2) {
			return stat[index[0]][index[1]] + stat[index[1]][index[0]];
		}
		
		for (int len = N/2; i < len; i++) {
			index[cnt] = idx[i];
			result += pick(i+1, cnt+1, result);
		}
		
		return result;
	}
}