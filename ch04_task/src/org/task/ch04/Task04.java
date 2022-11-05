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
		System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형\n", x, y, width, height);
	}
}


public class Task04 {
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
		
	}

}
