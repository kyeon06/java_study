package org.task.ch02;

import java.util.Scanner;

public class Day01Task07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		int n1 = 100;
		int n2 = 200;
		
		if ((x > n1 && x < n2) && (y > n1 && y < n2)) {
			System.out.printf("(%d, %d)�� �簢�� �ȿ� �ֽ��ϴ�.", x, y);
		}
		else {
			System.out.println("�簢�� �ȿ� �������� �ʽ��ϴ�.");
		}
		
		scanner.close();
	}
}
