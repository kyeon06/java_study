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
		System.out.printf("%s�� ��ȣ�� %s �Դϴ�.\n", name, tel);
	}
}

public class PhoneBook {
	public static final Scanner scan = new Scanner(System.in);
	private Phone[] phone;
	private int size;
	
	public PhoneBook() {
		System.out.print("�ο��� >> ");
		size = scan.nextInt();
		phone = new Phone[size];
		for ( int i = 0 ; i < size ; i++) {
			phone[i] = new Phone();
		}
	}
	public void save() {
		for (int i = 0 ; i < size ; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�) >> ");
			String name = scan.next();
			String tel = scan.next();
			phone[i].setName(name);
			phone[i].setTel(tel);
		}
		System.out.printf("%d�� ����Ϸ�!\n", size);
	}
	
	public void search() {
		while(true) {
			System.out.print("�˻��� �̸� >> ");
			String name = scan.next();
			
			if (name.equals("�׸�")) {
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
				System.out.println(name + "�� �����ϴ�.");
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
