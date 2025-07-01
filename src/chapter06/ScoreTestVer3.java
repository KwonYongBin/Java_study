package chapter06;

import java.util.Scanner;

/*
 * ScoreTestVer2의 결과에 메뉴를 추가함
 */

public class ScoreTestVer3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menu = 0;
		boolean menuFlag = true;
		
		System.out.print("크기 입력 > ");
		final int MAX_SIZE = scan.nextInt();
		
		
		String [] nameList = new String [MAX_SIZE];
		int [] korList = new int[MAX_SIZE];
		int [] engList = new int[MAX_SIZE];
		int [] mathList = new int[MAX_SIZE];
		int [] totList = new int[MAX_SIZE];
		int [] avgList = new int[MAX_SIZE];
		
		int count = 0; // 학생 등록 수 저장
		while(menuFlag) {
			System.out.println("----------------------------------------------");
			System.out.println("\t더좋은 고등락교 1-1 성적관리 프로그램");
			System.out.println("----------------------------------------------");
			System.out.println("\t 1. 학생 등록");
			System.out.println("\t 2. 학생 리스트 출력");
			System.out.println("\t 3. 학생 성적 검색");
			System.out.println("\t 9. 종료");
			System.out.println("----------------------------------------------");
			System.out.print("메뉴 선택 => ");
			menu = scan.nextInt();
			
			if (menu == 1) { // 학생 등록
				for(int i = count; i < nameList.length; i++) {
					System.out.print("학생명 => ");
					nameList[i] = scan.next(); //학생의 이름을 입력하면 nameList 공간에 저장된다.
					
					System.out.print("국어 => ");
					korList[i] = scan.nextInt();
					
					System.out.print("영어 => ");
					engList[i] = scan.nextInt();
					
					System.out.print("수학 => ");
					mathList[i] = scan.nextInt();
					
					totList[i] = korList[i]+engList[i]+mathList[i]; // 총점
					avgList[i] = totList[i]/3;						// 평균
					
					count++;
					
					System.out.print("계속 입력 하시겠습니까? (계속: 아무키나 입력 해주세요., 종료:n >");
					if(scan.next().equals("n") ) {
						i = nameList.length; //break;
						System.out.println("=> 등록이 완료되었습니다.");
					}
				} //for
			} else if (menu == 2) { // 학생 리스트 출력
				if(count != 0) { // 또 다른 방법 nameList[i] != null
					// Step3 : 데이터 출력
					System.out.println("----------------------------------------------");
					System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
					System.out.println("----------------------------------------------");
					for(int i = 0; i < nameList.length; i++) {
						if(nameList[i] != null) {
							// 이름이 null이아닌 경우에만 출력
							// 이유 - 저장되지 않은 배열의 나머지 위치는 null로 나타나거나 보여지기 때문에
							// 더 이상 반복을 유도하지 않기위해서
							
							// 저장된 결과 값 출력(결과 확인)
							System.out.print(nameList[i] + " \t"); 
							System.out.print(korList[i] + " \t"); 
							System.out.print(engList[i] + " \t"); 
							System.out.print(mathList[i] + " \t"); 
							System.out.print(totList[i] + " \t"); 
							System.out.println(avgList[i] + " \t");
						}
					}// for
					System.out.println("----------------------------------------------");
				} else {
					System.out.println("등록된 데이터가 없습니다. 등록을 진행해 주세요.");
					
				}
			} else if (menu == 3) { // 학생 성적 검색
				
				boolean searchFlag = true;
				while (searchFlag) {
					System.out.print("학생(이름으로) 조회 > ");
					String searchName = scan.next();
					
					// nameList에서 입력한 학생명 검색 --> 학생의 nameList 주소를 변수에 저장한다.
					int searchIdx = -1;
					int countIdx = 0;
					for(String name : nameList) {
						if(name != null) {
							if(name.equals(searchName)) searchIdx = countIdx;
							countIdx++;
						}
					}
					
					if (searchIdx != -1) {
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
					} else {
						System.out.println("입력하신 이름으로 등록된 학생은 없습니다.");
					}
				
				}// while

			} else if (menu == 9) { // 종료
				System.out.println("-- 프로그램 종료 --");
				System.exit(0);
			} else {
				System.out.println("메뉴 준비중입니다.");
			}
			
//			System.out.println("계속 입력 하시겠습니까? (계속: 아무키나 입력 해주세요., 종료:n >");
//			if(scan.next().equals("n") ) {
//				menuFlag = false; // or break;
//			} //if
		}// while
		System.out.println("-- 프로그램 종료 --");
		
		
		
	}// main

}// class