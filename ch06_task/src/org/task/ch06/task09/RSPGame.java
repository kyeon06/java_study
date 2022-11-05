package org.task.ch06.task09;

import java.util.Scanner;

public class RSPGame {
	static Scanner scan = new Scanner(System.in);
	static String[] rspList = {"가위", "바위", "보"};
	public static void main(String[] args) {
		
		while(true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)] >> ");
			int me = scan.nextInt();
			if(me == 4) break;
			int com = (int)(Math.random()*3) + 1;
			
			
			System.out.printf("철수(%s) : 컴퓨터(%s)\n", rspList[me-1], rspList[com-1]);
			
			if(rspList[me-1].equals(rspList[com-1])) {
				System.out.println("비겼습니다.");
				
			}
			
			else if(rspList[me-1].equals("가위")) {
				if(rspList[com-1].equals("바위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}else {
					System.out.println("철수가 이겼습니다.");					
				}
			}
			
			else if(rspList[me-1].equals("바위")) {
				if(rspList[com-1].equals("보")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}else {
					System.out.println("철수가 이겼습니다.");					
				}
			}
			
			else if(rspList[me-1].equals("보")) {
				if(rspList[com-1].equals("가위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}else {
					System.out.println("철수가 이겼습니다.");					
				}
			}
			
		}
	}

}
