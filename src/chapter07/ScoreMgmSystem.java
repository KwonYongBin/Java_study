package chapter07;

import java.util.Scanner;

/*
 * - 학생 3명의 점수를 입력 받는다.
 * - 한 명 입력 후 계속 입력 여부를 메시지로 출력 후 입력 받는다.
 */



public class ScoreMgmSystem {
	//Field
	 String admin;
	 Student student;
	 Scanner scan = new Scanner(System.in);
	 Student[] sList = new Student[3];
	//Constructor
	public ScoreMgmSystem() {}
	
	public void insert() {
		//Method
//		student = new Student();
		System.out.println("-- insert --");
		
		for(int i = 0; i < sList.length; i++) {
			sList[i] = new Student();
			System.out.print("학생명 > ");
			sList[i].name = scan.next();
			
			System.out.println("점수 > ");
			sList[i].kor = scan.nextInt();
			
			System.out.println("영어 점수 > ");
			sList[i].eng = scan.nextInt();
			
			System.out.println("수학 점수 > ");
			sList[i].math = scan.nextInt();

			System.out.println("계속? (계속: 아무키, 종료:n >");
			
			if(scan.next().equals("n") ) {
				break;
			}
			System.out.println("등록 완료");
		} 
		
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