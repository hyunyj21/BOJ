/*
 * 1008. A/B
 * https://www.acmicpc.net/problem/1008
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1008 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		
		System.out.println(A/B);
	}
}