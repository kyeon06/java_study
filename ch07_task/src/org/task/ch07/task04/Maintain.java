package org.task.ch07.task04;

import java.util.Scanner;
import java.util.Vector;

public class Maintain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Vector<Integer> rainfall = new Vector<Integer>();
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			Integer rain  = scan.nextInt();
			if ( rain == 0 ) break;
			rainfall.add(rain);
			
			int sum = 0;
			for (Integer r : rainfall) {
				System.out.print(r + " ");
				sum += r;
			}
			System.out.println();
			System.out.println("���� ��� " + (sum / rainfall.size()));
		}
	}
}
