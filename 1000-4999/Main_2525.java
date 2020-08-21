/*
 * 2525. 오븐 시계
 * https://www.acmicpc.net/problem/2525
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2525 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int hour =  Integer.parseInt(st.nextToken());
		int min =  Integer.parseInt(st.nextToken());
		int cook = Integer.parseInt(in.readLine());
		
		min += cook;
		if (min >= 60) {
			hour += min / 60;
			min = min % 60;
		}
		
		if (hour >= 24) hour = hour % 24;
		
		System.out.println(hour+" "+min);
	}
}