package org.task.ch02;

import java.util.Scanner;

public class Day01Task03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		
		System.out.printf("�������� %d��\n", money/50000);
		money = money % 50000;
		
		System.out.printf("������ %d��\n", money/10000);
		money = money % 10000;
		
		System.out.printf("õ���� %d��\n", money/1000);
		money = money % 1000;
		
		System.out.printf("��� %d��\n", money/100);
		money = money % 100;
		
		System.out.printf("���ʿ� %d��\n", money/50);
		money = money % 50;
		
		System.out.printf("�ʿ� %d��\n", money/10);
		money = money % 10;
		
		System.out.printf("�Ͽ� %d��\n", money);
		
		scanner.close();
	}

}
