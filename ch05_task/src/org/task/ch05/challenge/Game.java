package org.task.ch05.challenge;


class Board implements GameResource{
	
	public static void BoardGenerate() {
		for (int i = 0 ; i < R ; i++) {
			for (int j = 0 ; j < C ; j++) {
				gameboard[i][j] = '-';
			}
		}
	}
	
	public static void viewBoard() {
		for (int i = 0 ; i < R ; i++) {
			for (int j = 0 ; j < C ; j++) {
				if (i == bear.getX() && j == bear.getY()) {
					System.out.print(bear.getShape());
				}
				else if(i == fish.getX() && j == fish.getY()) {
					System.out.print(fish.getShape());
				}
				else{
					System.out.print(gameboard[i][j]);
				}
			}
			System.out.println();
		}
	}
}

// ��ü���� ���� ����
public class Game extends Board{
	public static void main(String[] args) {
		System.out.println(TITLE);
		BoardGenerate();
		
		// ��� ������ ����~
		while(true) {
			
			for (int i = 0; i < 5; i++) {
				viewBoard();
				System.out.println("bear ��ġ >> " + bear.getX() + " " + bear.getY());
				System.out.println("fish ��ġ >> " + fish.getX() + " " + fish.getY());
				
				if (bear.collide(fish)) {
					System.out.println("��⸦ ��Ҵ�!!");
					return;
				}
				else {
					bear.move();
					if ( i == 3 || i == 4) {
						fish.move();
					}
				}
			}
		}
	}
}


