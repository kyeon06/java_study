package org.task.ch04;

import java.util.Scanner;

class Phone {
	
	private String name;
	private String tel;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void show() {
		System.out.printf("%s의 번호는 %s 입니다.\n", name, tel);
	}
}

public class PhoneBook {
	public static final Scanner scan = new Scanner(System.in);
	private Phone[] phone;
	private int size;
	
	public PhoneBook() {
		System.out.print("인원수 >> ");
		size = scan.nextInt();
		phone = new Phone[size];
		for ( int i = 0 ; i < size ; i++) {
			phone[i] = new Phone();
		}
	}
	public void save() {
		for (int i = 0 ; i < size ; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력) >> ");
			String name = scan.next();
			String tel = scan.next();
			phone[i].setName(name);
			phone[i].setTel(tel);
		}
		System.out.printf("%d명 저장완료!\n", size);
	}
	
	public void search() {
		while(true) {
			System.out.print("검색할 이름 >> ");
			String name = scan.next();
			
			if (name.equals("그만")) {
				return;
			}
			
			boolean flag = false;
			for (int i = 0 ; i < size ; i++) {
				if(name.equals(phone[i].getName())) {
					phone[i].show();
					flag = true;
				}
			}
			
			if (!flag) {
				System.out.println(name + "이 없습니다.");
			}
		}
	}
	
	public void run() {
		save();
		search();
	}
	
	public static void main(String[] args) {
		PhoneBook myPhonebook = new PhoneBook();
		myPhonebook.run();
	}
}
