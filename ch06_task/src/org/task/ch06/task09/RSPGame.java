package org.task.ch06.task09;

import java.util.Scanner;

public class RSPGame {
	static Scanner scan = new Scanner(System.in);
	static String[] rspList = {"����", "����", "��"};
	public static void main(String[] args) {
		
		while(true) {
			System.out.print("ö��[����(1), ����(2), ��(3), ������(4)] >> ");
			int me = scan.nextInt();
			if(me == 4) break;
			int com = (int)(Math.random()*3) + 1;
			
			
			System.out.printf("ö��(%s) : ��ǻ��(%s)\n", rspList[me-1], rspList[com-1]);
			
			if(rspList[me-1].equals(rspList[com-1])) {
				System.out.println("�����ϴ�.");
				
			}
			
			else if(rspList[me-1].equals("����")) {
				if(rspList[com-1].equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}else {
					System.out.println("ö���� �̰���ϴ�.");					
				}
			}
			
			else if(rspList[me-1].equals("����")) {
				if(rspList[com-1].equals("��")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}else {
					System.out.println("ö���� �̰���ϴ�.");					
				}
			}
			
			else if(rspList[me-1].equals("��")) {
				if(rspList[com-1].equals("����")) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}else {
					System.out.println("ö���� �̰���ϴ�.");					
				}
			}
			
		}
	}

}
