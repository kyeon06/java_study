package org.task.ch06.task06;

import java.util.Calendar;
import java.util.Scanner;

class Player {
	String name;
	int result;
	int gap;
	
	Player(String name) {
		this.name = name;
	}
	
	public void set(int start, int end) {
		if (start > end) {
			this.result = 60 - start + end;
		}
		else{
			this.result = Math.abs(start - end);
		}
		
		this.gap = Math.abs(10 - this.result);
	}

	
	@Override
	public String toString() {
		return name;
	}

}

public class TimeGame {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Calendar now;
		
		System.out.println(">>> 10초에 가까운 사람이 이기는 게임 <<<");
		
		System.out.print("※ 게임 참가자 수를 입력하시오 >>> ");
		int size = scan.nextInt();
		
		// player 수만큼 배열 생성
		Player[] players = new Player[size];
		
		System.out.println("\n※ 게임 참가자 닉네임을 입력하시오 >>> ");
		
		for (int i = 0; i< size ; i++) {
			System.out.printf("※ player(%d) >>> ", i);
			String name = scan.next();
			players[i] = new Player(name);
		}
		System.out.println();
		scan.nextLine();
		
		for(int i = 0; i < size ; i++) {
			
			System.out.print(players[i] + " 시작 <Enter>키 >>");
			scan.nextLine();
			now = Calendar.getInstance();
			int start = now.get(Calendar.SECOND);
			System.out.println("---현재 초 시간 = " + start);
			
			
			// second
			System.out.print("10초 예상 후 <Enter>키 >>");
			scan.nextLine();
			now = Calendar.getInstance();
			int end = now.get(Calendar.SECOND);
			System.out.println("---현재 초 시간 = " + end);
			
			players[i].set(start, end);
			
			System.out.println();
		}
		
		// 결과 계산
		int min = 10000;
		String winner = "";
		for ( int i = 0; i < size; i++) {
			System.out.printf("%s의 결과 %d, ", players[i].name, players[i].result);
			if( min > players[i].gap) {
				min = players[i].gap;
				winner = players[i].name;
			}
		}
		
		System.out.println("승자는 " + winner);
		
		
	}

}
