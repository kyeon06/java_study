package org.task.ch06.task11;

import java.util.Scanner;

public class AlterString {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print(">> ");
		String sentence = scan.nextLine();
		
		StringBuffer sb = new StringBuffer(sentence);
		
		while(true) {
			System.out.print("��� : ");
			String alter = scan.nextLine();
			if(alter.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			String[] alterWord = alter.split("!");
			
			if(sb.indexOf(alterWord[0]) == -1) {
				System.out.println("ã�� �� �����ϴ�.");
				continue;
			}else if (alterWord[0].equals("")) {
				System.out.println("�߸��� ����Դϴ�!!");
				continue;
			}
			else {
				sb.replace(sb.indexOf(alterWord[0]), sb.indexOf(alterWord[0]) + alterWord[0].length(), alterWord[1]);				
			}
			
			System.out.println(sb);
			
		}
		
	}

}
