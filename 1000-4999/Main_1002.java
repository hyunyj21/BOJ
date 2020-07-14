/*
 * 1002. 터렛
 * https://www.acmicpc.net/problem/1002
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1002 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 0; t < tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println("-1");
				continue;
			}
			
			double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			
			if (r1 < r2) {
				int tmp = r2;
				r2 = r1;
				r1 = tmp;
			}
			
			if (r1+r2 > d && r1-r2 < d) System.out.println("2");
			else if (r1+r2 == d || r1-r2 == d) System.out.println("1");
			else System.out.println("0");
		}
	}
}