package org.task.ch06.task08;

import java.util.Scanner;

public class Task08 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String sentence = scan.nextLine();
		
		
		for(int i = 1; i <= sentence.length(); i++) {
			System.out.println(sentence.substring(i) + sentence.substring(0, i));
		}
	}
}