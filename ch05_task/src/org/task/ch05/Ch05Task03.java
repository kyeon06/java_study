package org.task.ch05;

import java.util.Scanner;

// 추상 클래스
abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio; // 비율
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString() + "을" + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요 >> ");
		
		double val = scan.nextDouble();
		double res = convert(val);
		
		System.out.println("변환 결과 : " + res + getDestString() + "입니다.");
		scan.close();
	}
}

class Won2Dollar extends Converter {
	
	public Won2Dollar(double dollar) {
		ratio = dollar;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}
	
}


public class Ch05Task03 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러 1200원
		toDollar.run();
	}

}
