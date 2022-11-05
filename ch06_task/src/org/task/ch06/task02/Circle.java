package org.task.ch06.task02;


public class Circle {
	int x, y, radius;
	public Circle(int i, int j, int k) {
		this.x = i;
		this.y = j;
		this.radius = k;
	}
	
	@Override
	public String toString() {
		return String.format("Circle(%d,%d)반지름%d", x,y,radius);
	}
	
	@Override
	public boolean equals(Object obj) {
		Circle p = (Circle)obj;
		if(x == p.x && y == p.y)
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}

}

