package org.task.ch04;

import java.util.Scanner;

class Dictionary{
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		
		int index = -1;
		for (int i = 0; i < kor.length ; i ++) {
			if (word.equals(kor[i])) {
				index = i;
			}
		}

		if (index == -1) return word + "��� �ܾ�� ���� ������ �����ϴ�.";
		else return word + " ==> " + eng[index];
		
	}
}
public class DicApp {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		while(true) {
			
			System.out.print("�ѱ� �ܾ�? ");
			String word = scan.next();
			
			if (word.equals("�׸�")) {
				break;
			}
			else {
			String transWord = Dictionary.kor2Eng(word);
			System.out.println(transWord);
			}
			
		}
		
	}
}
