/*
 * 1065. 한수
 * https://www.acmicpc.net/problem/1065
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1065 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int ans = 0;
		
		for (int i = 1; i <= N; i++) {
			if (i < 100) {
				ans++;
				continue;
			}
			
			int tmp = i, before = 10, add = 10;
			boolean flag = true;
			
			while (tmp > 0) {
				int cur = tmp % 10;
				tmp /= 10;
				
				if (before == 10) {
					before = cur;
					continue;
				}
				
				if (add == 10) {
					add = cur - before;
					before = cur;
					continue;
				}
				
				if (cur - before != add) {
					flag = false;
					break;
				}
				
				before = cur;
			}
			
			if (flag) ans++;
		}
		
		System.out.println(ans);
	}
}