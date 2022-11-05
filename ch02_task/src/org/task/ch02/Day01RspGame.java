package org.task.ch02;

import java.util.Scanner;

public class Day01RspGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		// 입력값 받기
		System.out.print("철수 >> ");
		String rsp_cs = scanner.next();
		System.out.print("영희 >> ");
		String rsp_yh = scanner.next();
		
		// 비긴 경우
		if(rsp_cs.equals(rsp_yh)) {
			System.out.println("비겼습니다.");
		}
		
		// 승자가 있는 경우
		else{
			// 철수가 가위를 낸 경우
			if(rsp_cs.equals("가위")){
				if(rsp_yh.equals("보")) {
					System.out.println("철수가 이겼습니다.");
				}
				else {
					System.out.println("영희가 이겼습니다.");
				}
			}
			// 철수가 바위를 낸 경우
			else if(rsp_cs.equals("바위")) {
				if(rsp_yh.equals("가위")) {
					System.out.println("철수가 이겼습니다.");
				}
				else {
					System.out.println("영희가 이겼습니다.");
				}
			}
			// 철수가 보를 낸 경우
			else {
				if(rsp_yh.equals("바위")) {
					System.out.println("철수가 이겼습니다.");
				}
				else {
					System.out.println("영희가 이겼습니다.");
				}
			}
		}
		// scanner 닫기
		scanner.close();
	}

}
