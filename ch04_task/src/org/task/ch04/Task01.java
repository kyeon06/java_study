package org.task.ch04;

// �ǽ� 1�� ����
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
		System.out.printf("%s���� ���� %d���� %d��ġ TV", this.company, this.year, this.size);
	}
	
}
public class Task01 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
