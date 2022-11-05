package org.task.ch07.task03;

import java.util.HashMap;
import java.util.Scanner;

public class Population {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (��: Korea 5000)");
		
		while(true) {
			System.out.print("���� �̸�, �α� >> ");
			String key = scan.next();
			if (key.equals("�׸�")) break;
			Integer value = scan.nextInt();
			
			nations.put(key, value);
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String country = scan.next();
			if (country.equals("�׸�")) break;
			
			if (nations.get(country) == null) System.out.println(country + "����� �����ϴ�." );
			else System.out.printf("%s�� �α��� %d\n", country, nations.get(country));
			
		}
		
	}

}
