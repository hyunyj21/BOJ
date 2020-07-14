/*
 * 1000. A+B
 * https://www.acmicpc.net/problem/1000
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1000 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		int A = input.charAt(0) - '0';
		int B = input.charAt(2) - '0';
		
		System.out.println(A+B);
	}
}