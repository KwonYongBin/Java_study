package drink;

import java.util.Scanner;

public class OrderSystem {
	//Field
	String title;
	Scanner scan = new Scanner(System.in);
	String[] names = {"☕ 아메리카노","🍵 바닐라 라떼","🥤 딸기 쉐이크"};
	int[] price = {2800, 3500, 4000};
	Menu[] menuList= new Menu[names.length];
	Order order;
	Payment payment;
	//Field
	
	//Constructor
	public OrderSystem() {
		this("Mega");
//		init();
	}
	public OrderSystem(String title) {
		this.title = title;
		init();
	}
	//Constructor
	
	//Method
	public void init() {
		payment = new Payment();
		createMenuList();
		showMenu();
		selectMenu();
	}
	
	/*
	 * 메뉴 선택 
	 */
	
	public void selectMenu() {
		System.out.print("메뉴 선택(숫자)> ");
		if(scan.hasNextInt()) {
			int menu = scan.nextInt();
			if( 1 <= menu && menu <= 3) {
				placeOrder(menu); // 주문 진행
			} else {
				System.out.println("=> 메뉴 준비중입니다.");
			}
		} else {
			System.out.println("=> 올바르지 않은 입력값 입니다. 다시 선택해주세요.");
			scan.next();// 숫자 이외의 값 입력 시 위의 문구 출력
			selectMenu();
		}
	}
	
	/*
	 * 주문
	 */
	public void placeOrder(int menu) {
		//번호에 맞는 메뉴를 메뉴리스트에서 검색한다. 검색한 메뉴를 Order생성에 매개변수로 입력
		order = new Order(searchMenu(menu));
		if(order.orderMenu != null) order.getInfo();
		System.out.println("=> 주문 완료");
		
		processPayment();
	}
	
	/*
	 * 결제
	 */
	public void processPayment() {		
		System.out.print("결제 금액(숫자)> ");
		if(scan.hasNextInt()) {
			payment.setAmount(scan.nextInt());
			System.out.println("=> 총 입금 금액 : " + String.format("%,d", payment.getAmount()));
			if(payment.getPayment(order.orderMenu.price)) {
				//결제완료
				System.out.println("=> 결제 완료 잔돈 : " + String.format("%,d",payment.getChange()));
				showMenu();
				selectMenu();
			} else {
				//결제 금액 부족
				System.out.println("=> 결제 실패, 금액 부족, 다시 입력");
				processPayment();
			}
		} else {
			System.out.println("=> 올바르지 않은 입력값 입니다. 다시 선택해주세요.");
			scan.next();// 숫자 이외의 값 입력 시 위의 문구 출력
			processPayment();
		}
	}// processPayment
	
	
	public Menu searchMenu(int menuNo) {
		Menu menu = null;
		
		for(Menu m : menuList) { // menuList[0] --> m --> Menu(아메리카노);
			if(m.no == menuNo) {
				menu = m;
				break;
			}
		}
		
		return menu;
	}
	
	public void showMenu() {
		System.out.println("--------------------------------------");
		System.out.println("\t☕🍵🥤["+ title +"] Coffee Menu");
		System.out.println("--------------------------------------");
		for(Menu menu : menuList) {
			System.out.print(menu.no + "\t");
			System.out.print(menu.name + "\t");
			System.out.print(String.format("%,d", menu.price) + "원\n");
		}
		System.out.println("--------------------------------------");
	}
	
	public void createMenuList(){
		for(int i = 0; i < names.length; i++) {
			Menu menu = new Menu((i+1), names[i], price[i]);
			menuList[i] = menu;
		}	
	}
	//Method
}//class