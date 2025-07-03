package chapter07;

import java.util.Scanner;

public class ScoreMgmSystem {
	//Field
	 String admin;
	 Student student;
	 Scanner scan = new Scanner(System.in);
	 Student[] sList = new Student[0];
	 
	//Constructor
	public ScoreMgmSystem() {}
	
	public void insert() {
		//Method
		System.out.println("-- insert --");
		student = new Student();
		
		System.out.print("학생명 > ");
		student.name = scan.next();
		
		System.out.println("국어 점수 > ");
		student.kor = scan.nextInt();
		
		System.out.println("영어 점수 > ");
		student.eng = scan.nextInt();
		
		System.out.println("수학 점수 > ");
		student.math = scan.nextInt();
		
		System.out.println("등록 완료");
		
	}
	
	public void show() {
		//Method
		System.out.println("----------------------------------------");
		System.out.print("학생명\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("----------------------------------------");
		System.out.print(student.name + "\t");
		System.out.print(student.kor + "\t");
		System.out.print(student.eng + "\t");
		System.out.print(student.math + "\t");
		System.out.print(student.getTot() + "\t");
		System.out.print(student.getAvg() + "\n");
		System.out.println("----------------------------------------");
	}
	
	public void updeat() {
		//Method
		System.out.println("updeat");
	}
	public void remove() {
		//Method
		System.out.println("삭제");
	}
	public void search() {
		//Method
		System.out.println("검색");
	}
}