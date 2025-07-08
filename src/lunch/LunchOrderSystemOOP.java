package lunch;

import java.util.Scanner;

public class LunchOrderSystemOOP {
	// Field
	Scanner scan;
	LunchOrderMenuManager menuManager;
	String[] lunchMenuNames = {"햄버거(🍔)", "피자요(🍕)", "라멘요(🍜)", "샐러드(🥗)"}; //선언과 할당 동시
	int[] lunchMenuPrice = {100, 200, 300, 400};
	
	LunchMenu[] lunchMenuList; //= new LunchMenu[4]; // 주문할 메뉴 : LunchMenu //크기만 선언
	LunchOrderItem[] orderItemList; // = new LunchOrderItem[4];
	LunchPaymentItem paymentItem;
	int orderCount = 0;
	int amount = 0; //결제금액 - 사용자 입력
	int change = 0; //잔돈
	String title;
	
	// Constructor
	public LunchOrderSystemOOP() { // 필드의 값들을 초기화 진행
		//this.title = title;
		scan = new Scanner(System.in);
		menuManager = new LunchOrderMenuManager(this); //this라는 키워드를 통해서 객체 주소를 넘겨준다.
		lunchMenuList = new LunchMenu[4];
		orderItemList = new LunchOrderItem[4];
		
		//생성 메소드 호출
		menuManager.createLunchMenu();
	}
	public LunchOrderSystemOOP(String title) { // 필드의 값들을 초기화 진행
		this.title = title;
		scan = new Scanner(System.in);
		menuManager = new LunchOrderMenuManager(this);
		lunchMenuList = new LunchMenu[4];
		orderItemList = new LunchOrderItem[4];
		
		//생성 메소드 호출
		menuManager.createLunchMenu();
		menuManager.showMainMenu();
	}
	
	
	
	/*
	 * 주문아이템의 인덱스 검색
	 */
	public int searchOrderItemIdx(int lunchMenu) {
		int idx  = -1;
		for(int i = 0; i < orderCount; i++) {
			LunchOrderItem orderItem = orderItemList[i];
			if(orderItem.no == lunchMenu) idx = i;
		}
		return idx;
	}
	/*
	 * 주문리스트 초기화
	 */
	public void orderItemListInit() {
		//방법 1
//		orderItemList = new LunchOrderItem[4];
		
		//방법 2
//		for(int i=0; i<orderCount; i++) {
//			orderItemList[i] = null;
//		}
		
		//방법 3
		for(LunchOrderItem orderItem : orderItemList) {
			if(orderItem != null) orderItem = null;
		}
		orderCount = 0;
	}
	
	/*
	 * 주문 : order()
	 */
	public void order(int lunchMenu) {
		
		//lunchMenuList의 메뉴 번호 확인
		for(LunchMenu menu : lunchMenuList) {
			if(menu.no == lunchMenu) {
				
				int idx = searchOrderItemIdx(lunchMenu);
				
				if(idx == -1) {
					orderItemList[orderCount] = new LunchOrderItem();
					
					orderItemList[orderCount].no = menu.no;
					orderItemList[orderCount].name = menu.name;
					orderItemList[orderCount].price = menu.price;
					orderItemList[orderCount].qty = 1;
					orderCount++;
				} else {
					orderItemList[idx].qty += 1;
				}
				break;
			}
		}
		
		System.out.println("=> 주문 완료");
		menuManager.showMainMenu();
	}
	
	/*
	 * 주문내역 : orderList()
	 */
	public void orderList() {
		if(orderCount == 0) {
			System.out.println("=> 주문내역 존재X, 음식을 주문해주세요");
		} else {
			System.out.println("-----------------------------------------");
			System.out.println("\t음식 주문 내역");
			System.out.println("-----------------------------------------");
			System.out.println("번호\t메뉴명\t\t가격\t수량");
			System.out.println("-----------------------------------------");
			for(LunchOrderItem orderItem : orderItemList) {
				if(orderItem != null) {
					System.out.print(orderItem.no + "\t");
					System.out.print(orderItem.name + "\t");
					System.out.print(orderItem.price + "\t");
					System.out.print(orderItem.qty + "\n");					
				}
			}
			System.out.println("-----------------------------------------");
		}
		menuManager.showMainMenu();
	}
	
	/*
	 * 결제 예정금액 산출
	 */
	public int totalPayment() {
		int sum = 0;
		for(LunchOrderItem orderItem : orderItemList) {
			if (orderItem != null) {
				sum += orderItem.price * orderItem.qty;
			}
		}
		return sum;
	}
	
	/*
	 * 결제 : payment()
	 */
	public void payment() {
		if(orderCount == 0) {
			System.out.println("=> 주문내역 존재X, 음식을 주문해주세요");
		} else {	
			int total = totalPayment();
			System.out.println("=> 결제 예정 금액 : "+ total);
			System.out.print("결제할 요금 입력(숫자)> ");
			if(scan.hasNextInt()) {
				amount += scan.nextInt();
				System.out.println("=> 총 입력 금액 : " + amount);	
				
				if(amount >= total) {								
					change = amount - total;
					
					paymentItem = new LunchPaymentItem();
					paymentItem.name = orderItemList[0].name + "등\n";
					paymentItem.totalPayment = total;
					paymentItem.amount = amount;
					paymentItem.change = change;
					System.out.println("=> 결제 성공!!");			
					
					//주문리스트 초기화
					orderItemListInit();
					
				} else {
					System.out.println("=> 요금이 부족합니다. 다시 입력해 주세요");
					payment();
				}			
				
			} else {
				System.out.println("=> 올바르지 않은 입력값입니다. 다시 입력해주세요.");
				scan.next();
			}//if
		}
		menuManager.showMainMenu();
	}
	
	/*
	 * 결제 내역 : paymentList()
	 */
	public void paymentList() {
		if(paymentItem == null) {
			System.out.println("=> 결제내역X, 주문을 진행해주세요");
		} else {
			System.out.println("-----------------------------------------");
			System.out.println("\t음식 주문 내역");
			System.out.println("-----------------------------------------");
			System.out.println("주문명\t결제금액\t총입금액\t잔돈");
			System.out.println("-----------------------------------------");
			System.out.print(paymentItem.name + "\t");
			System.out.print(paymentItem.totalPayment + "\t");
			System.out.print(paymentItem.amount + "\t");
			System.out.print(paymentItem.change + "\t");			
			System.out.println("-----------------------------------------");
		}
		menuManager.showMainMenu();
	}
}// class