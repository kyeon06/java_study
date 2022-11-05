package org.task.ch03;

import java.util.Scanner;

public class Day02Task05 {
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[10];
	    System.out.print("양의 정수 10개를 입력하시오>>>");
	    for (int i = 0; i < 10; i++) {
	        arr[i] = scan.nextInt();
	    }
	    System.out.print("3의 배수는 ");
	    for (int i=0; i<10 ; i++) {
	        
	        if (arr[i] % 3 == 0) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}

}
