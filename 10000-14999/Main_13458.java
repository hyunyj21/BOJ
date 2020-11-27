/*
 * 13458. 시험 감독
 * https://www.acmicpc.net/problem/13458
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13458 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long ans = Long.parseLong(in.readLine());
		
		StringTokenizer A = new StringTokenizer(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		while(A.hasMoreTokens()) {
			int tmp = Integer.parseInt(A.nextToken());
			
			if (tmp-B < 1) continue;
			ans += (tmp - B - 1) / C + 1;
		}
		
		System.out.println(ans);
	}
}