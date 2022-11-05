package org.task.ch05.challenge;

public class Bear extends GameObject implements GameResource {

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	
	// ������� Ű�� ���� ����(a), �Ʒ�(s), ��(d), ������(f) ��ĭ�� �����δ�.

	@Override
	protected void move() {
		System.out.print("����(a), �Ʒ�(s), ��(d), ������(f) >> ");
		String direction = scan.next();
		
		
		switch(direction) {
		case "a" : y = (y > 0)? y - distance : y ; break;
		case "s" : x = (x < R-1)? x + distance : x ; break;
		case "d" : x = (x>0)? x-distance:x ; break;
		case "f" : y = (y < C-1)? y + distance : y ; break;
		}
	}

	@Override
	protected char getShape() {
		return 'B';
	}
}
