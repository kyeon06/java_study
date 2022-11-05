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
		System.out.println("::::: ÄôÄôµû¸® ÄôÄôµû ³¡¸»ÀÕ±â °ÔÀÓ :::::");
	}
	public String startWord() {
		// ½ÃÀÛ ´Ü¾î ¼³Á¤
		// ¹æ¹ı1 : ÀÔ·Â¹Ş±â
//		System.out.println("½ÃÀÛ ´Ü¾î¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä >> ");
//		word = scan.next();
		
		// ¹æ¹ı2 : ¸®½ºÆ®¿¡¼­ ·£´ıÀ¸·Î ÇÏ³ª »Ì±â
		String[] wordList = {"¾Æ¹öÁö", "ÀÚÀü°Å", "ÄÚ·Î³ª", "µ¶»ê¿ª", "¹Ì¿ª±¹", "°­ÀÇ½Ç"};
		int index = rand.nextInt(wordList.length);
		word = wordList[index];
		
		return word;
	}
	
	public void run() {
		System.out.print("Âü°¡ÀÚ ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä. >> ");
		size = scan.nextInt();
		pArr = new Player[size]; //Âü°¡ÀÚ ¼ö ¸¸Å­ ¹è¿­ »ı¼º
		
		// Âü°¡ÀÚ ÀÌ¸§À¸·Î °´Ã¼ »ı¼º
		for(int i = 0; i<size; i ++) {
			System.out.printf("Player %d >> ", i);
			String userName = scan.next();
			pArr[i] = new Player(userName);
		}
		System.out.println();
		
		// °ÔÀÓ ½ÃÀÛ!!!!!
		System.out.println(">>> °ÔÀÓ ½ÃÀÛ <<<");
		System.out.println("½ÃÀÛ´Ü¾î´Â " + startWord() + "ÀÔ´Ï´Ù");
		
		boolean state = true;
		while(state) {
			for (int j = 0; j<size;j++) {
				// ÀÔ·Â ´Ü¾î¸¦ ¹Ş´Â´Ù.
				String myWord = pArr[j].getWordFromUser();
				// ³¡¸»ÀÌ ÀÌ¾îÁö´ÂÁö È®ÀÎ
				state = pArr[j].checkSuccess(myWord);
				
				if(state == false) {
					System.out.println(pArr[j].getUserName() + "´ÔÀÌ Á³½À´Ï´Ù....¤Ì¤Ì");
					break;
				}
			}
		}
		
		// °ÔÀÓ ´Ù½Ã ½ÃÀÛ ¿©ºÎ
		System.out.print("°ÔÀÓÀ» ´Ù½Ã ½ÃÀÛÇÏ½Ã°Ú½À´Ï±î? (y/n) >>");
		String yn = scan.next();
		
		if(yn.equals("y")) {
			System.out.println();
			System.out.println(">>> °ÔÀÓÀ» ´Ù½Ã ½ÃÀÛÇÕ´Ï´Ù <<<");
			this.run();
		}
		else {
			System.out.println("~~~ °ÔÀÓ ³¡ ~~~");
			return;
		}
	}
}

class Player {
	
	private String userName;
	private String myWord; // ÀÔ·Â ´Ü¾î
	
	
	public Player(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public String getWordFromUser() {
		System.out.printf("%s >>", userName);
		myWord = WordGameApp.scan.next();
		
		// 3±ÛÀÚ ´Ü¾î¸¸ ¹Ş±â, Æ¯¼ö¹®ÀÚ ÀÖ´Â °æ¿ì ´Ù½Ã ÀÔ·Â
		while(!(myWord.matches("^[°¡-ÆR]*$")) || (myWord.length() !=3)) {
			
			if (myWord.length() != 3) {
				System.out.println("3±ÛÀÚ ´Ü¾î·Î ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
			} else {
				System.out.println("ÇÑ±ÛÀÌ ¾Æ´Ñ ´Ù¸¥ ¹®ÀÚ°¡ Æ÷ÇÔµÇ¾î ÀÖ½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");				
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
		// °ÔÀÓÀ» ½ÃÀÛÇÏÁö....
		new WordGameApp().run();
	}
}

