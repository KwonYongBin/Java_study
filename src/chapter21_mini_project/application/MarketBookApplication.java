package chapter21_mini_project.application;

import java.util.Scanner;

import chapter21_mini_project.service.DefaultMarketBookService;
import chapter21_mini_project.service.MarketBookService;

public class MarketBookApplication {
	public static final int REGISTER = 1;
	public static final int LIST = 2;
	public static final int SEARCH = 3;
	public static final int UPDATE = 4;
	public static final int DELETE = 5;
	public static final int EXIT = 6;
	public Scanner scan;
	public MarketBookService service;
	
	public MarketBookApplication() {
		scan = new Scanner(System.in);
		service = new DefaultMarketBookService(this);
		showBookMenu();
	}
	
	public void showBookMenu() {
		String[] labels = {"도서 등록", "도서 목록 조회", "도서 검색", "도서 수정", "도서 삭제", "종료"};
		
		System.out.println("=== 📕📖📚 도서 관리 시스템 📕📖📚 ===");
		System.out.println("-------------------------------------------------");
		for(int i=0;i<labels.length; i++) {
			System.out.println((i+1) + ".  " + labels[i]);
		}		
		System.out.println("-------------------------------------------------");
		
		selectMenu();
		
	}
	
	public void selectMenu() {
		System.out.print("메뉴(숫자)> ");
		if(scan.hasNextInt()) {
			
			switch(scan.nextInt()) {
			//상수 변수에 각각 값을 부여하고 해다 값을 사용자가 입력하면 해당 케이스를 출력한다.
			case REGISTER:	service.bookRegister();		break;
			case LIST:		service.bookList();			break;
			case SEARCH: 	service.bookSearch();		break;
			case UPDATE:	service.bookUpdate();		break;
			case DELETE:	service.bookDeleete();		break;
			case EXIT:		service.crateBookExit();	break;
			default:	
				System.out.println("=> 메뉴 준비중 입니다.");
				selectMenu();	
			}
		} else {
			System.out.println("🚫 올바르지 않은 형식입니다. 다시 선택해주세요");
			scan.next();
			selectMenu();
		}
	}

	public static void main(String[] args) {
		new MarketBookApplication();
	}

}
