/*
 * 11656. 접미사 배열
 * https://www.acmicpc.net/problem/11656
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_11656 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String word = in.readLine();
		int len = word.length();
		
		String[] ans = new String[len];
		
		for (int i = 0; i < len; i++) {
			ans[i] = word.substring(i);
		}
		
		Arrays.sort(ans);
		
		for (int i = 0; i < len; i++) {
			sb.append(ans[i]).append("\n");
		}
		
		System.out.print(sb);
	}
}