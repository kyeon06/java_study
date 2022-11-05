package org.task.ch06.challenge;

import java.util.Scanner;

public class TextHist extends Object{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
		StringBuffer sb = new StringBuffer();
		
	        
        // 알파벳 배열 만들기
		char[] alpha = new char[26];
        for(int i=0;i<alpha.length;i++){    
        	alpha[i] = (char)(65+i);
        }
		
		// 문장 입력 후 세미콜론 만나면 while문 끝낸다.
		String text = "";
		while(true) {
			text = scan.nextLine();
			if( text.equals(";")) break;
			// buffer에 문장 추가
			sb.append(text.toUpperCase());
		}
		
		// 히스토그램 그리기
		System.out.println("히스토그램을 그립니다.");
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


