package org.task.ch05;

class TV {
	private int size;
	public TV (int size) { this.size = size;} // 생성자
	protected int getSize() { return size; } // get 메소드
}

class ColorTV extends TV {
//	protected int color;
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;		
	}
	protected int getColor() { return color;}
	public void printProperty() {
		System.out.println( super.getSize() + "인치 " + color + "컬러");
	}
}

public class Ch05Task01 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty(); // 32인치 1024컬러
	}

}
