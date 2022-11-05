package org.task.ch04;

import java.util.Scanner;

class Circle{
	private double x, y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public void show() {
		System.out.printf("(%.1f, %.1f)%d\n", x, y, radius);
	}
}
public class CircleManager {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle c [] = new Circle[3];
		
		for (int i = 0; i < c.length ; i++) {
			System.out.print("x, y, radius >> ");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		
		for (int i = 0; i<c.length;i++) c[i].show();
		scan.close();
	}

}
