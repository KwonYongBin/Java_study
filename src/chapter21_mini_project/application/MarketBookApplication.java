package chapter21_mini_project.application;

import java.util.Scanner;

import chapter21_mini_project.service.DefaultMarketBookService;
import chapter21_mini_project.service.DefaultMarketMemberService;
import chapter21_mini_project.service.MarketBookService;
import chapter21_mini_project.service.MarketMemberServise;

public class MarketBookApplication {
	/**
	 * 도서 등록 전역 변수
	 */
	public static final int BOOK_REGISTER = 1;
	public static final int BOOK_LIST = 2;
	public static final int BOOK_SEARCH = 3;
	public static final int BOOK_UPDATE = 4;
	public static final int BOOK_DELETE = 5;
	public static final int BOOK_EXIT = 6;
	
	/**
	 * 회원 등록 전역 변수
	 */
	public static final int MEMBER_INFO = 1;
	public static final int CART_LIST = 2;
	public static final int CART_CLEAR = 3;
	public static final int CART_ADD = 4;
	public static final int CART_DELETE_ITEM = 5;
	public static final int PRINT_BILL = 6;
	public static final int MEMBER_EXIT = 7;
	
	public Scanner scan;
	public MarketBookService service;
	public MarketMemberServise serviceM;
	
	public MarketBookApplication() {
		scan = new Scanner(System.in);
		service = new DefaultMarketBookService(this);
		serviceM = new DefaultMarketMemberService(this);
	}
	
	/**
	 * 도서등록 메뉴
	 */
	public void showBookMenu() {
		String[] labels = {"도서 등록", "도서 목록 조회", "도서 검색", "도서 수정", "도서 삭제", "종료"};
		
		System.out.println("=== 📕📖📚 도서 관리 시스템 📕📖📚 ===");
		System.out.println("-------------------------------------------------");
		for(int i=0;i<labels.length; i++) {
			System.out.println((i+1) + ".  " + labels[i]);
		}		
		System.out.println("-------------------------------------------------");
		
		selectBookMenu();
		
	}
	
	/**
	 * 도서등록 선택
	 */
	public void selectBookMenu() {
		System.out.print("메뉴(숫자)> ");
		if(scan.hasNextInt()) {
			
			switch(scan.nextInt()) {
			//상수 변수에 각각 값을 부여하고 해다 값을 사용자가 입력하면 해당 케이스를 출력한다.
			case BOOK_REGISTER:	service.bookRegister();		break;
			case BOOK_LIST:		service.bookList();			break;
			case BOOK_SEARCH: 	service.bookSearch();		break;
			case BOOK_UPDATE:	service.bookUpdate();		break;
			case BOOK_DELETE:	service.bookDeleete();		break;
			case BOOK_EXIT:		service.crateBookExit();	break;
			default:	
				System.out.println("=> 메뉴 준비중 입니다.");
				selectBookMenu();	
			}
		} else {
			System.out.println("🚫 올바르지 않은 형식입니다. 다시 선택해주세요");
			scan.next();
			selectBookMenu();
		}
	}
	
	/**
	 * 회원 정보 등록
	 */
	public void createMembe() {
		System.out.println("회원등록 후 쇼핑 이용바랍니다.");
//		service.menuMemberAdd();
	}
	
	/**
	 * 메뉴 출력
	 */
	public void showMarketMenu() {
		String[] labels = {
				"1. 고객정보 확인하기",
				"2. 장바구니 상품목록 보기",
				"3. 장바구니 비우기",
				"3. 장바구니 항목 추가하기",
				"3. 장바구니 항목 삭제하기",
				"3. 영수증 출력하기",
				"3. 종료",
		};
		
		System.out.println("******************************************************************");
		System.out.println("\tWelcome to Shopping Mall ");
		System.out.println("\tWelcome to Book Market!! ");
		System.out.println("******************************************************************");
		
		for(int i = 0; i<labels.length; i += 2) {
			System.out.println("" + labels[i]);
			
			if(i + 1 < labels.length) {
				if(i + 2 == 2) {
					System.out.println("\t\t" + labels[i + 1]);
				} else if(i + 2 == 4) {
					System.out.println("\t\t\t" + labels[i + 1]);
				} else {
					System.out.println("\t" + labels[i + 1]);
				}
			}
			System.out.println();
		}
		System.out.println("******************************************************************");
		
		showMarketMenu();
	}
	
	/**
	 * 메뉴 선택
	 */
	public void selectMemberMenu() {
		System.out.println("메뉴(숫자) > ");
		if(scan.hasNextInt()) {
			switch(scan.nextInt()) {
				case MEMBER_INFO : serviceM.menuMemberInfo(); break;
				case CART_LIST : serviceM.menuCartList(); break;
				case CART_CLEAR : serviceM.menuCartClear(); break;
				case CART_ADD : serviceM.menuCartAddItem(); break;
				case CART_DELETE_ITEM : serviceM.menuCartRemoveItem(); break;
				case PRINT_BILL : serviceM.menuCartBill(); break;
				case MEMBER_EXIT : serviceM.exit(); break;
				default :
						System.out.println("준비중인 메뉴입니다.");
						selectMemberMenu();
			}
		} else {
			System.out.println("올바르지 않은 형식입니다. 다시 선택해주세요");
			scan.next();
			selectMemberMenu();
		}
	}

	public static void main(String[] args) {
		
		new MarketBookApplication();
	}

}






















