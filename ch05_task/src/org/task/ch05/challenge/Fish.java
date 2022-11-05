package org.task.ch05.challenge;

public class Fish extends GameObject implements GameResource {

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		int d = rand.nextInt(4) + 1;
		
		switch(d) {
		case 1 : y = (y > 0)? y - distance : y ; break; // ����
		case 2 : x = (x < R-1)? x + distance : x ; break ; // �Ʒ�
		case 3 : x = (x>0)? x-distance : x ; break; // ��
		case 4 : y = (y < C-1)? y + distance:y ; break; // ������
		}
	}

	@Override
	protected char getShape() {
		return '@';
	}
	// �ټ��� �� 3���� ���ڸ�, ������ �ι��� 4���� ���� �� �����ϰ� ��ĭ�� �̵�
	
}
