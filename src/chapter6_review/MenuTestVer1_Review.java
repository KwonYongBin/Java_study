package chapter6_review;

import java.util.Scanner;

public class MenuTestVer1_Review {

	public static void main(String[] args) {
		// 변수, 객체 선언
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴 갯수 > ");
		final int MAX_SIZE = scan.nextInt();
		
		String[] nameList = new String[MAX_SIZE];
		String[] emojiList = new String[MAX_SIZE];
		int[] priceList = new int[MAX_SIZE];
		
		//메뉴 등록/출력/검색/종료
		boolean menuFlag = true;
		int menu = 0;
		int menuCount = 0;
		while(menuFlag) {
			System.out.println("-----------------------------------------");
			System.out.println("더조은 레스토랑 메뉴 관리 프로그램");		
			System.out.println("-----------------------------------------");
			System.out.println("1. 메뉴 등록");		
			System.out.println("2. 메뉴 리스트 출력");		
			System.out.println("3. 메뉴 검색");		
			System.out.println("9. 프로그램 종료");		
			System.out.println("-----------------------------------------");
			System.out.print("메뉴선택(숫자)> ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : 
				 for(int i=menuCount; i<MAX_SIZE; i++) {
					 System.out.println("메뉴명 > ");
					 nameList[i] = scan.next();
					 
					 System.out.println("이모지 > ");
					 emojiList[i] = scan.next();
					 
					 System.out.println("가격 > ");
					 priceList[i] = scan.nextInt();
					 
					 menuCount++;
					 
					 if(menuCount == MAX_SIZE) {
						 System.out.println("=> 저장공간 부족, 등록 종료!!");
					 } else {
						 System.out.println("계속 등록? 아무키 입력, 종료:n");
						 if(scan.next().equals("n")) {
							 i = MAX_SIZE;
							 System.out.println("=> 등록 완료");
						 }
					 }
				 }
				break;
			
			case 2 :
				if(menuCount != 0) {
					System.out.println("-----------------------------------------");
					System.out.println("메뉴명\t이모지\t가격");		
					System.out.println("-----------------------------------------");
				}
				break;
			}
		}

	}
}


















