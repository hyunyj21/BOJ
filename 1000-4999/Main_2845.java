/*
 * 2845. 파티가 끝나고 난 뒤
 * https://www.acmicpc.net/problem/2845
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2845 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int total = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(in.readLine(), " ");
		for (int i = 0; i < 5; i++)
			sb.append(Integer.parseInt(st.nextToken())-total).append(" ");
		
		System.out.println(sb);
	}
}