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
		System.out.println("::::: �������� ������ �����ձ� ���� :::::");
	}
	public String startWord() {
		// ���� �ܾ� ����
		// ���1 : �Է¹ޱ�
//		System.out.println("���� �ܾ �Է����ּ��� >> ");
//		word = scan.next();
		
		// ���2 : ����Ʈ���� �������� �ϳ� �̱�
		String[] wordList = {"�ƹ���", "������", "�ڷγ�", "���꿪", "�̿���", "���ǽ�"};
		int index = rand.nextInt(wordList.length);
		word = wordList[index];
		
		return word;
	}
	
	public void run() {
		System.out.print("������ ���� �Է��ϼ���. >> ");
		size = scan.nextInt();
		pArr = new Player[size]; //������ �� ��ŭ �迭 ����
		
		// ������ �̸����� ��ü ����
		for(int i = 0; i<size; i ++) {
			System.out.printf("Player %d >> ", i);
			String userName = scan.next();
			pArr[i] = new Player(userName);
		}
		System.out.println();
		
		// ���� ����!!!!!
		System.out.println(">>> ���� ���� <<<");
		System.out.println("���۴ܾ�� " + startWord() + "�Դϴ�");
		
		boolean state = true;
		while(state) {
			for (int j = 0; j<size;j++) {
				// �Է� �ܾ �޴´�.
				String myWord = pArr[j].getWordFromUser();
				// ������ �̾������� Ȯ��
				state = pArr[j].checkSuccess(myWord);
				
				if(state == false) {
					System.out.println(pArr[j].getUserName() + "���� �����ϴ�....�̤�");
					break;
				}
			}
		}
		
		// ���� �ٽ� ���� ����
		System.out.print("������ �ٽ� �����Ͻðڽ��ϱ�? (y/n) >>");
		String yn = scan.next();
		
		if(yn.equals("y")) {
			System.out.println();
			System.out.println(">>> ������ �ٽ� �����մϴ� <<<");
			this.run();
		}
		else {
			System.out.println("~~~ ���� �� ~~~");
			return;
		}
	}
}

class Player {
	
	private String userName;
	private String myWord; // �Է� �ܾ�
	
	
	public Player(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public String getWordFromUser() {
		System.out.printf("%s >>", userName);
		myWord = WordGameApp.scan.next();
		
		// 3���� �ܾ �ޱ�, Ư������ �ִ� ��� �ٽ� �Է�
		while(!(myWord.matches("^[��-�R]*$")) || (myWord.length() !=3)) {
			
			if (myWord.length() != 3) {
				System.out.println("3���� �ܾ�� �ٽ� �Է����ּ���.");
			} else {
				System.out.println("�ѱ��� �ƴ� �ٸ� ���ڰ� ���ԵǾ� �ֽ��ϴ�. �ٽ� �Է����ּ���.");				
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
		// ������ ��������....
		new WordGameApp().run();
	}
}

