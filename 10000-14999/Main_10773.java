/*
 * 10773. 제로
 * https://www.acmicpc.net/problem/10773
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(in.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < K; i++) {
			int tmp = Integer.parseInt(in.readLine());
			
			if (tmp == 0) stack.pop();
			else stack.push(tmp);
		}
		
		long ans = 0;
		for (int i = 0, len = stack.size(); i < len; i++) {
			ans += stack.pop();
		}
		
		System.out.println(ans);
	}
}