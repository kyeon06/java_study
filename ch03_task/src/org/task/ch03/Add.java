package org.task.ch03;

public class Add {

	public static void main(String[] args) {
	    int sum = 0;
	    
	    for (String obj : args) {
	        try {
	            sum += Integer.parseInt(obj);	            
	        }
	        catch(Exception e){
	            continue;
	        }
	    }
	    System.out.println(sum);
	}
}
