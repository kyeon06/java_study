package org.task.ch05;

interface Shape2 {
	final double PI = 3.14;
	void draw();
	double getArea();
	
	default public void redraw() {
		System.out.print("=== �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle2 implements Shape2{
	
	int radius;
	
	public Circle2(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.printf("�������� %d�� ���Դϴ�.\n", radius);
	}

	@Override
	public double getArea() {
		return PI * Math.pow(radius, 2);
	}
	
}

public class Ch05Task13 {
	public static void main(String[] args) {
		Shape2 donut = new Circle2(10);
		donut.redraw();
		System.out.println("������ " + donut.getArea());
	}
}
