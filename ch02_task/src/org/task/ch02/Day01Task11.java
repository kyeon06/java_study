package org.task.ch02;

import java.util.Scanner;

public class Day01Task11 {
	// if문 사용
	public static String method_if(int num) {
		
		if ((num>=3) && (num<=5)) {
			return "봄";
		}
		else if ((num>=6) && (num<=8)) {
			return "여름";
		}
		else if ((num>=9) && (num<=11)) {
			return "가을";
		}
		else if ((num==1) || (num==2) || (num==12)) {
			return "겨울";
		}
		else {
			return "잘못입력";
		}
	}
	// Switch문 사용
	public static String method_switch(int num) {
			
		switch (num) {
		case 3:
		case 4:
		case 5:
			return "봄";
		case 6:
		case 7:
		case 8:
			return "여름";
		case 9:
		case 10:
		case 11:
			return "가을";
		case 1:
		case 2:
		case 12:
			return "겨울";
		default:
			return "잘못입력";
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>>");
		int num = scanner.nextInt();
		
		System.out.printf("if문 사용 : %s\n", method_if(num));
		System.out.printf("switch문 사용 : %s", method_switch(num));
		
		scanner.close();
	}

}
