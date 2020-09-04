/*
 * 10869. 사칙연산
 * https://www.acmicpc.net/problem/10869
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10869 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append(A+B).append("\n");
		sb.append(A-B).append("\n");
		sb.append(A*B).append("\n");
		sb.append(A/B).append("\n");
		sb.append(A%B);
		
		System.out.println(sb);
	}
}