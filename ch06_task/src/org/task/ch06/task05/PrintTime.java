package org.task.ch06.task05;

import java.util.Calendar;

public class PrintTime {
	
	public static void main(String[] args) {
		// ���� ��¥�� �ð� ������ ������ ����
		// Calendar�� �߻� Ŭ�����̹Ƿ� new Calendar() �Ұ���
		Calendar now = Calendar.getInstance();
		int h = now.get(Calendar.HOUR_OF_DAY);
		int m = now.get(Calendar.MINUTE);
		
		System.out.println(String.format("���� �ð��� %d�� %d���Դϴ�.", h,m));
		
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
