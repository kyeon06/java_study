package org.task.ch05;

class PositivePoint extends Point {
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int x, int y) {

		// 내 코드
		super(x,y);
		this.move(x, y);
	}
	
	protected void move(int x, int y) {

		
		// 내 코드
		if ( x < 0 && y < 0) {
			super.move(0, 0);
		} else if (x < 0 || y < 0) {
			return;
		} else super.move(x, y);
	}
	
	@Override
	public String toString() {
//		return "(" + getX() + "," + getY() +")" + "의 점";
		return String.format("(%d, %d)", getX(), getY());
	}
	
}

public class Ch05Task08 {
	public static void main(String[] args) {
		PositivePoint pp = new PositivePoint();
		pp.move(10, 10);
		System.out.println(pp.toString() + "입니다.");
		
		pp.move(5,-5); //객체 pp는 음수 공간으로 이동되지 않음.
		System.out.println(pp.toString() + "입니다.");
		
		PositivePoint pp2 = new PositivePoint(-10, -10);
		System.out.println(pp2.toString() + "입니다.");
	}

}
