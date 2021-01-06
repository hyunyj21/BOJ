/*
 * 4949. 균형잡힌 세상
 * https://www.acmicpc.net/problem/4949
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_4949 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String sentence = in.readLine();
			
			if (sentence.equals(".")) break;
			
			Stack<Character> stack = new Stack<>();
			boolean flag = true;
			
			for (int i = 0, len = sentence.length(); i < len; i++) {
				char tmp = sentence.charAt(i);
				
				if (tmp == '(' || tmp =='[') {
					stack.push(tmp);
					continue;
				}
				
				if (tmp == ')') {
					if (stack.size() == 0 || stack.pop() != '(') {
						flag = false;
						break;
					}
				}
				
				if (tmp == ']') {
					if (stack.size() == 0 || stack.pop() != '[') {
						flag = false;
						break;
					}
				}
			}
			
			if (!flag || stack.size()!= 0) sb.append("no \n");
			else sb.append("yes \n");
		}
		
		System.out.print(sb);
	}
}