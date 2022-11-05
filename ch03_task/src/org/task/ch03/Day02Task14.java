package org.task.ch03;

import java.util.Scanner;

public class Day02Task14 {
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	    String course[] = {"Java", "C++", "HTMLS", "컴퓨터구조","안드로이드"};
	    int score [] = {95,88,76,62,55};
	    
	    while(true) {
	        // 입력값 받기
	        System.out.print("과목 이름 >> ");
	        String sub = scan.next();
	        // 그만이면 프로그램 종료
	        if (sub.equals("그만"))
	            System.exit(0);
	       
	        // 과목이름이 course 에 속해있다면 해당 점수 저장
	        int n = 0;
	        for (int i = 0; i<course.length;i++) {
	            if (course[i].equals(sub))
	                n = score[i];
	        }
	        
	        // 점수가 0이면 없는 과목 아닐 경우 출력
	        if (n==0)
	            System.out.println("없는 과목입니다.");
	        else
	            System.out.printf("%s의 점수는 %d\n", sub, n);
	     
	    }

	}
}
