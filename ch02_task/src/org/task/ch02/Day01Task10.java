package org.task.ch02;

import java.util.Scanner;

public class Day01Task10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int radius1 = scanner.nextInt();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int radius2 = scanner.nextInt();
		
		// a^2 + b^2 = c^2�� �̿��Ͽ� �� �߽� ������ �Ÿ��� �� ���� ������ �� ���� ���� ��� : ��ģ��. 
		if (Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2)) < (radius1+radius2)){
			System.out.println("�� ���� ���� ��ģ��.");
		}
		else {
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		}
				
		scanner.close();
	}

}
