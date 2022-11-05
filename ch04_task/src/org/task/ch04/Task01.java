package org.task.ch04;

// 실습 1번 문제
class TV {
	String company;
	int year;
	int size;
	
	TV(String company, int year, int size){
		this.company = company;
		this.year = year;
		this.size = size;
	}
	void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV", this.company, this.year, this.size);
	}
	
}
public class Task01 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
