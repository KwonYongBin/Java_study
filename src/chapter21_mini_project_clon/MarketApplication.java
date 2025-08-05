package chapter21_mini_project_clon;

import java.util.Scanner;

public class MarketApplication {
	Scanner scan;
	
	public MarketApplication() {
		scan = new Scanner(System.in);
		showMarketmenu();
	}

	public void showMarketmenu() {
		System.out.println("*************************************************");
		System.out.println("\tWelcome To Shopping Mall");
		System.out.println("\tWelcome To Book Market");
		System.out.println("*************************************************");
		System.out.println("\t1. 고객 정보\t 4. 카트 항목 추가");
		System.out.println("\t2. 카트 상품 목록\t 5. 카트 항목 수량 수정");
		System.out.println("\t3. 카트 비우기\t 6. 카트 항목 삭제");
		System.out.println("\t7. 영수증 보기\t 6. 종료");
		System.out.println("*************************************************");
		System.out.print("메뉴 번호 선택 > ");
		scan.nextInt();
	}
	public static void main(String[] args) {
		new MarketApplication();
	}
}
