package org.task.ch02;

import java.util.Scanner;

public class Day01Task09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>>>");
		float center_x = scanner.nextInt();
		float center_y = scanner.nextInt();
		float radius = scanner.nextFloat();
		
		System.out.print("�� �Է�>>");
		float x = scanner.nextInt();
		float y = scanner.nextInt();
		
		// �� (x, y)�� ���� �߽� ������ �Ÿ��� ���������� ���� ��� �� �ȿ� �����Ѵ�.
		if (Math.sqrt(Math.pow(center_x - x, 2) + Math.pow(center_y - y, 2)) < radius) {
			System.out.printf("�� (%.1f, %.1f)�� �� �ȿ� �ִ�.", x, y);
		}
		else {
			System.out.printf("�� (%.1f, %.1f)�� �� �ȿ� ����.", x, y);
		}
		
		scanner.close();
		
	}
}
