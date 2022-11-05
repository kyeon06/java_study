package org.task.ch03;


public class Average {
    
	public static void main(String[] args) {
	    
	    int sum = 0;
	    for (String num : args) {
	        int i = Integer.parseInt(num);
	        sum += i;
	    }
	    System.out.println(sum / args.length);
	    
	}

}
