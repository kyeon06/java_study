package org.task.ch02;

import java.util.Scanner;

public class Day01Task02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int num = scanner.nextInt();

		if (num < 10 || num > 99) {
			System.out.println("10~99 ������ ���� �ٽ��Է��ϼ���");
		}
		else {
			int n = num / 10;
			int m = num % 10;
			if (n == m) {
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			
			}
			else {
				System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
			}
		}
		
		scanner.close();

	}
}
