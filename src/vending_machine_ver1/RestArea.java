package vending_machine_ver1;

public class RestArea {
	String name;
	User user;
	VendingMachine machine;
	
	public RestArea() { this("만남의 광장"); }
	
	public RestArea(String name) {
		this.name = name; // 객체의 파라미터의 값을 확장하기 위하여 사용(객체 초기화) 멤버 변수 초기화 작업
		user = new User("정국");
		welcome();
		machine = new VendingMachine(user);
		
	}
	
	public void welcome() {
		System.out.println("--------------------------------------");
		System.out.println(name + "휴게소에 오신것을 환영합니다.");
		System.out.println("--------------------------------------");
	}
}
