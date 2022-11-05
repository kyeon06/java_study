package org.task.ch06.task01;

public class MyPoint {
	
	int x, y;
	public MyPoint(int i, int j) {
		this.x =i;
		this.y= j;
	}
	
	@Override
	public String toString() {
		return String.format("Point(%d,%d)", x, y);
	}
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		
		System.out.println(p);
		
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}

}
