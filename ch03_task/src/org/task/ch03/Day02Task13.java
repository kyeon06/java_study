package org.task.ch03;

public class Day02Task13 {

	public static void main(String[] args) {
	    for (int i = 1; i <100; i++) {
	        int n = i / 10;
	        int m = i % 10;
	        
	        int count = 0;
	        if (m == 3 || m == 6 || m == 9)
	            count++;
	        if (n == 3 || n == 6 || n == 9)
	            count++;
	        
	        if (count == 1)
	            System.out.printf("%d ¹Ú¼öÂ¦\n", i);
	        else if (count == 2)
	            System.out.printf("%d ¹Ú¼öÂ¦Â¦\n", i);
	    }
	}

}
