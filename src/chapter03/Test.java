package chapter03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("*****************************");
		System.out.println("Welcome to Shopping Mall");
		System.out.println("Welcome to Food Market");
		System.out.println("*****************************");
		System.out.println("1. 상품보기\t 2.상품보기");
		System.out.println("3. 영수증보기\t 4.종료");
		System.out.println("*****************************");
		
		Scanner menu = new Scanner(System.in);
		System.out.print("메뉴를 선택해 주세요(숫자) > ");
		String menuNunber = menu.next();
		
		System.out.println("선택한 메뉴 : " + menuNunber );
	}

}
