package org.task.ch03;

import java.util.Scanner;

public class PrintGugudan {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	    int start = 2;
	    int end = 9;
//

		while(true) {
		    System.out.print("������ ���۴��� �Է��ϼ��� >> ");
	        start = scan.nextInt();
	        System.out.print("������ ������� �Է��ϼ��� >> ");
	        end = scan.nextInt();
	        if ((start < 2) || (start>9) || (end<2) || (end>9)) {
	            System.out.println("2~9 ������ ���ڷ� �ٽ� �Է��ϼ���!!");
	        } else break;
		}
		
//		start�� Ŭ ��� ����ġ
		if (start > end) {
		    int tmp = start;
		    start = end;
		    end = tmp;
		}
		
		for (int i = start; i <= end ; i+=3) {
		    
		    // �� ���
		    for(int j = i; j < i+3 ; j++) {
		        if(j <= end) {
		            System.out.printf("===%d��===\t", j);
		        }  
		    }System.out.println();
		    
		    
		    // ������ ���
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
