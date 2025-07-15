package drink_Interface;

public class Order {
	//Field
	Menu orderMenu; //Menu Add get
	
	//Constructor
	public Order() {}
	public Order(Menu orderMenu) {
		this.orderMenu = orderMenu;
	}
	
	//Method
	public String getName() {
		return orderMenu.getName();
	}
	
	public int getTotle() {
		return orderMenu.getPrice();
	}
	
	public void getInfo() {
		String price = String.format("%,d", orderMenu.getPrice());
		System.out.println("=> 주문 메뉴 : " + orderMenu.getName()
				+ ", 결제 예정 금액 : " + String.format("%,d", orderMenu.getPrice()) + "원" );
	}
}