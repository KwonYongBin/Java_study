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
		boolean a = true;
		
		// step 1 : 메뉴판 출력
		System.out.println("[시작]");
		System.out.println("--------------------------------------");
		System.out.println("\t☕🍵🥤 Mega Coffee Menu");
		System.out.println("--------------------------------------");
		System.out.println("\t1. ☕ 아메리카노 -  2,800원");
		System.out.println("\t2. 🍵 바닐라 라떼 - 3,500원");
		System.out.println("\t3. 🥤 딸기 쉐이크 - 4,000원");
		System.out.println("--------------------------------------");
		
		// step 2 : 메뉴 주문 기능

		System.out.print("주문 메뉴 번호 입력(번호)> ");
		while(menuFlag) {
				if(scan.hasNextInt()) {
					menuChoice = scan.nextInt();
						switch (menuChoice) {
							case 1 : menuName = "아메리카노"; 		menuPrice = 2800; break;
							case 2 : menuName = "바닐라라떼"; 		menuPrice = 3500; break;
							case 3 : menuName = "딸기스무디"; 		menuPrice = 4000; break;
							case 4 : menuName = "모카라떼"; 		menuPrice = 3800; break;
							case 5 : menuName = "요커트스무디"; 	menuPrice = 5000; break;
							default :
							System.out.println("준비중인 메뉴입니다. 다시 선택 바랍니다. > ");
						}//switch

						menuPriceOutput = String.format("%,d", new Object[] {Integer.valueOf(menuPrice)});
						// System.out.print(menuName);
				
					menuFlag = false;
					} else {
						System.out.println("올바르지 않은 값입니다. 다시 입력해주세요.");
						scan.next();
					}// if 사실상 boolean이 종료되는 시점.

		} //while
		System.out.println("=> 주문 메뉴 : " + menuName + ", 결제 예정 금액 :" + menuPriceOutput + "원");
		System.out.println("--step1 종료--");
		
		
		
		
		
		System.out.println("[종료]");
		System.out.println("이용해 주셔서 감사합니다.");
	}// main

}// class
