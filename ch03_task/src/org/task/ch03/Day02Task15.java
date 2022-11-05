package org.task.ch03;

import java.util.Scanner;

public class Day02Task15 {
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	    while(true) {
	        System.out.print("곱하고자 하는 두 수 입력 >> ");

	        try {
	            int n = scan.nextInt();
	            int m = scan.nextInt();
	            System.out.print(n + "x" + m + "=" + n*m);
	            break;
	            
	        } catch(Exception e) {
	            System.out.println("실수는 입력하면 안됩니다.");
	            scan.nextLine();
	        }
	    }
	    
	}

}
