package org.task.ch06.challenge;

import java.util.Scanner;

public class TextHist extends Object{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("���� �ؽ�Ʈ�� �Է��ϰ� �����ݷ��� �Է��ϼ���.");
		StringBuffer sb = new StringBuffer();
		
	        
        // ���ĺ� �迭 �����
		char[] alpha = new char[26];
        for(int i=0;i<alpha.length;i++){    
        	alpha[i] = (char)(65+i);
        }
		
		// ���� �Է� �� �����ݷ� ������ while�� ������.
		String text = "";
		while(true) {
			text = scan.nextLine();
			if( text.equals(";")) break;
			// buffer�� ���� �߰�
			sb.append(text.toUpperCase());
		}
		
		// ������׷� �׸���
		System.out.println("������׷��� �׸��ϴ�.");
		for( int i = 0 ; i < alpha.length ; i++) {
			System.out.print(alpha[i]);
			for( int j = 0; j < sb.length() ; j++) {
				if(alpha[i] == sb.charAt(j)) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}


