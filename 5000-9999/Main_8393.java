/*
 * 8393. 합
 * https://www.acmicpc.net/problem/8393
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_8393 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		System.out.println(n*(n+1)/2);
	}
}