/*
 * 1076. 저항
 * https://www.acmicpc.net/problem/1076
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1076 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String ans = "";
		
		String a = val(in.readLine());
		String b = val(in.readLine());
		
		if (a.equals("0") && b.equals("0")) {
			System.out.println("0");
			return;
		}
		
		if (!a.equals("0")) ans += a;
		ans += b;
		
		for (int i = 0, len = Integer.parseInt(val(in.readLine())); i < len; i++) {
			ans += "0";
		}
		
		System.out.println(ans);
	}
	
	public static String val(String color) {
		String tmp = "";
		
		switch (color) {
			case "black": tmp = "0"; break;
			case "brown": tmp = "1"; break;
			case "red": tmp = "2"; break;
			case "orange": tmp = "3"; break;
			case "yellow": tmp = "4"; break;
			case "green": tmp = "5"; break;
			case "blue": tmp = "6"; break;
			case "violet": tmp = "7"; break;
			case "grey": tmp = "8"; break;
			case "white": tmp = "9"; break;
		}
		
		return tmp;
	}
}