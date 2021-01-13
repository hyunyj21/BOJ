/*
 * 2231. 분해합
 * https://www.acmicpc.net/problem/2231
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2231 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			int tmp = i, sum = i;
			
			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			
			if (sum == N) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
	}
}