package org.task.ch03;

import java.util.Random;
import java.util.Scanner;

public class Day02Task08 {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
	public static void main(String[] args) {
	    
	    System.out.print("���� �? ");
	    int num = scan.nextInt();
	    
	    int [] arr = new int[num];
	    
	    for (int i=0 ; i < num; i++) {
	    
	        arr[i] = rand.nextInt(100)+1;
	        
	        // ������ ���ڰ� �迭�ȿ� �����Ѵٸ� i�� �ٿ��� �ٽ� �̴´�.
	        for (int j=0; j<i ; j++) {
	            if (arr[i]==arr[j]) {
	                i--;
	            }
	        }
	        
	    }
	    // �迭 ���
	    for (int k=0; k<arr.length;k++) {
	        if ((k!=0)&&(k%10==0)) {
	            System.out.println();
	        }
	        System.out.print(arr[k] + " ");
	        
	    }
	}

}
