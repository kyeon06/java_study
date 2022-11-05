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
			System.out.println("0���� ���� �� �����ϴ�.");
			return 0;
		}
	}
}

public class Ch05Task11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		String operator = scan.next();
		
		Calc calc = null;
		
		switch(operator) {
		case "+" : calc = new Add(); break;
		case "-" : calc = new Sub(); break;
		case "*" : calc = new Mul(); break;
		case "/" : calc = new Div(); break;
		default : System.out.println("�����ڸ� �ٽ� �Է����ּ���."); break;
		}
		
		calc.setValue(x, y);
		int result = calc.calculate();
		System.out.println(result);
		
		scan.close();
	}

}
