package chapter03;

import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		System.out.println("********************************************");
		System.out.println("\t Welcome to Shopping Mall");
		System.out.println("\t Welcome to Food Market");
		System.out.println("********************************************");
		System.out.println("\t 1. 햄버거(🍔):100\t 2. 피자(🍕):200");
		System.out.println("\t 3. 라멘(🍜):300\t 4. 샐러드(🥗):400");
		System.out.println("\t 0. 나가기");
		System.out.println("********************************************");
			        
		// Scanner 타입의 scan 변수를 선언하고 Scanner 객체를 생성하여 할당
		Scanner scan = new Scanner(System.in);
			        
		System.out.println("메뉴를 선택해주세요(숫자)");
			        
		// scan.nextInt()를 사용하여 정수 입력을 받고, 이를 menuNumber 변수에 저장
		int menuNumber = scan.nextInt();
			        
		// menuNumber 변수를 출력하여 입력받은 메뉴 번호를 화면에 표시
		System.out.println("선택한 메뉴 : " + menuNumber);
	}
}