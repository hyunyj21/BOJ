/*
 * 5554. 심부름 가는 길
 * https://www.acmicpc.net/problem/5554
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5554 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int sum  = 0;
		for (int i = 0; i < 4; i++)
			sum += Integer.parseInt(in.readLine());
		
		System.out.print(sum/60 + "\n" + sum%60);
	}
}