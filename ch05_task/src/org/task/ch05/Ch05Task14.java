package org.task.ch05;

class Oval implements Shape2 {
	int x, y;
	Oval(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void draw() {
		System.out.printf("%dX%d 사각형에 내접하는 타원입니다.\n", x,y);
	}

	@Override
	public double getArea() {
		return PI * x * y;
	}
	
}

class Rect2 implements Shape2 {
	int x,y;
	
	Rect2 (int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public void draw() {
		System.out.printf("%dX%d 크기의 사각형입니다.\n", x,y);
	}

	@Override
	public double getArea() {
		return x*y;
	}
	
}


public class Ch05Task14 {

	public static void main(String[] args) {
		Shape2 [] list = new Shape2[3];
		list[0] = new Circle2(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect2(10,40);
		
		for (int i = 0; i<list.length; i++) list[i].redraw();
		for (int i = 0; i <list.length ; i++) System.out.println("면적은 " + list[i].getArea());
	}

}
