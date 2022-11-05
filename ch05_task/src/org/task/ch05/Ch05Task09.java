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
	public int length() { // 저장된 개수
		cnt = 0;
		for (int i = 0; i < wordStack.length ; i++) {
			if ( wordStack[i] != null ) {
				cnt++;
			}
		}
		return cnt;
	}

	@Override
	public int capacity() { // 남은 용량
		return wordStack.length - cnt;
	}

	@Override
	public String pop() { // 꺼내서 출력
		for (int i = cnt-1 ; i >= 0; i--) {
			System.out.print(wordStack[i] + " ");
		}
		return null;
	}

	@Override
	public boolean push(String val) { // 스택에 저장

		if(length() == wordStack.length) {
			System.out.println("스택이 꽉 차서 푸시 불가");
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
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = scan.nextInt();
		
		StringStack stack = new StringStack(size);
		
		
		String word = "";
		while(true) {
			System.out.print("문자열 입력 >> ");
			word = scan.next();
			
			if (word.equals("그만")) {
				break;
			}
			
			stack.push(word);
			
//			System.out.printf("저장된 개수 >> %d", stack.length());
//			System.out.println();
//			System.out.printf("저장 가능한 개수 >> %d", stack.capacity());			
//			
//			System.out.println();
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		stack.pop();
		
		scan.close();

	}
}
