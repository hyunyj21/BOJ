/*
 * 2914. 저작권
 * https://www.acmicpc.net/problem/2914
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2914 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int i = Integer.parseInt(st.nextToken());
		
		System.out.println((i-1)*A+1);
	}
}