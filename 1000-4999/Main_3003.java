/*
 * 3003. 킹, 퀸, 룩, 비숍, 나이트, 폰
 * https://www.acmicpc.net/problem/3003
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3003 {
	static int[] chess = {1, 1, 2, 2, 2, 8};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		
		for (int i = 0; i < 6; i++)
			sb.append(chess[i] - Integer.parseInt(st.nextToken())).append(" ");
		
		System.out.println(sb);
	}
}