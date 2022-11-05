package org.task.ch02;

import java.util.Scanner;

public class Day01Task05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하시오>>");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		if ((n1 + n2 > n3) && (n1 + n3 > n2) && (n2+n3 > n1)){
			System.out.println("삼각형이 됩니다");
		}
		else {
			System.out.println("삼각형이 안됩니다");
		}
		scanner.close();
		
	}
}
