/*
 * 1550. 16진수
 * https://www.acmicpc.net/problem/1550
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1550 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(Integer.parseInt(in.readLine(), 16));
	}
}