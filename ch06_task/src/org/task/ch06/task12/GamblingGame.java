package org.task.ch06.task12;

import java.util.Scanner;

class Person {
	String name;
	public Person(String name) {
		this.name = name;
	}
}

public class GamblingGame {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("���� ���ӿ� ������ ���� ���� >> ");
		int size = scan.nextInt();
		Person[] p = new Person[size];
		
		String name = "";
		for(int i = 0; i < size ; i++) {
			System.out.print(String.format("%d��° ���� �̸� >> ", i+1));
			name = scan.next();
			p[i] = new Person(name);
		}
		
		scan.nextLine();
		
		
		while(true) {
			for (int i = 0; i < size; i++) {
				
				System.out.printf("[%s]:<Enter>", p[i].name);
				scan.nextLine();
				
				int[] num = new int[3];
				for(int j = 0; j < 3; j++) {
					num[j] = (int)(Math.random()*3) + 1;				
				}
				
				System.out.printf("===> %d %d %d ", num[0], num[1], num[2]);
				
				if(num[0] == num[1] && num[1] == num[2]) {
					System.out.println(p[i].name + "���� �̰���ϴ�!");
					return;
				} else { System.out.println("�ƽ�����!");}
				
			}
			
			
		}
	}

}
