package chapter06;

/*
 * 더좋은 고등학교 1학년 1반 학생들의 성적관리 프로그램
 * - 학생은 홍길동, 이순신, 김유신, 강감찬, 홍길순
 * - 과목은 국어, 영어, 수학 세과목의 점수를 입력
 * - 입력받은 과목의 총점과 평균을 구함
 * - 학생명, 과목별 점수, 촘점, 평균은 각각 1차원 배열로 생성하여 관리
 * - 입출력을 위해서 각 배열의 주소를 통일시킨다
 * 
 * 프로그래밍 방식 : 구조적(Structured - 순차적) 방식, 객체지향(Object Oriented) 방식
 */

import java.util.Scanner;

public class ScoreTestVer2 {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------");
		System.out.println("\t더좋은 고등락교 1-1 성적관리 프로그램");
		System.out.println("----------------------------------------------");
		
		// Step1 : 배열, 변수 선언
		Scanner scan = new Scanner(System.in);
		System.out.print("크기 입력 > ");
		final int MAX_SIZE = scan.nextInt();
		
		
		String [] nameList = new String [MAX_SIZE];
		int [] korList = new int[MAX_SIZE];
		int [] engList = new int[MAX_SIZE];
		int [] mathList = new int[MAX_SIZE];
		int [] totList = new int[MAX_SIZE];
		int [] avgList = new int[MAX_SIZE];
		
		// Step2 : 데이터 입력 - 실행시 외부에서 입력
		for(int i = 0; i < nameList.length; i++) {
			System.out.print("학생명 > ");
			nameList[i] = scan.next(); //학생의 이름을 입력하면 nameList 공간에 저장된다.
			
			System.out.print("국어 > ");
			korList[i] = scan.nextInt();
			
			System.out.print("영어 > ");
			engList[i] = scan.nextInt();
			
			System.out.print("수학 > ");
			mathList[i] = scan.nextInt();
			
			totList[i] = korList[i]+engList[i]+mathList[i]; // 총점
			avgList[i] = totList[i]/3;						// 평균
			
			System.out.println("계속 입력 하시겠습니까? (계속: 아무키나 입력 해주세요., 종료:n >");
			if(scan.next().equals("n") ) {
				i = nameList.length; //break;
			}
		}
		
		// Step3 : 데이터 출력
		for(int i=0; i < nameList.length; i++) {
			
			if(nameList[i] != null) {
				// 이름이 null이아닌 경우에만 출력
				// 이유 - 저장되지 않은 배열의 나머지 위치는 null로 나타나거나 보여지기 때문에
				// 더 이상 반복을 유도하지 않기위해서
				
				// 저장된 결과 값 출력(결과 확인)
				System.out.println("----------------------------------------------");
				System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
				System.out.print(nameList[i] + "\t"); 
				System.out.print(korList[i] + "\t"); 
				System.out.print(engList[i] + "\t"); 
				System.out.print(mathList[i] + "\t"); 
				System.out.print(totList[i] + "\t"); 
				System.out.println(avgList[i] + "\t");
				
			}// if
			
		}// for
		System.out.println("----------------------------------------------");
		
		
		boolean searchFlag = true;
		while (searchFlag) {
			// Step4 : 학생 데이터 조회
			// 조회할 학생명 입력
			
			System.out.println("학생(이름으로) 조회 > ");
			String searchName = scan.next();
			
			// nameList에서 입력한 학생명 검색 --> 학생의 nameList 주소를 변수에 저장한다.
			int searchIdx = -1;
			int count = 0;
			for(String name : nameList) {
				if(name != null) {
					if(name.equals(searchName)) searchIdx = count;
					count++;
				}
			}
			System.out.println("검색 결과 주소: " + searchIdx);
			
			// Step5 : 학색 데이터 조회 출력
			System.out.println("----------------------------------------------");
			System.out.println("\t\t 검색 결과");
			System.out.println("----------------------------------------------");
			System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
			System.out.print(nameList[searchIdx] + "\t"); 
			System.out.print(korList[searchIdx] + "\t"); 
			System.out.print(engList[searchIdx] + "\t"); 
			System.out.print(mathList[searchIdx] + "\t"); 
			System.out.print(totList[searchIdx] + "\t"); 
			System.out.println(avgList[searchIdx] + "\t");
			System.out.println("----------------------------------------------");
			
			
			System.out.println("계속 검색 하시겠습니까? (계속: 아무키나 입력 해주세요., 종료:n >");
			if(scan.next().equals("n") ) {
				searchFlag = false; //break;
			}
		
		}// while - searchFlag : Step4, Step5 반복
		
		System.out.println("-- 프로그램 종료 --");
		
	}// main

}// class
