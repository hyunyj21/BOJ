/*
 * 1316. 그룹 단어 체커
 * https://www.acmicpc.net/problem/1316
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1316 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			String tmp = in.readLine();
			int alpha = 0;
			boolean[] check = new boolean[26];
			boolean flag = true;
			
			for (int j = 0, len = tmp.length(); j < len; j++) {
				int cur = tmp.charAt(j) - 'a';
				
				if (!check[cur]) {
					alpha = cur;
					check[cur] = true;
					continue;
				}
				
				if (alpha != cur) {
					flag = false;
					break;
				}
			}
			
			if (flag) ans++;
		}
		
		System.out.println(ans);
	}
}