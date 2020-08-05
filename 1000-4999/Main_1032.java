/*
 * 1032. 명령 프롬프트
 * https://www.acmicpc.net/problem/1032
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1032 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine()) - 1;
		
		String ans = in.readLine(), tmp1 = "";
		int len = ans.length();
		for (int i = 0; i < N; i++) {
			String tmp2 = in.readLine();
			
			for (int j = 0; j < len; j++) {
				if (ans.charAt(j) == '?' || ans.charAt(j) == tmp2.charAt(j)) tmp1 += ans.charAt(j);
				else tmp1 += "?";
			}
			
			ans = tmp1;
			tmp1 = "";
		}
		
		System.out.println(ans);
	}
}