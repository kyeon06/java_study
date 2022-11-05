package org.task.ch05;

class PositivePoint extends Point {
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int x, int y) {

		// �� �ڵ�
		super(x,y);
		this.move(x, y);
	}
	
	protected void move(int x, int y) {

		
		// �� �ڵ�
		if ( x < 0 && y < 0) {
			super.move(0, 0);
		} else if (x < 0 || y < 0) {
			return;
		} else super.move(x, y);
	}
	
	@Override
	public String toString() {
//		return "(" + getX() + "," + getY() +")" + "�� ��";
		return String.format("(%d, %d)", getX(), getY());
	}
	
}

public class Ch05Task08 {
	public static void main(String[] args) {
		PositivePoint pp = new PositivePoint();
		pp.move(10, 10);
		System.out.println(pp.toString() + "�Դϴ�.");
		
		pp.move(5,-5); //��ü pp�� ���� �������� �̵����� ����.
		System.out.println(pp.toString() + "�Դϴ�.");
		
		PositivePoint pp2 = new PositivePoint(-10, -10);
		System.out.println(pp2.toString() + "�Դϴ�.");
	}

}
