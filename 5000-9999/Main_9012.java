/*
 * 9012. 괄호
 * https://www.acmicpc.net/problem/9012
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9012 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String tmp = in.readLine();
			Stack<Character> stack = new Stack<>();
			boolean flag = true;
			
			for (int i = 0, len = tmp.length(); i < len; i++) {
				if (tmp.charAt(i) == '(') {
					stack.push('(');
					continue;
				}
				
				if (stack.size() == 0) {
					flag = false;
					break;
				}
				
				stack.pop();
			}
			
			if (!flag || flag && stack.size() != 0) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}