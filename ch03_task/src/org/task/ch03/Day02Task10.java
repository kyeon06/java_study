package org.task.ch03;

import java.util.Random;

public class Day02Task10 {
    static Random rand = new Random();

	public static void main(String[] args) {
	    int[][] arr = new int[4][4];
	    
	    for (int i=0; i<10 ; i++) {
	        
	        while(true) {
	            int x = rand.nextInt(4);
	            int y = rand.nextInt(4);
	            if (arr[x][y]==0) {
	                arr[x][y] = rand.nextInt(10)+1;
	                break;
	            }
	        }
	       
	    }
	    
	    for(int j = 0;j<4;j++) {
	        for(int k=0; k<4; k++) {
	            System.out.print(arr[j][k]+"\t");
	        }
	        System.out.println();
	    }
	}

}
