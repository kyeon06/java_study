package org.task.ch05.challenge;

public class Fish extends GameObject implements GameResource {

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		int d = rand.nextInt(4) + 1;
		
		switch(d) {
		case 1 : y = (y > 0)? y - distance : y ; break; // 왼쪽
		case 2 : x = (x < R-1)? x + distance : x ; break ; // 아래
		case 3 : x = (x>0)? x-distance : x ; break; // 위
		case 4 : y = (y < C-1)? y + distance:y ; break; // 오른쪽
		}
	}

	@Override
	protected char getShape() {
		return '@';
	}
	// 다섯번 중 3번은 제자리, 나머지 두번은 4가지 방향 중 랜덤하게 한칸씩 이동
	
}
