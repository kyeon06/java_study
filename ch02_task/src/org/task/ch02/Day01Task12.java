package org.task.ch02;

import java.util.Scanner;

public class Day01Task12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����>>");
		float n1 = scanner.nextFloat();
		String operator = scanner.next();
		float n2 = scanner.nextFloat();
		float result = 0;
		
		// ����
		if (operator.equals("+")) {
			result = n1 + n2;
			
		}
		// ����
		else if (operator.equals("-")) {
			result = n1 - n2;
			
		}
		// ����
		else if (operator.equals("*")) {
			result = n1 * n2;
			
		}
		// ������
		else if (operator.equals("/")) {
			if (n2 != 0)
				result = n1 / n2;
			else
				System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		// ��� ���
		System.out.printf("%.0f%s%.0f�� ��� ����� %.1f", n1, operator,n2, result);
		scanner.close();
		
	}
}
