package org.task.ch06.task07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Task71 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			System.out.print(">> ");
			String query = scan.nextLine();
			
			if (query.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(query, " ");
			System.out.println("어절 개수는 " + st.countTokens());
		}
	}
}
