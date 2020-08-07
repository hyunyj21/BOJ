/*
 * 1330. 두 수 비교하기
 * https://www.acmicpc.net/problem/1330
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1330 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if (A > B) System.out.println(">");
		else if (A < B) System.out.println("<");
		else System.out.println("==");
	}
}