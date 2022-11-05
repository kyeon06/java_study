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
	private String[] menuList = {"����", "����", "��� ����", "����"};
	private String[] shapeList = {"Line", "Rect", "Circle"};
	private int num = 0;
	Shape inputShape = null;
	Shape start, end;
	
	public GrapicEditor() {
		System.out.println("<<< �׷��� ������ beauty ���� >>>");
		
		while(true) {
			switch(menu(menuList)) {
			case 1: input(inputShape); break;
			case 2: delete(); break;
			case 3: allView(); break;
			case 4: System.out.println("beauty�� �����մϴ�."); break;
			default : System.out.println("�޴��� �������� �ʽ��ϴ�."); break;
			}
			System.out.println();
			if( num == menuList.length) break;
		}
	}

	
	private void allView() {
		Shape printShape = start;
		
		if (printShape == null) {
			System.out.println("����� ������ �����ϴ�.");
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
		Shape target = start; // ������ ����
		Shape front = null; // ������ ���� �տ� �ִ� ����
		
		System.out.print("������ ������ ��ġ >> ");
		int idx = scan.nextInt();
		
		if (start == null) {
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		
		else {
			for( int i = 0 ; i < idx - 1 ; i++) {
				if ( i == idx-2) front = target; // ������ ���� �ٷ� �� ���� 
				target = target.getNext(); // ������ ����	
			}			
		}

		
		// ù��° ������ ������ ���
		if ( idx == 1) {
			// ������ ������ �ϳ��� ���
			if ( start == end ) {
				start = null;
				end = null;
			}
			// ������ ������ ������ �� ��� start�� ���� �������� �������� �����Ѵ�.
			else start = start.getNext();
		}
		// ������ ������ ���� ���
		else if (target == null) {
			System.out.println("������ ������ �����ϴ�.");
		}
		// ������ ������ ������ ���
		else if (target == end) {
			// ���� ���� ���� ������ end�� �����ϰ�
			end = front;
			// ���� ������ next�� null�� ����
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
		default : System.out.println("�ش� ������ �������� �ʽ��ϴ�. �ٽ� �Է����ּ���."); break;
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
