package org.task.ch06.task08;

import java.util.Scanner;

public class Task08 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String sentence = scan.nextLine();
		
		
		for(int i = 1; i <= sentence.length(); i++) {
			System.out.println(sentence.substring(i) + sentence.substring(0, i));
		}
	}
}