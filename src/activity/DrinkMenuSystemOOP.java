package activity;

import java.util.Scanner;

public class DrinkMenuSystemOOP {
	Scanner scan = new Scanner(System.in);
	String[] DrinkMenuName = {"아메리카노(☕)", "바닐라 라떼(🍵)", "딸기 쉐이크(🥤)"};
	int[] DrinkPrice = {2800, 3500, 4000};
	DrinkMenu[] DrinkMenuList = new DrinkMenu[4];
	
	
	public void createDrinkMenu() {
		for(int i = 0; i < DrinkMenuList.length; i++) {
			DrinkMenu menu = new DrinkMenu();
			
		}
	}
}
