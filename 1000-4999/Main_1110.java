/*
 * 1110. 더하기 사이클
 * https://www.acmicpc.net/problem/1110
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1110 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int newNum = N, ans = 0;
		
		do {
			int tmp = (newNum / 10) + (newNum % 10);
			newNum = (newNum % 10) * 10 + (tmp % 10);
			
			ans++;
		} while (newNum != N);
		
		System.out.println(ans);
	}
}