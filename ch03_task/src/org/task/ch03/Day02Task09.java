package org.task.ch03;

import java.util.Random;

public class Day02Task09 {
    static Random rand = new Random();
	public static void main(String[] args) {
	        int[][] arr = new int[4][4];
	        
	        for (int i = 0 ; i<4; i++) {
	            for(int j=0; j<4; j++) {
	                arr[i][j] = rand.nextInt(10)+1;
	                System.out.printf("%d\t", arr[i][j]);
	            }
	            System.out.println();
	        }
	        
	}

}
