package org.task.ch02;

import java.util.Scanner;

public class Day01RspGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		// �Է°� �ޱ�
		System.out.print("ö�� >> ");
		String rsp_cs = scanner.next();
		System.out.print("���� >> ");
		String rsp_yh = scanner.next();
		
		// ��� ���
		if(rsp_cs.equals(rsp_yh)) {
			System.out.println("�����ϴ�.");
		}
		
		// ���ڰ� �ִ� ���
		else{
			// ö���� ������ �� ���
			if(rsp_cs.equals("����")){
				if(rsp_yh.equals("��")) {
					System.out.println("ö���� �̰���ϴ�.");
				}
				else {
					System.out.println("���� �̰���ϴ�.");
				}
			}
			// ö���� ������ �� ���
			else if(rsp_cs.equals("����")) {
				if(rsp_yh.equals("����")) {
					System.out.println("ö���� �̰���ϴ�.");
				}
				else {
					System.out.println("���� �̰���ϴ�.");
				}
			}
			// ö���� ���� �� ���
			else {
				if(rsp_yh.equals("����")) {
					System.out.println("ö���� �̰���ϴ�.");
				}
				else {
					System.out.println("���� �̰���ϴ�.");
				}
			}
		}
		// scanner �ݱ�
		scanner.close();
	}

}
