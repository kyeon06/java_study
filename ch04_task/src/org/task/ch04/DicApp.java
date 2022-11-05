package org.task.ch04;

import java.util.Scanner;

class Dictionary{
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		
		int index = -1;
		for (int i = 0; i < kor.length ; i ++) {
			if (word.equals(kor[i])) {
				index = i;
			}
		}

		if (index == -1) return word + "라는 단어는 저의 사전에 없습니다.";
		else return word + " ==> " + eng[index];
		
	}
}
public class DicApp {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		while(true) {
			
			System.out.print("한글 단어? ");
			String word = scan.next();
			
			if (word.equals("그만")) {
				break;
			}
			else {
			String transWord = Dictionary.kor2Eng(word);
			System.out.println(transWord);
			}
			
		}
		
	}
}
