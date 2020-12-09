/*
 * 11052. 카드 구매하기
 * https://www.acmicpc.net/problem/11052
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11052 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine()) + 1;
		int[] price = new int[N];
		
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		for (int i = 1; i < N; i++) {
			price[i] = Integer.parseInt(st.nextToken());

			for (int j = 1; j < i; j++) {
				price[i] = Math.max(price[i], price[j] + price[i-j]);
			}
		}
		
		System.out.println(price[N-1]);
	}
}