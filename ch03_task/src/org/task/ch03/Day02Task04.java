package org.task.ch03;

import java.util.Scanner;

public class Day02Task04 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String s = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
		s = scan.next();
		
		for (int i = alphabet.indexOf(s)+1 ; i >= 0; i--) {
		    System.out.println(alphabet.substring(0,i));
		}
	}
}
