package org.task.ch03;

import java.util.Scanner;

public class Day02Task06 {
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		
		System.out.print("금액을 입력하시오 >> ");
		int money = scan.nextInt();
		
		for (int i = 0 ; i < unit.length ; i++) {
		    // 개수가 0개면 출력하지 않는다.
		    if ((money / unit[i])!=0) {		        
		        System.out.printf("%d원 짜리 : %d개\n", unit[i], money / unit[i]);
		    }
		    money %= unit[i];
		}
	}

}
