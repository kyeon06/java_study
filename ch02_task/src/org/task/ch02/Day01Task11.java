package org.task.ch02;

import java.util.Scanner;

public class Day01Task11 {
	// if�� ���
	public static String method_if(int num) {
		
		if ((num>=3) && (num<=5)) {
			return "��";
		}
		else if ((num>=6) && (num<=8)) {
			return "����";
		}
		else if ((num>=9) && (num<=11)) {
			return "����";
		}
		else if ((num==1) || (num==2) || (num==12)) {
			return "�ܿ�";
		}
		else {
			return "�߸��Է�";
		}
	}
	// Switch�� ���
	public static String method_switch(int num) {
			
		switch (num) {
		case 3:
		case 4:
		case 5:
			return "��";
		case 6:
		case 7:
		case 8:
			return "����";
		case 9:
		case 10:
		case 11:
			return "����";
		case 1:
		case 2:
		case 12:
			return "�ܿ�";
		default:
			return "�߸��Է�";
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int num = scanner.nextInt();
		
		System.out.printf("if�� ��� : %s\n", method_if(num));
		System.out.printf("switch�� ��� : %s", method_switch(num));
		
		scanner.close();
	}

}
