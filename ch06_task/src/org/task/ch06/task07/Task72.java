package org.task.ch06.task07;

import java.util.Scanner;

public class Task72 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.print(">> ");
			String query = scan.nextLine();
			
			if (query.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			
			String s[] = query.split(" ");
			System.out.println("���� ������ " + s.length);
		}
	}
}
