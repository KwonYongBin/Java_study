package chapter5_review;

import java.util.Scanner;

public class LunchOrderTestVer1 {

	public static void main(String[] args) {
		System.out.println("*********************************************************");
		System.out.println("\t Welcome to Food Mart!!!");
		System.out.println("*********************************************************");
		System.out.println("\t 1. 햄버거(🍔):100\t 2. 피자(🍕):200");		
		System.out.println("\t 3. 라멘(🍜):300 \t 4. 샐러드(🥗):400");		
		System.out.println("\t 9. 나가기");		
		System.out.println("*********************************************************");
		System.out.println("***** Food Mart에 오신것을 환영합니다");
		
		Scanner scan = new Scanner(System.in);
		int menuNo = -1; // 사용자가 메뉴를 선택할 시 입력값이 아닌 다른 수를 입력하면 데이터에 저장될 수 있어서 명시적으로 절대 나올 수 없는 -1을 주어 초기화 한다.
		String menuName = ""; // 메뉴 이름을 빈값으로 초기화하여 입력된 번호의 메뉴명을 변수에 담는다
		int menuPrice = 0; //사용자가 메뉴 번호를 선택하면 그 메뉴의 지정된 가격을 변수에 담기위해 초기값을 설정한다.
		int charge = 0; // 사용자가 투입 금액을 입력하면 입력한 금액을 변수에 담기위한 변수이며 초기값을 0으로 설정한
		int change = 0; // 사용자가 메뉴의 값보다 더 많은 금액을 투입했을 시 갑을 반환해 주기 위한 초기값 변수이다.
		
		//1. 메뉴 주문
		System.out.print("메뉴(숫자)선택 =>");
		if (scan.hasNextInt()) { // 입력된 값이 정수인지 확인하기 위한 초기값을 if에 할당
			menuNo = scan.nextInt(); //입력된 정수를 menuNo변수에 담는다.
			 
			switch(menuNo) { //정수를 입력받은 menuNo변수를 switch문의 case번호와 비교하여 true인 값을 확인한다.
			 case 1 : menuName = "햄버거(🍔)"; 	menuPrice = 100;	break; 
			 case 2 : menuName = "피자(🍕)"; 	menuPrice = 200;	break; 
			 case 3 : menuName = "라멘(🍜)";		menuPrice = 300;	break; 
			 case 4 : menuName = "샐러드(🥗)";	menuPrice = 400; 	break; 
			 case 9 : System.out.println("- 프로그램을 종료합니다 -"); System.exit(0); break; // 사용자가 9를 입력하면 프로그램이 종료되는 명령
			 default : System.out.println("=> 준비중인 메뉴입니다.");// 없는 번호를 사용자가 입력하면 메시지를 출력한다
			}//switch
		} else {
			System.out.println("=> 올바르지 않은 입력값입니다.");//정수 이외의 값을 입력하면 메시지를 출력한다.
		}//if
		
		System.out.println("=> 주문하신 메뉴는 " + menuName + "가격은 " + menuPrice + "입니다."); //주문이 정상적으로 이루어지면 메뉴 이름과 가격을 출력한다.
		
		//2. 주문 메뉴 결제
		System.out.print("결제할 요금 입력(숫자)> ");
		
		if(scan.hasNextInt()) {// 정수를 확인하기 위한 값
			
			charge = scan.nextInt();//입력한 값을 charge변수에 저장
			
			if(charge >= menuPrice) { //입력한 값이 charge와 menuPrice 같거나 적은지 확인한다.
				change = charge - menuPrice; //입력값 - 메뉴 금액을 연산하여 많다면 change변수에 값을 저장
			} else {
				System.out.println("=> 요금이 부족합니다. 다시 입력해 주세요");
			}
		} else {
			System.out.println("=> 올바르지 않은 입력값입니다.");
		}//if
		
		System.out.println("=> 주문한 메뉴는 " + menuName + "결제금액(" + menuPrice + "), 잔돈(" + change + ")");
	}//main

}//class





















