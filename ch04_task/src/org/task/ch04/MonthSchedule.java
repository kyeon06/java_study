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
		if (work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}


public class MonthSchedule {
	private Day[] workArr;
	private int total_day;
	public static final Scanner scan = new Scanner(System.in);
	
	public MonthSchedule(int days) {
		this.total_day = days;
		
		// Day 객체 배열 생성
		workArr = new Day[days];
		for (int i = 0; i < days ; i++) {
			workArr[i] = new Day();
		}
	}
	
	// 입력 : 1
	public void input() {
		System.out.printf("날짜(1~%d) ? ", total_day);
		int day = scan.nextInt();
		
		System.out.print("할일(빈칸없이입력) ? ");
		String work = scan.next();
		
		workArr[day-1].set(work);

	}
	// 보기 : 2
	public void view() {
		System.out.printf("날짜(1~%d) ? ", total_day);
		int day = scan.nextInt();
		
		System.out.print(day+"일의 할 일은 ");
		workArr[day-1].show();
	}
	
	// 끝내기 : 3
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.println("<<< 이번달 스케쥴 관리 프로그램 >>>");
		while(true) {
			System.out.println();
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
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
