package org.task.ch02;

import java.util.Scanner;

public class Day01Task09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>>");
		float center_x = scanner.nextInt();
		float center_y = scanner.nextInt();
		float radius = scanner.nextFloat();
		
		System.out.print("점 입력>>");
		float x = scanner.nextInt();
		float y = scanner.nextInt();
		
		// 점 (x, y)와 원의 중심 사이의 거리가 반지름보다 작을 경우 원 안에 존재한다.
		if (Math.sqrt(Math.pow(center_x - x, 2) + Math.pow(center_y - y, 2)) < radius) {
			System.out.printf("점 (%.1f, %.1f)는 원 안에 있다.", x, y);
		}
		else {
			System.out.printf("점 (%.1f, %.1f)는 원 안에 없다.", x, y);
		}
		
		scanner.close();
		
	}
}
