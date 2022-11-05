package org.task.ch03;

import java.util.Random;

public class Day02Task07 {
    
    static Random rand = new Random();
    
	public static void main(String[] args) {
	    
	    int [] arr = new int[10];
	    
	    System.out.print("·£´ıÇÑ Á¤¼öµé : ");
	    float sum = 0;
	    for (int i = 0; i < 10; i++) {
//	        arr[i] = (int)(Math.random()*10 + 1);
	        arr[i] = rand.nextInt(10) + 1;
	        System.out.print(arr[i] + " ");
	        sum += arr[i];
	    }
	    System.out.println();
	    System.out.printf("Æò±ÕÀº %.1f", sum/arr.length);
	    
	    
	}
}
