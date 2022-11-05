package org.task.ch05.challenge;


import java.util.Random;
import java.util.Scanner;

public interface GameResource {
	final String TITLE = "** Bear의 Fish 먹기 게임을 시작합니다. **";
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	final int R = 10;
	final int C = 20;
	final char[][] gameboard = new char[R][C];
	Bear bear = new Bear(0,0,1);
	
	int fishX = rand.nextInt(R);
	int fishY = rand.nextInt(C);
	Fish fish = new Fish(fishX,fishY,1);
}
