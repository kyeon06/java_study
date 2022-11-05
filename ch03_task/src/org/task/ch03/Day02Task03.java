package org.task.ch03;

import java.util.Scanner;

public class Day02Task03 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int num =0;
		System.out.print("정수를 입력하시오 >> ");
		num = scan.nextInt();
		
		for (int i=num; i > 0 ;i--) {
			for (int j=0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
