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
			int tmp = Integer.parseInt(st.nextToken());
			
			if (i == 1) {
				price[i] = tmp;
				continue;
			}
			
			price[i] = Math.max(tmp, price[i-1] + price[1]);
			
			if (i % 2 == 0) price[i] = Math.max(price[i], price[i/2] * 2); 
		}
		
		System.out.println(price[N-1]);
	}
}