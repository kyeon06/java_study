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
		return String.format("Circle(%d,%d)������%d", x,y,radius);
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
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		
		if(a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("���� �ٸ� ��");
	}

}

