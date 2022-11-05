package org.task.ch06.task10;

import java.util.Scanner;

class Person {
	String name;
	public Person(String name) {
		this.name = name;
	}
}

public class Gambling {
	static final int SIZE = 2;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Person[] p = new Person[SIZE];
		String name = "";
		for(int i = 0; i < SIZE ; i++) {
			System.out.print(String.format("%d번째 선수 이름 >> ", i+1));
			name = scan.next();
			p[i] = new Person(name);
		}
		scan.nextLine();
		
		
		while(true) {
			for (int i = 0; i < p.length; i++) {
				
				System.out.printf("[%s]:<Enter>", p[i].name);
				scan.nextLine();
				
				int[] num = new int[3];
				for(int j = 0; j < 3; j++) {
					num[j] = (int)(Math.random()*3) + 1;				
				}
				
				System.out.printf("===> %d %d %d ", num[0], num[1], num[2]);
				
				if(num[0] == num[1] && num[1] == num[2]) {
					System.out.println(p[i].name + "님이 이겼습니다!");
					return;
				} else { System.out.println("아쉽군요!");}
				
			}
			
			
		}
	}

}
