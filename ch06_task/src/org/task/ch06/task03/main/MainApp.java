package org.task.ch06.task03.main;

import org.task.ch06.task03.etc.Calc;
public class MainApp {

	public static void main(String[] args) {
		Calc c = new Calc(10,20);
		System.out.println(c.sum());
	}

}

