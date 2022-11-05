package org.task.ch03;

import java.util.Scanner;

public class PrintGugudan {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	    int start = 2;
	    int end = 9;
//

		while(true) {
		    System.out.print("구구단 시작단을 입력하세요 >> ");
	        start = scan.nextInt();
	        System.out.print("구구단 종료단을 입력하세요 >> ");
	        end = scan.nextInt();
	        if ((start < 2) || (start>9) || (end<2) || (end>9)) {
	            System.out.println("2~9 사이의 숫자로 다시 입력하세요!!");
	        } else break;
		}
		
//		start가 클 경우 스위치
		if (start > end) {
		    int tmp = start;
		    start = end;
		    end = tmp;
		}
		
		for (int i = start; i <= end ; i+=3) {
		    
		    // 단 출력
		    for(int j = i; j < i+3 ; j++) {
		        if(j <= end) {
		            System.out.printf("===%d단===\t", j);
		        }  
		    }System.out.println();
		    
		    
		    // 구구단 출력
		    for (int k = 1; k < 10 ; k++) {
		        for(int m = i; m < i+3 ; m++) {
		            if(m <= end) {
		                System.out.printf("%d * %d = %d\t", m,k,m*k);
		            }
		        }System.out.println();  
            }  
		 
		    
		}
	}
}
