package chapter05;

import java.util.Scanner;

/*
 * ☕🍵🥤 음료 주문 프로그램 요구사항 정의서
 */

public class DrinkOrderTestVer1 {

	public static void main(String[] args) {
		// 지역 변수 선언
		Scanner scan = new Scanner(System.in);
		
		int menuChoice = -1;
		int menuPrice = 0;
		String menuName = "";
		String menuPriceOutput = "";
		boolean menuFlag = true;
		boolean payFlag = true;

		int charge = 0;
		int change = 0;
		
		
		// step 1 : 메뉴판 출력
		System.out.println("[시작]");
		System.out.println("--------------------------------------");
		System.out.println("\t☕🍵🥤 Mega Coffee Menu");
		System.out.println("--------------------------------------");
		System.out.println("\t1. ☕ 아메리카노 -  2,800원");
		System.out.println("\t2. 🍵 바닐라 라떼 - 3,500원");
		System.out.println("\t3. ☕ 모카라떼 -  3,800원");
		System.out.println("\t4. 🥤 요커트스무디 - 5,000원");
		System.out.println("\t5. 🥤 딸기 쉐이크 - 4,000원");
		System.out.println("--------------------------------------");
		
		// step 2 : 메뉴 주문 기능

		System.out.print("주문 메뉴 번호 입력(번호)> ");
		while(menuFlag) {
				if(scan.hasNextInt()) {
					menuChoice = scan.nextInt();
						switch (menuChoice) {
						
							case 1 : menuName = "아메리카노"; 		menuPrice = 2800; menuFlag = false; break;
							case 2 : menuName = "바닐라 라떼"; 	menuPrice = 3500; menuFlag = false; break;
							case 3 : menuName = "모카라떼"; 		menuPrice = 4000; menuFlag = false; break;
							case 4 : menuName = "요커트 스무디"; 	menuPrice = 3800; menuFlag = false; break;
							case 5 : menuName = "딸기 쉐이크"; 	menuPrice = 5000; menuFlag = false; break;
							/* 	while문 흐름 정리
							 	while 조건식에 menuFlag(boolean 변수)를 사용하여 반복 제어
							 	menuFlag를 true로 초기화해 반복 시작
							 	정상 메뉴 선택 시 menuFlag = false로 변경해 반복 종료 유도
							 	없는 번호 입력 시 menuFlag는 그대로 true 유지 → 반복 계속
							 	switch문으로 메뉴 선택 분기 처리하며 반복 진행
							 */
							case 8 : 
								System.out.println("프로그램을 종료합니다.");
								System.exit(0);
								break;
							default :
							System.out.println("준비중인 메뉴입니다. 다시 선택 바랍니다. > ");
						}//switch

					} else {
						System.out.println("올바르지 않은 값입니다. 다시 입력해주세요.");
						scan.next();
					}// if 사실상 boolean이 종료되는 시점.

		} //while
		menuPriceOutput = String.format("%,d", new Object[] {Integer.valueOf(menuPrice)});
		System.out.println("=> 주문 메뉴 : " + menuName + "\n=> 결제 예정 금액 : " + menuPriceOutput + "₩");
		// System.out.println("--step1 종료--");
		
		while(payFlag) {
			System.out.println("=> 요금을 투입해 주세요");
			if(scan.hasNextInt()) {
				charge += scan.nextInt();
				System.out.println("=> 총 입력 금액 : " + charge);
				
				if(charge >= menuPrice) {
					
					change = charge - menuPrice;
					payFlag = false;
				} else {
					System.out.println("=> 요금이 부족합니다. 다시 투입해 주세요 >");
				}
			} else {
				System.out.println("=> 올바르지 않은 입력값입니다. 다시 입력해주세요.");
				scan.next();
			}
		}
		
		//3. 주문 내역 출력 : 주문한 메뉴는 (햄버거), 결제금액(), 잔돈() 입니다.
		System.out.println("=> 주문한 메뉴는 "+menuName+", 결제금액("+menuPrice+"), 잔돈("+change+") 입니다.");
		System.out.println("이용해 주셔서 감사합니다.");
	}// main

}// class
