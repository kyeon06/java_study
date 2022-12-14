package org.task.ch04;

import java.util.Random;
import java.util.Scanner;


class WordGameApp{
	
	private Player[] pArr;
	public static final Scanner scan = new Scanner(System.in);
	public static final Random rand = new Random();
	private int size = 0;
	public static String word;
	
	public WordGameApp() {
		System.out.println("::::: 쿵쿵따리 쿵쿵따 끝말잇기 게임 :::::");
	}
	public String startWord() {
		// 시작 단어 설정
		// 방법1 : 입력받기
//		System.out.println("시작 단어를 입력해주세요 >> ");
//		word = scan.next();
		
		// 방법2 : 리스트에서 랜덤으로 하나 뽑기
		String[] wordList = {"아버지", "자전거", "코로나", "독산역", "미역국", "강의실"};
		int index = rand.nextInt(wordList.length);
		word = wordList[index];
		
		return word;
	}
	
	public void run() {
		System.out.print("참가자 수를 입력하세요. >> ");
		size = scan.nextInt();
		pArr = new Player[size]; //참가자 수 만큼 배열 생성
		
		// 참가자 이름으로 객체 생성
		for(int i = 0; i<size; i ++) {
			System.out.printf("Player %d >> ", i);
			String userName = scan.next();
			pArr[i] = new Player(userName);
		}
		System.out.println();
		
		// 게임 시작!!!!!
		System.out.println(">>> 게임 시작 <<<");
		System.out.println("시작단어는 " + startWord() + "입니다");
		
		boolean state = true;
		while(state) {
			for (int j = 0; j<size;j++) {
				// 입력 단어를 받는다.
				String myWord = pArr[j].getWordFromUser();
				// 끝말이 이어지는지 확인
				state = pArr[j].checkSuccess(myWord);
				
				if(state == false) {
					System.out.println(pArr[j].getUserName() + "님이 졌습니다....ㅜㅜ");
					break;
				}
			}
		}
		
		// 게임 다시 시작 여부
		System.out.print("게임을 다시 시작하시겠습니까? (y/n) >>");
		String yn = scan.next();
		
		if(yn.equals("y")) {
			System.out.println();
			System.out.println(">>> 게임을 다시 시작합니다 <<<");
			this.run();
		}
		else {
			System.out.println("~~~ 게임 끝 ~~~");
			return;
		}
	}
}

class Player {
	
	private String userName;
	private String myWord; // 입력 단어
	
	
	public Player(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public String getWordFromUser() {
		System.out.printf("%s >>", userName);
		myWord = WordGameApp.scan.next();
		
		// 3글자 단어만 받기, 특수문자 있는 경우 다시 입력
		while(!(myWord.matches("^[가-힣]*$")) || (myWord.length() !=3)) {
			
			if (myWord.length() != 3) {
				System.out.println("3글자 단어로 다시 입력해주세요.");
			} else {
				System.out.println("한글이 아닌 다른 문자가 포함되어 있습니다. 다시 입력해주세요.");				
			}
			System.out.printf("%s >>", userName);
			myWord = WordGameApp.scan.next();
			
		}
		return myWord;
	}
	
	public boolean checkSuccess(String myWord) {
		int lastIndex = WordGameApp.word.length()-1;
		char lastChar = WordGameApp.word.charAt(lastIndex);
		char firstChar = myWord.charAt(0);
		
		boolean flag = true;
		if (lastChar == firstChar) {
			WordGameApp.word = myWord;
		} else {
			flag = false;
		}
		return flag;
	}
}


public class OpenChallenge {
	public static void main(String[] args) {
		// 게임을 시작하지....
		new WordGameApp().run();
	}
}

