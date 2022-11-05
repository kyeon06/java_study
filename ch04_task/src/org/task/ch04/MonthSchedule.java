package org.task.ch04;

import java.util.Scanner;

class Day {
	private String work;
	
	public void set(String work) {
		this.work = work;
	}
	
	public String get() {
		return work;
	}
	
	public void show() {
		if (work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}


public class MonthSchedule {
	private Day[] workArr;
	private int total_day;
	public static final Scanner scan = new Scanner(System.in);
	
	public MonthSchedule(int days) {
		this.total_day = days;
		
		// Day ��ü �迭 ����
		workArr = new Day[days];
		for (int i = 0; i < days ; i++) {
			workArr[i] = new Day();
		}
	}
	
	// �Է� : 1
	public void input() {
		System.out.printf("��¥(1~%d) ? ", total_day);
		int day = scan.nextInt();
		
		System.out.print("����(��ĭ�����Է�) ? ");
		String work = scan.next();
		
		workArr[day-1].set(work);

	}
	// ���� : 2
	public void view() {
		System.out.printf("��¥(1~%d) ? ", total_day);
		int day = scan.nextInt();
		
		System.out.print(day+"���� �� ���� ");
		workArr[day-1].show();
	}
	
	// ������ : 3
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() {
		System.out.println("<<< �̹��� ������ ���� ���α׷� >>>");
		while(true) {
			System.out.println();
			System.out.print("����(�Է�:1, ����:2, ������:3) >> ");
			int state = scan.nextInt();
			
			if (state == 1) {
				input();
			}
			else if (state == 2) {
				view();
			}
			else {
				finish();
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
