package org.task.ch02;

import java.util.Scanner;

public class Day01Task07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		int n1 = 100;
		int n2 = 200;
		
		if ((x > n1 && x < n2) && (y > n1 && y < n2)) {
			System.out.printf("(%d, %d)는 사각형 안에 있습니다.", x, y);
		}
		else {
			System.out.println("사각형 안에 존재하지 않습니다.");
		}
		
		scanner.close();
	}
}
