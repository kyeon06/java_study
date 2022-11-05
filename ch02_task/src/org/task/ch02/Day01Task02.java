package org.task.ch02;

import java.util.Scanner;

public class Day01Task02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = scanner.nextInt();

		if (num < 10 || num > 99) {
			System.out.println("10~99 사이의 수로 다시입력하세요");
		}
		else {
			int n = num / 10;
			int m = num % 10;
			if (n == m) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			
			}
			else {
				System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
			}
		}
		
		scanner.close();

	}
}
