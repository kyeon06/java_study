package org.task.ch03;

import java.util.Random;
import java.util.Scanner;

public class Day02Task08 {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
	public static void main(String[] args) {
	    
	    System.out.print("정수 몇개? ");
	    int num = scan.nextInt();
	    
	    int [] arr = new int[num];
	    
	    for (int i=0 ; i < num; i++) {
	    
	        arr[i] = rand.nextInt(100)+1;
	        
	        // 랜덤한 숫자가 배열안에 존재한다면 i를 줄여서 다시 뽑는다.
	        for (int j=0; j<i ; j++) {
	            if (arr[i]==arr[j]) {
	                i--;
	            }
	        }
	        
	    }
	    // 배열 출력
	    for (int k=0; k<arr.length;k++) {
	        if ((k!=0)&&(k%10==0)) {
	            System.out.println();
	        }
	        System.out.print(arr[k] + " ");
	        
	    }
	}

}
