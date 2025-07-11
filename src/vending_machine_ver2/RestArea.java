package vending_machine_ver2;

public class RestArea {
	String name;
	User user;
	VendingMachine machine;
	
	public RestArea() {this("처인휴게소");	}
	public RestArea(String name) {
		this.name = name; // 객체의 파라미터의 값을 확장하기 위하여 사용( 객체 초기화) 멤버 변수 초기화 작업
		user = new User();
		welcome();
//		machine = new VendingMachine(user);
	}
	
	public void welcome() {
		System.out.println("===========================================");
		System.out.println(name + "갖고싶은 것 다 가챠");
		System.out.println("===========================================");
	}
}
