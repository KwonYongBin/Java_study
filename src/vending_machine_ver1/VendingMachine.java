package vending_machine_ver1;

import commons.Menu;

public class VendingMachine {
	String [] nameList = {"☕ 밀크커피","☕ 아메리카노","🍋 유자차","🥛 우유"};
	int[] priceList = {300, 400, 300, 200};
	Menu[] menuList;
	String title;
	
	public VendingMachine() {
		this("막심");
	}
	public VendingMachine(String title) {
		this.title = title;
		createMenuList();
		showMemuList();
	}
	
	/*
	 * 메뉴 출력
	 */
	public void showMemuList() {
		System.out.println("--------------------------------------");
		System.out.println("\t☕☕🍋🥛["+ title +"] Coffee Menu");
		System.out.println("--------------------------------------");
		for(Menu menu : menuList) {
			System.out.print(menu.getNo() + "\t"); //import 으로 공통 클래스를 사용 할 때에는 리턴값인 getName()을 사용한다.
			System.out.print(menu.getName() + "\t");
			System.out.print(String.format("%,d", menu.getPrice()) + "원\n");
		}
		System.out.println("--------------------------------------");
	}
	
	/*
	 * 메뉴리스트 생성
	 */
	public void createMenuList() {
		menuList = new Menu[menuList.length];
		for(int i = 0; i < menuList.length; i++) {
			int no = i + 1;
			String name = nameList[i];
			int price = priceList[i];
			
			Menu menu = new Menu(no, name, price);
			menuList[i] = menu;
		}
	}
}// class - VendingMachine