package org.task.ch07.task05;

import java.util.ArrayList;
import java.util.Scanner;


class Student {
	private String name;
	private String major;
	private int studentNum;
	private double grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String major, int studentNum, double grade) {
		this.name = name;
		this.major = major;
		this.studentNum = studentNum;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return name + ", " + major + ", " + studentNum + ", " + grade;
	}
	
}
public class Task05 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		for (int i = 0 ; i < 4 ; i++) {
			System.out.print(">> ");
			String name = scan.next();
			String major = scan.next();
			int studentNum = scan.nextInt();
			double grade = scan.nextDouble();
			
			students.add(new Student(name, major, studentNum, grade));
		}
		
		System.out.println("-----------------------");
		for (int i = 0 ; i < 4 ; i++) {
			System.out.println("이름 : " + students.get(i).getName());
			System.out.println("학과 : " + students.get(i).getMajor());
			System.out.println("학번 : " + students.get(i).getStudentNum());
			System.out.println("학점평균 : " + students.get(i).getGrade());
			System.out.println("-----------------------");
		}
		while(true) {
			System.out.print("학생 이름 >> ");
			String searchName = scan.next();
			if(searchName.equals("그만")) break;
			for(int i = 0; i < 4;i++) {
				if(students.get(i).getName().equals(searchName)) {
					System.out.println(students.get(i).toString());
					break;
				}
			}
		}
	}
}
