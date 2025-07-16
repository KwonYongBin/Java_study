package chapter5_review;

import java.util.Scanner;

public class DrinkOrderTestVer1_review {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int menuNo = 0;
		int menuPrice = 0;
		String menuName = "";
		String menuPriceOutput = "";
		
		int amount = 0;
		int change = 0;
		String changeOutput = "";
		boolean menuFlag = true;
		boolean paymentFlag = true;
		
		//step 1 : 메뉴판 출력
		System.out.println("[시작]");
		System.out.println("-----------------------------------");
		System.out.println("  ☕🍵🥤 Mega Coffee Menu");
		System.out.println("-----------------------------------");
		System.out.println("1. ☕ 아메리카노 - 2,800원");
		System.out.println("2. 🍵 바닐라 라떼 - 3,500원");
		System.out.println("3. 🥤 딸기 쉐이크 - 4,000원");
		System.out.println("-----------------------------------");
		
		//step 2: 메뉴 주문 기능
		while(menuFlag) { //menuFlag true로 초기화된 boolean 값을 while에 할당
			System.out.println("주문할 메뉴 번호 입력 > ");
			
			//입력된 값이 정수인지 확인
			if(scan.hasNextInt()) { 
				
				// 입력받은 값이 정수형 데이터면 반복문 중지
				menuFlag = false;
				//정수형으로 입력받으 값을 menuNo에 할당한다.
				menuNo = scan.nextInt();
				
				//switch문은 menuNo 변수의 값에 따라 실행할 코드를 선택한다. 처음 menuNo는 0으로 초기화되었지만, 사용자가 입력한 값으로 변경되어 switch문에 전달된다.
				switch(menuNo) {
					//할당 받은 값이 1 ~ 3 이라면 해당 되는 값을 출력한다.
					case 1 : menuName = "☕ 아메리카노"; menuPrice = 2800; break;
					case 2 : menuName = "🍵 바닐라 라떼"; menuPrice = 3500; break;
					case 3 : menuName = "🥤 딸기 쉐이크"; menuPrice = 4000; break;
					default: System.out.println("=> 준비중인 메뉴입니다.");
					//입력 받은 값이 3 이상의 값이라면 메시지를 출력하고 while문을 다시 실행하여 정상적인 값을 입력하도록 유도한다.
					menuFlag = true;
				
				}//switch
				
				//출력용 메뉴 가격 저장
				//사용자가 선택한 메뉴 가격(menuPrice)을 menuPriceOutput‎에 저장한다. String.format("%,d", …)를 사용해 숫자에 천 단위 구분 기호(,)를 넣는다.
				menuPriceOutput = String.format("%,d", new Object[] {Integer.valueOf(menuPrice)});
			} else {
				//입력받은 값이 정수형이 아니면 경고 메시지를 출력하고, 잘못 입력된 토큰을 scan.next()로 소모한 뒤 반복문을 재실행한다.
				//반복문 재실행
				System.out.println("올바르지 않은 값입니다. 다시 입력해주세요");
				scan.next();
			}//if
		}//while
		System.out.println("=> 주문 메뉴 : " + menuName + ", 결제 예정 금액 : " + menuPriceOutput + "원");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
