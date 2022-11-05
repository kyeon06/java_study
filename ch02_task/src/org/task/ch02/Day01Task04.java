package org.task.ch02;

import java.util.Scanner;

public class Day01Task04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		
		if (n1 >= n2) {
			if(n2 >= n3)
				System.out.printf("중간 값은 %d", n2);
			else if (n3 >= n1) 
				System.out.printf("중간 값은 %d", n1);
			else
				System.out.printf("중간 값은 %d", n3);
			
		}
		else if (n1 >= n3) {
			System.out.printf("중간 값은 %d", n1);
		}
		else if (n2 >= n3) {
			System.out.printf("중간 값은 %d", n3);
		}
		else {
			System.out.printf("중간 값은 %d", n2);
		}
		
		scanner.close();
	}
}
