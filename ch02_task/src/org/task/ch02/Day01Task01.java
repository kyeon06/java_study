package org.task.ch02;

import java.util.Scanner;

public class Day01Task01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input_money = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� : ��)>>");
		float money = input_money.nextFloat();
		float dollar = 1100;
		float exchange = money / dollar;
		
		// ����� ���
		System.out.printf("%.0f���� $%.1f�Դϴ�.", money, exchange);

		input_money.close(); // scanner �ݱ�

	}
}
