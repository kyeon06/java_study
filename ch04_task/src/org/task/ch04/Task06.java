package org.task.ch04;

import java.util.Scanner;

public class Task06 {
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
		
		double area_max = 0;
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			if (area_max < c[i].area()) {
				area_max = c[i].area();
				index = i;
			}
		}
		
		System.out.print("가장 면적이 큰 원은 ");
		c[index].show();
		
		scan.close();
	}

}
