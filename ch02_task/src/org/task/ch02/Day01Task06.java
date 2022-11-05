package org.task.ch02;

import java.util.Scanner;

public class Day01Task06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		
		int n = num / 10;
		int m = num % 10;
		
		int count = 0;
		if (m == 3 || m == 6 || m == 9)
			count++;
		if (n == 3 || n == 6 || n == 9)
			count++;
		
		if (count == 1)
			System.out.println("박수짝");
		else if (count == 2)
			System.out.println("박수짝짝");
		else System.out.println(num);

		scanner.close();
	}
}
