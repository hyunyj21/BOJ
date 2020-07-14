/*
 * 1001. A-B
 * https://www.acmicpc.net/problem/1001
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1001 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int A = in.read() - '0';
		in.read();
		int B = in.read() - '0';
		
		System.out.println(A-B);
	}
}