package org.task.ch04;

import java.util.Scanner;


class Grade{
	int math;
	int science;
	int english;
	
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	int average() {
		return (this.math + this.science + this.english) / 3; 
	}
	
}
// �ǽ� 2�� ����
public class Task02 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		// Grade ��ü ����
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		scanner.close();
	}

}
