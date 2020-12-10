/*
 * 1966. 프린터 큐
 * https://www.acmicpc.net/problem/1966
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_1966 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 0; t < tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			LinkedList<int[]> importance = new LinkedList<>();
			
			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < N; i++) {
				importance.offer(new int[] {Integer.parseInt(st.nextToken()), i});
			}
			
			int cnt = 1;
			while (true) {
				int idx = 0, max = 0;
				for (int i = 0, len = importance.size(); i < len; i++) {
					if (importance.get(i)[0] > max) {
						idx = i;
						max = importance.get(i)[0];
					}
				}
				
				if (importance.get(idx)[1] == M) break;

				importance.remove(idx);
				if (max != importance.get(0)[0]) importance.offer(importance.poll());
				cnt++;
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.print(sb);
	}
}