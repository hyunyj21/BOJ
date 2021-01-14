/*
 * 10989. 수 정렬하기 3
 * https://www.acmicpc.net/problem/10989
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10989 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(in.readLine());
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(in.readLine());
		}
		
		Arrays.sort(num);
		
		for (int i = 0; i < N; i++) {
			sb.append(num[i]).append("\n");
		}
		
		System.out.print(sb);
	}
}