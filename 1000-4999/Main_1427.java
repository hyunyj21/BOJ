/*
 * 1427. 소트인사이드
 * https://www.acmicpc.net/problem/1427
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main_1427 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(in.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		while (N >= 10) {
			list.add(N % 10);
			N /= 10;
		}
		
		list.add(N);
		list.sort(Comparator.reverseOrder());
		
		for (int i = 0, len = list.size(); i < len; i++) {
			sb.append(list.get(i));
		}
		
		System.out.println(sb);
	}
}