package org.task.ch02;

import java.util.Scanner;

public class Day01Task03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		System.out.printf("오만원권 %d매\n", money/50000);
		money = money % 50000;
		
		System.out.printf("만원권 %d매\n", money/10000);
		money = money % 10000;
		
		System.out.printf("천원권 %d매\n", money/1000);
		money = money % 1000;
		
		System.out.printf("백원 %d개\n", money/100);
		money = money % 100;
		
		System.out.printf("오십원 %d개\n", money/50);
		money = money % 50;
		
		System.out.printf("십원 %d개\n", money/10);
		money = money % 10;
		
		System.out.printf("일원 %d개\n", money);
		
		scanner.close();
	}

}
