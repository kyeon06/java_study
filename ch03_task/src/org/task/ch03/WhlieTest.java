package org.task.ch03;

public class WhlieTest {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		while(i<100) {
			sum = sum + i;
			i += 2;
		}
		
		// ���
		System.out.println("whlie�� ��� : " + sum);
		System.out.println("for�� ��� : " + ForTest.get_sum());
		System.out.println("do while�� ��� : " + DoWhileTest.get_sum());
		
	}
}

class ForTest {
	
	public static int get_sum() {
		
		int sum = 0;
		
		for (int i=0;i<100;i+=2) {
			sum = sum + i;
		}
		
		return sum;
	}
}

class DoWhileTest {
	public static int get_sum() {
		int sum=0, i=0;
		
		do {
			sum = sum + i;
			i += 2;
		} while (i < 100);
		
		return sum;
	}
}