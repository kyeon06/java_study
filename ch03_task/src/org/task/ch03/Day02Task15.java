package org.task.ch03;

import java.util.Scanner;

public class Day02Task15 {
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	    while(true) {
	        System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");

	        try {
	            int n = scan.nextInt();
	            int m = scan.nextInt();
	            System.out.print(n + "x" + m + "=" + n*m);
	            break;
	            
	        } catch(Exception e) {
	            System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
	            scan.nextLine();
	        }
	    }
	    
	}

}
