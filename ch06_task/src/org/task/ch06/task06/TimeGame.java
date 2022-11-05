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
		
		System.out.println(">>> 10�ʿ� ����� ����� �̱�� ���� <<<");
		
		System.out.print("�� ���� ������ ���� �Է��Ͻÿ� >>> ");
		int size = scan.nextInt();
		
		// player ����ŭ �迭 ����
		Player[] players = new Player[size];
		
		System.out.println("\n�� ���� ������ �г����� �Է��Ͻÿ� >>> ");
		
		for (int i = 0; i< size ; i++) {
			System.out.printf("�� player(%d) >>> ", i);
			String name = scan.next();
			players[i] = new Player(name);
		}
		System.out.println();
		scan.nextLine();
		
		for(int i = 0; i < size ; i++) {
			
			System.out.print(players[i] + " ���� <Enter>Ű >>");
			scan.nextLine();
			now = Calendar.getInstance();
			int start = now.get(Calendar.SECOND);
			System.out.println("---���� �� �ð� = " + start);
			
			
			// second
			System.out.print("10�� ���� �� <Enter>Ű >>");
			scan.nextLine();
			now = Calendar.getInstance();
			int end = now.get(Calendar.SECOND);
			System.out.println("---���� �� �ð� = " + end);
			
			players[i].set(start, end);
			
			System.out.println();
		}
		
		// ��� ���
		int min = 10000;
		String winner = "";
		for ( int i = 0; i < size; i++) {
			System.out.printf("%s�� ��� %d, ", players[i].name, players[i].result);
			if( min > players[i].gap) {
				min = players[i].gap;
				winner = players[i].name;
			}
		}
		
		System.out.println("���ڴ� " + winner);
		
		
	}

}
