package org.task.ch02;

import java.util.Scanner;

public class Day01Task05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		if ((n1 + n2 > n3) && (n1 + n3 > n2) && (n2+n3 > n1)){
			System.out.println("�ﰢ���� �˴ϴ�");
		}
		else {
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		}
		scanner.close();
		
	}
}
