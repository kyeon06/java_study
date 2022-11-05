package org.task.ch05;

import java.util.Scanner;

interface Stack {
	int length(); 
	int capacity(); 
	String pop();
	boolean push(String val); 
}

class StringStack implements Stack {
	private String[] wordStack;
	int cnt;
	int top = 0;
	
	public StringStack(int size) {
		wordStack = new String[size];
	}

	@Override
	public int length() { // ����� ����
		cnt = 0;
		for (int i = 0; i < wordStack.length ; i++) {
			if ( wordStack[i] != null ) {
				cnt++;
			}
		}
		return cnt;
	}

	@Override
	public int capacity() { // ���� �뷮
		return wordStack.length - cnt;
	}

	@Override
	public String pop() { // ������ ���
		for (int i = cnt-1 ; i >= 0; i--) {
			System.out.print(wordStack[i] + " ");
		}
		return null;
	}

	@Override
	public boolean push(String val) { // ���ÿ� ����

		if(length() == wordStack.length) {
			System.out.println("������ �� ���� Ǫ�� �Ұ�");
			return false;
		}
		else {
			wordStack[length()] = val;
			return true;
		}
		
	}
	
}

public class Ch05Task09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int size = scan.nextInt();
		
		StringStack stack = new StringStack(size);
		
		
		String word = "";
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			word = scan.next();
			
			if (word.equals("�׸�")) {
				break;
			}
			
			stack.push(word);
			
//			System.out.printf("����� ���� >> %d", stack.length());
//			System.out.println();
//			System.out.printf("���� ������ ���� >> %d", stack.capacity());			
//			
//			System.out.println();
		}
		
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		stack.pop();
		
		scan.close();

	}
}
