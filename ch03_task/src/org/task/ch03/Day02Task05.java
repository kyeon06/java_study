package org.task.ch03;

import java.util.Scanner;

public class Day02Task05 {
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[10];
	    System.out.print("���� ���� 10���� �Է��Ͻÿ�>>>");
	    for (int i = 0; i < 10; i++) {
	        arr[i] = scan.nextInt();
	    }
	    System.out.print("3�� ����� ");
	    for (int i=0; i<10 ; i++) {
	        
	        if (arr[i] % 3 == 0) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}

}
