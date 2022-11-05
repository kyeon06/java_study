package org.task.ch02;

import java.util.Scanner;

public class Day01Task10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int radius1 = scanner.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int radius2 = scanner.nextInt();
		
		// a^2 + b^2 = c^2를 이용하여 두 중심 사이의 거리가 두 원의 반지름 합 보다 작을 경우 : 겹친다. 
		if (Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2)) < (radius1+radius2)){
			System.out.println("두 원은 서로 겹친다.");
		}
		else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
				
		scanner.close();
	}

}
