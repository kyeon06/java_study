package org.task.ch06.task11;

import java.util.Scanner;

public class AlterString {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print(">> ");
		String sentence = scan.nextLine();
		
		StringBuffer sb = new StringBuffer(sentence);
		
		while(true) {
			System.out.print("명령 : ");
			String alter = scan.nextLine();
			if(alter.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String[] alterWord = alter.split("!");
			
			if(sb.indexOf(alterWord[0]) == -1) {
				System.out.println("찾을 수 없습니다.");
				continue;
			}else if (alterWord[0].equals("")) {
				System.out.println("잘못된 명령입니다!!");
				continue;
			}
			else {
				sb.replace(sb.indexOf(alterWord[0]), sb.indexOf(alterWord[0]) + alterWord[0].length(), alterWord[1]);				
			}
			
			System.out.println(sb);
			
		}
		
	}

}
