/*
 * 1181. 단어 정렬
 * https://www.acmicpc.net/problem/1181
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main_1181 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(in.readLine());
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list.add(in.readLine());
		}
		
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length()) return o1.length() - o2.length();
				else return o1.compareTo(o2);
			}
		});
		
		for (int i = 0; i < N; i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.print(sb);
	}
}