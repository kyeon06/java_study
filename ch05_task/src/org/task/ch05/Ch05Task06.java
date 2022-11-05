package org.task.ch05;

class ColorPoint2 extends Point {
	
	private String color;
	
	public ColorPoint2() {
		super(0,0);
		this.color = "BLACK";
	}
	
	public ColorPoint2(int x, int y) {
		super(x,y);
//		this.color = "BLACK";
	}
	
	public void setXY(int x, int y) {
		super.move(x,y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "���� " + "("+ getX() + "," + getY() + ")�� ��";
	}
}

public class Ch05Task06 {

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2(); // 0,0 ��ġ�� Black�� ��
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoint2 cp2 = new ColorPoint2(10, 10); // 10,10 ��ġ�� Black�� ��
		cp2.setXY(5,5);
		cp2.setColor("RED");
		System.out.println(cp2.toString() + "�Դϴ�.");
	}

}
