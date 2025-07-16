package chapter5_review;

import java.util.Scanner;

public class DrinkOrderTestVer1_review {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int menuNo = 0; //사용자가 선택한 메뉴 번호를 저장하는 변수
		int menuPrice = 0; //선택한 메뉴의 가격을 저장하는 변수
		String menuName = ""; // 선택한 메뉴의 이름을 저장하는 변수. 초기값은 빈 문자열
		String menuPriceOutput = ""; //menuPrice는 정수이지만, 천 단위 구분 기호(,)를 넣어 출력하기 위해 문자열 변수 menuPriceOutput을 선언하고 초기값을 빈 문자열로 설정한다.
		
		int amount = 0; // 사용자가 입력한 결제 금액을 저장하는 변수
		int change = 0; // 결제 후 발생한 잔돈 금액을 저장하는 변수
		String changeOutput = ""; //change 값을 천 단위 구분 기호(,)와 함께 출력하기 위한 문자열 변수
		boolean menuFlag = true; // 메뉴 선택 반복문을 제어하기 위한 논리값 변수
		boolean paymentFlag = true;// 결제 입력 반복문을 제어하기 위한 논리값 변수
		
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
		// 사용자가 입력한 menuName와 해당하는 가격을 console에 출력한다.
		System.out.println("=> 주문 메뉴 : " + menuName + ", 결제 예정 금액 : " + menuPriceOutput + "원");
		
		
		
		System.out.println("결제 진행 ---------------------------------->>");
		//paymentFlag를 while문의 조건으로 사용한다. true이므로 반복문이 처음에 실행된다.
		while(paymentFlag) { 
			System.out.print("결제 금액 입력> ");
			//입력한 값이 정수형 타입인지 확인
			if(scan.hasNextInt()) {
				
				//사용자가 원하는 메뉴를 선택했다면 결제 금액을 입력받는다.
				//+= 를 사용한 이유는 목표 금액보다 부족할 경우, 반복문을 다시 실행해서 추가로 입력한 금액을 누적하기 위해서다.
				//즉, 단순 덮어쓰기(=) 대신 누적합산(+=)을 사용했다.
				amount += scan.nextInt();
				
				//입력 금액을 메시지를 통해 출력
				System.out.println("총 입력금액 : " + amount);
				
				//입력한 금액이 메뉴 가격보다 크거나 같으면 if문이 실행되고, 반복문을 종료한다.
				//이 경우 else문은 실행되지 않으며, 결제 완료 메시지와 잔돈을 출력한다.
				if(amount >= menuPrice) {
					//잔돈 = 입력 금액 - 메뉴 가격 - 사용자가 입력한 총 금액에서 메뉴 가격을 빼서 잔돈을 계산한다.
					change = amount - menuPrice;
					//changeOutput = String.format("%,d", new Object[] {Integer.valueOf(change)}); 방법 1.
					changeOutput = String.format("%,d", change); // 방법 2.
					
					paymentFlag = false;
				} else {
					//금액이 메뉴 가격보다 부족하면 else문이 실행되고, paymentFlag가 여전히 true이므로 반복문이 다시 실행되어 추가 결제 금액을 입력받는다.
					System.out.println("금액이 부족합니다. 다시 입력해주세요");
				}//if
			} else {
				//만약 정수 이외의 값이 입력되면 오류 메시지를 출력하고, 잘못 입력된 값을 scan.next()로 소모한 뒤 반복문을 재실행한다.
				System.out.println("올바르지 않은 값입니다. 다시 입력해주세요");
				scan.next();
			}//if
		}//while
		//정상적인 메뉴 구매가 이루어졌다면 결제 완료 메시지와 잔돈 출력한다
		System.out.println("=> 결제 완료! 잔돈 : " + changeOutput + "원");
		
		
		//step 4: 주문 완료 
		System.out.println("결제 완료 ---------------------------------->>");
		System.out.println("[종료]");
		System.out.println("이용해주셔서 감사합니다.");

	}//main
	
}//class
