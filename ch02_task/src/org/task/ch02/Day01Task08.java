package org.task.ch02;

import java.util.Scanner;

public class Day01Task08 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x>=rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
			return true;
		}
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("점 (x1, y1)을 입력하세요>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.print("점 (x2, y2)을 입력하세요>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		boolean result1 = inRect(x1,y1,100,100,200,200);
		boolean result2 = inRect(x2,y2,100,100,200,200);
		
		if (result1 || result2){
			System.out.println("충돌한다.");
		}
		else {
			System.out.println("충돌하지 않는다.");
		}
		
		scanner.close();
		
	}
}
