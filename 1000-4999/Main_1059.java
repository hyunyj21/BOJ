/*
 * 1059. 수2
 * https://www.acmicpc.net/problem/1059
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1059 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(in.readLine())+1;
		int[] set = new int[L];

		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		for (int i = 1; i < L; i++) {
			set[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(set);
		
		int N = Integer.parseInt(in.readLine());
		int ans = 0;
		for (int i = 0; i < L; i++) {
			if (set[i] == N) break;
			
			if (set[i] < N && set[i+1] > N) {
				ans += (N-set[i]-1) + (set[i+1]-N-1);
				break;
			}
		}
		
		System.out.println(ans);
	}
}