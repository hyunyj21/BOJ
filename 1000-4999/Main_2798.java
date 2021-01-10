/*
 * 2798. 블랙잭
 * https://www.acmicpc.net/problem/2798
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2798 {
	static int N, M, ans;
	static int[] card;
	static boolean flag;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(in.readLine());
		card = new int[N];
		
		for (int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(card);
		
		flag = false;
		combi(0, 0, 0);
		
		System.out.println(ans);
	}
	
	public static void combi(int cnt, int idx, int sum) {
		if (cnt == 3) {
			if (sum == M) {
				flag = true;
				ans = M;
			} else if (sum < M) {
				ans = Math.max(ans, sum);
			}
			
			return;
		}
		
		if (sum > M) return;
		
		for (int i = idx; i < N; i++) {
			combi(cnt+1, i+1, sum+card[i]);
			
			if (flag) break;
		}
	}
}