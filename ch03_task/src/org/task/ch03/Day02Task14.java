package org.task.ch03;

import java.util.Scanner;

public class Day02Task14 {
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	    String course[] = {"Java", "C++", "HTMLS", "��ǻ�ͱ���","�ȵ���̵�"};
	    int score [] = {95,88,76,62,55};
	    
	    while(true) {
	        // �Է°� �ޱ�
	        System.out.print("���� �̸� >> ");
	        String sub = scan.next();
	        // �׸��̸� ���α׷� ����
	        if (sub.equals("�׸�"))
	            System.exit(0);
	       
	        // �����̸��� course �� �����ִٸ� �ش� ���� ����
	        int n = 0;
	        for (int i = 0; i<course.length;i++) {
	            if (course[i].equals(sub))
	                n = score[i];
	        }
	        
	        // ������ 0�̸� ���� ���� �ƴ� ��� ���
	        if (n==0)
	            System.out.println("���� �����Դϴ�.");
	        else
	            System.out.printf("%s�� ������ %d\n", sub, n);
	     
	    }

	}
}
