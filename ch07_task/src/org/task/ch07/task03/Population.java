package org.task.ch07.task03;

import java.util.HashMap;
import java.util.Scanner;

public class Population {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");
		
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String key = scan.next();
			if (key.equals("그만")) break;
			Integer value = scan.nextInt();
			
			nations.put(key, value);
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String country = scan.next();
			if (country.equals("그만")) break;
			
			if (nations.get(country) == null) System.out.println(country + "나라는 없습니다." );
			else System.out.printf("%s의 인구는 %d\n", country, nations.get(country));
			
		}
		
	}

}
