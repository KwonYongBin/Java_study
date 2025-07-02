package chapter05;

import java.util.Scanner;
/*
 * 음식 주문/결제 프로그램(콘솔)
 *  - 음식을 주문(1), 결제(2), 프로그램 종료(9)하는 메뉴로 구성한다.
 *  - 프로그램 종료를 제외하고 나머지 메뉴는 반복 선택 가능하다.
 *  - 메뉴 선택 시 테크하는 기능은 switch ~ case를 이용하여 구현한다.
 *  
 * <<추가사항>>
 * (1) 메뉴 예외사랑 처리
 * 	   : 메뉴 선택, 결제금액 입력 시 정수형 타입이 아닌 경우 메시지 출력 후 재입력을 유도함.
 * (2) 입력값이 정확할 때까지 재입력을 유도하여 진행, flag 변수를 이용하여 반복
 * (3) 결제 금액이 부족한 경우재입력을 통해 금액을 누적으로 계산하여 저장 후 결제
 */

public class LunchOrderTesVer2 {

	public static void main(String[] args) {
		//메뉴판
		System.out.println("**********************************************");
		System.out.println("\t Welcome to Food mart!!!");
		System.out.println("**********************************************");
		System.out.println("\t 1. 햄버거(🍔):100 2. 피자(🍕):200");
		System.out.println("\t 3. 라멘(🍜):300  4. 샐러드(🥗):400");
		System.out.println("\t 9. 나가기");
		System.out.println("**********************************************");
		System.out.println("********* Food Mart에 오신것을 환영합니다 *********");
		
		
		Scanner scan = new Scanner(System.in);
		int menuNo = -1;
		String menuName = "";
		int menuPrice = 0;
		int charge = 0;
		int change = 0;
		
		boolean menuFlag = true;
		boolean priceFlag = true;
		
		// 1. 메뉴 선택
		while(menuFlag) {
			System.out.print("메뉴 선택(숫자로)> ");
			if(scan.hasNextInt()) {
				menuNo = scan.nextInt();
				
				switch (menuNo) {
				 case 1 : menuName = "햄버거(🍔)";	menuPrice = 100;	break;
				 case 2 : menuName = "피자(🍕)";		menuPrice = 200;	break;
				 case 3 : menuName = "라멘(🍜)";		menuPrice = 300;	break;
				 case 4 : menuName = "샐러드(🥗)"; 	menuPrice = 400;	break;
				 case 9 : 
					 System.out.println("프로그램을 종료합니다.");
					 System.exit(0);
					 break;
				 default : 
					 System.out.println("메뉴 준비중 입니다.");
				}// switch
				
				menuFlag = false;
			
			} else {
				System.out.println("올바르지 않는 입력값입니다. 다시 입력해주세요");
				scan.next();
			}// if
		}// while
		System.out.println("주문하신 메뉴는 "+ menuName +", 가격은 "+ menuPrice +"원 입니다.");
		
		
		// 2.주문 메뉴 결제
		while(priceFlag) {
			System.out.print("결제할 요금 입력 (숫자)> ");
			if(scan.hasNextInt()) {
				charge += scan.nextInt();
				System.out.println("=> 투입요금 총 금액" + charge);
				
				if(charge >= menuPrice) {
					change = charge - menuPrice;
					
					priceFlag = false;
				
				} else {
					System.out.println("=>요금이 부족합니다. 다시 입력해주세요");
				}
				
			} else {
				System.out.println("=>올바르지 않은 입력값입니다. 다시 입력해주세요");
				scan.next();
			}// if
		}// while - payment
		
		// 3.주문 내역 출력 : 주만한 메뉴는 (햄버거), 결제금액(), 잔돈() 입니다.
		System.out.println("주문한 메뉴는 "+menuName+", 결제금액("+menuPrice+"), 잔돈("+change+") 입니다.");
	}
}

/*
if(scan.hasNextInt()) {
	menuNo = scan.nextInt();
	//메뉴선택 체크
	if(menuNo == 1) {
		System.out.println("햄버거🍔");
	} else if(menuNo == 2 ) {
		System.out.println("피자🍕");
	} else if(menuNo == 3 ) {
		System.out.println("라멘🍜");
	} else if(menuNo == 4 ) {
		System.out.println("샐러드🥗");
	} else if(menuNo == 9 ) {
		System.out.println("-- 프로그램을 종료합니다 --");
		System.exit(0);
	} else {
		System.out.println("메뉴가 준비중입니다.");
	}
 */
