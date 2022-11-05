package org.task.ch05;

import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}
	public Shape getNext() {return next;}
	
	abstract void draw();
}

class Line extends Shape{

	@Override
	void draw() {
		System.out.println("Line");
	}
	
}

class Rect extends Shape{
	@Override
	void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Circle");
	}
}

public class GrapicEditor {
	public static Scanner scan = new Scanner(System.in);
	private String[] menuList = {"삽입", "삭제", "모두 보기", "종료"};
	private String[] shapeList = {"Line", "Rect", "Circle"};
	private int num = 0;
	Shape inputShape = null;
	Shape start, end;
	
	public GrapicEditor() {
		System.out.println("<<< 그래픽 에디터 beauty 실행 >>>");
		
		while(true) {
			switch(menu(menuList)) {
			case 1: input(inputShape); break;
			case 2: delete(); break;
			case 3: allView(); break;
			case 4: System.out.println("beauty를 종료합니다."); break;
			default : System.out.println("메뉴가 존재하지 않습니다."); break;
			}
			System.out.println();
			if( num == menuList.length) break;
		}
	}

	
	private void allView() {
		Shape printShape = start;
		
		if (printShape == null) {
			System.out.println("출력할 도형이 없습니다.");
		}
		else {
			while(true) {
				printShape.draw();
				if (printShape == end) break;
				printShape = printShape.getNext();			
		}
		}
	}
	
	private void delete() {
		Shape target = start; // 삭제할 도형
		Shape front = null; // 삭제할 도형 앞에 있는 도형
		
		System.out.print("삭제할 도형의 위치 >> ");
		int idx = scan.nextInt();
		
		if (start == null) {
			System.out.println("삭제할 도형이 없습니다.");
			return;
		}
		
		else {
			for( int i = 0 ; i < idx - 1 ; i++) {
				if ( i == idx-2) front = target; // 삭제할 도형 바로 앞 도형 
				target = target.getNext(); // 삭제할 도형	
			}			
		}

		
		// 첫번째 도형을 삭제할 경우
		if ( idx == 1) {
			// 삽입한 도형이 하나일 경우
			if ( start == end ) {
				start = null;
				end = null;
			}
			// 삽입한 도형이 여러개 일 경우 start의 다음 도형으로 참조값을 변경한다.
			else start = start.getNext();
		}
		// 삭제할 도형이 없는 경우
		else if (target == null) {
			System.out.println("삭제할 도형이 없습니다.");
		}
		// 마지막 도형을 삭제할 경우
		else if (target == end) {
			// 삭제 도형 이전 도형을 end로 설정하고
			end = front;
			// 이전 도형의 next를 null로 설정
			front.setNext(null);
		}
		else {
			front.setNext(target.getNext());
		}
		
	}
	
	private void input(Shape shape) {

		switch(menu(shapeList)) {
		case 1 : inputShape = new Line(); break;
		case 2 : inputShape = new Rect(); break;
		case 3 : inputShape = new Circle(); break;
		default : System.out.println("해당 도형이 존재하지 않습니다. 다시 입력해주세요."); break;
		}
		
		if(start == null) {
			start = inputShape;
			end = inputShape;
		}
		else {
			end.setNext(inputShape);
			end = inputShape;
		}
	}
	
	private int menu(String[] list) {
		
		for (int i = 0; i<list.length ; i++) {
			System.out.printf("%s(%d)", list[i], i+1 );
			System.out.print((i == list.length-1)? "":", ");
		}
		
		System.out.print(" >> ");
		num = scan.nextInt();
		return num;
	}
	
	
	public static void main(String[] args) {
		new GrapicEditor();
	}

}
