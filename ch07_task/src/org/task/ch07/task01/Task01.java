package org.task.ch07.task01;

import java.util.Scanner;
import java.util.Vector;

public class Task01 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("����(-1�� �Էµ� ������)>> ");
		
		Vector<Integer> v = new Vector<Integer>();
		
		while(true) {
			int num = scan.nextInt();
			if(num==-1) break;
			v.add(num);
		}
		
		int max = 0;
		for(int i = 0; i < v.size();i++) {
			if(max < v.get(i)) {
				max = v.get(i);
			}
		}
		
		System.out.println("���� ū ���� " + max);
	}

}
