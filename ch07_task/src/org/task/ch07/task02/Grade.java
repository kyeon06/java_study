package org.task.ch07.task02;

import java.util.ArrayList;
import java.util.Scanner;

public class Grade {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("6개의 학점을 빈 칸을 분리 입력(A/B/C/D/F)>>>");
		
		ArrayList<Character> arr = new ArrayList<Character>();
		
		for(int i = 0 ; i < 6 ; i++) {
			char grade = scan.next().charAt(0);
			arr.add(grade);
		}
		
		double sum = 0;
		for(char g : arr) {
			switch(g) {
			case 'A': sum+=4.0;break;
			case 'B': sum+=3.0;break;
			case 'C': sum+=2.0;break;
			case 'D': sum+=1.0;break;
			}
		}
		
		System.out.println(sum / 6);
		
		
		
		}
}
