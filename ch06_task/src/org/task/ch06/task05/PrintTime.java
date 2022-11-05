package org.task.ch06.task05;

import java.util.Calendar;

public class PrintTime {
	
	public static void main(String[] args) {
		// 현재 날짜와 시간 정보를 가지고 생성
		// Calendar는 추상 클래스이므로 new Calendar() 불가능
		Calendar now = Calendar.getInstance();
		int h = now.get(Calendar.HOUR_OF_DAY);
		int m = now.get(Calendar.MINUTE);
		
		System.out.println(String.format("현재 시간은 %d시 %d분입니다.", h,m));
		
		if( h >= 4 && h <= 12) {
			System.out.println("Good Morning");
		}else if (h <= 18) {
			System.out.println("Good Afternoon");
		}else if (h <= 22) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}
		
		
	}

}
