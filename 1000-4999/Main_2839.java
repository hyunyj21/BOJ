/*
 * 2839. 설탕 배달
 * https://www.acmicpc.net/problem/2839
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2839 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int ans = 0;
		
		while(true) {
			if (N < 0) {
				ans = -1;
				break;
			}
			
			if (N % 5 == 0) {
				ans += N / 5;
				break;
			}
			
			N -= 3;
			ans++;
		}
		
		System.out.println(ans);
	}
}