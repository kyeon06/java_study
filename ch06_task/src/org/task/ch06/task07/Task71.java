package org.task.ch06.task07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Task71 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			System.out.print(">> ");
			String query = scan.nextLine();
			
			if (query.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(query, " ");
			System.out.println("���� ������ " + st.countTokens());
		}
	}
}
