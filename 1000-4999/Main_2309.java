/*
 * 2309. 일곱 난쟁이
 * https://www.acmicpc.net/problem/2309
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2309 {
	static int N = 9;
	static int[] ans, num;
	static boolean flag;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(in.readLine());
		}
		
		Arrays.sort(num);
		
		ans = new int[N];
		flag = false;
		combi(0, 0, 0);
		
		for (int i = 0; i < 7; i++) {
			sb.append(ans[i]).append("\n");
		}
		
		System.out.print(sb);
	}
	
	public static void combi(int idx, int cnt, int sum) {
		if (cnt == 7) {
			if (sum == 100) flag = true;
			return;
		}
		
		for (int i = idx; i < N; i++) {
			ans[cnt] = num[i]; 
			combi(idx+1, cnt+1, sum+num[i]);
			
			if (flag) break;
		}
	}
}