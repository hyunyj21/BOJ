/*
 * 1966. 프린터 큐
 * https://www.acmicpc.net/problem/1966
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
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
			LinkedList<Integer> max = new LinkedList<>();
			
			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				
				importance.offer(new int[] {tmp, i});
				max.offer(tmp);
			}
			
			max.sort(Collections.reverseOrder());
			
			int cnt = 1;
			while (true) {
				int[] cur = importance.poll();
				
				if (cur[0] != max.get(0)) {
					importance.offer(cur);
					continue;
				}
				
				if (cur[1] == M) break;
				
				max.remove();
				cnt++;
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.print(sb);
	}
}