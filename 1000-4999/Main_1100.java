/*
 * 1100. 하얀 칸
 * https://www.acmicpc.net/problem/1100
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1100 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int ans = 0;
		for (int i = 0; i < 8; i++) {
			String tmp = in.readLine();
			
			for (int j = 0; j < 8; j++) {
				if (tmp.charAt(j) == '.') continue;
				if ((i%2==0 && j%2==0) || (i%2==1 && j%2==1)) ans++;
			}
		}
		
		System.out.println(ans);
	}
}