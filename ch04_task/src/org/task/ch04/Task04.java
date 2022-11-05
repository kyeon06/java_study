package org.task.ch04;

class Rectangle{
	public int x;
	public int y;
	public int width;
	public int height;
	
	public Rectangle() {	}
	
	public Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width * height;
	}
	
	public boolean contains(Rectangle r) {
		if ((x < r.x) && (y < r.y)) {
			if ( ((x+width) > (r.x + r.width)) && ((y+height) > (r.y+r.height))) {
				return true;
			}
		} return false;
	}
	
	public void show() {
		System.out.printf("(%d,%d)���� ũ�Ⱑ %dx%d�� �簢��\n", x, y, width, height);
	}
}


public class Task04 {
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
		
	}

}
