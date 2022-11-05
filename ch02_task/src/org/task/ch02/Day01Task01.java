package org.task.ch02;

import java.util.Scanner;

public class Day01Task01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input_money = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 : 원)>>");
		float money = input_money.nextFloat();
		float dollar = 1100;
		float exchange = money / dollar;
		
		// 결과값 출력
		System.out.printf("%.0f원은 $%.1f입니다.", money, exchange);

		input_money.close(); // scanner 닫기

	}
}
