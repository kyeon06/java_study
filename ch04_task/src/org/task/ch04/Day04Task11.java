package org.task.ch04;

import java.util.Scanner;

class Add {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a+b;
	}
}

class Sub {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a-b;
	}
}

class Mul {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a*b;
	}
}

class Div {
	int a;
	int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a/b;
	}
}

public class Day04Task11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String operator = scan.next();

		
		if (operator.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		}
		else if (operator.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		}
		
		else if (operator.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		}
		else if (operator.equals("/")) {
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
		}
		
		scan.close();
		
		
	}
}
