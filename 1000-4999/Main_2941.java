/*
 * 2941. 크로아티아 알파벳
 * https://www.acmicpc.net/problem/2941
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2941 {
	static String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String word = in.readLine();
		int ans = 0, len = word.length(), idx = 0;
		
		while (true) {
			if (idx >= len) break;
			
			for (int j = 0; j < 8; j++) {
				int tmp = alpha[j].length();
				
				if (idx+tmp <= len && word.substring(idx, idx+tmp).equals(alpha[j])) {
					idx += tmp - 1;
					break;
				}
			}
			
			idx++;
			ans++;
		}
		
		System.out.println(ans);
	}
}