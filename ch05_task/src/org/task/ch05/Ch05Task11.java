package org.task.ch05;

import java.util.Scanner;

abstract class Calc {
	
	protected int a;
	protected int b;
	
	public void setValue(int x, int y) {
		this.a = x;
		this.b = y;
	}
	
	abstract int calculate();
}

class Add extends Calc {

	@Override
	int calculate() {
		return a + b;
	}
}

class Sub extends Calc {

	@Override
	int calculate() {
		return a - b;
	}
}

class Mul extends Calc {

	@Override
	int calculate() {
		return a * b;
	}
}

class Div extends Calc {

	@Override
	int calculate() {
		try {
			return a/b;
		}
		catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
	}
}

public class Ch05Task11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		String operator = scan.next();
		
		Calc calc = null;
		
		switch(operator) {
		case "+" : calc = new Add(); break;
		case "-" : calc = new Sub(); break;
		case "*" : calc = new Mul(); break;
		case "/" : calc = new Div(); break;
		default : System.out.println("연산자를 다시 입력해주세요."); break;
		}
		
		calc.setValue(x, y);
		int result = calc.calculate();
		System.out.println(result);
		
		scan.close();
	}

}
