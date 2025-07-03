package chapter07;

public class Car {
	//Field = 필드변수, 멤버변수, 전역변수
	// heap에 생성
	String name;
	String company;
	int price;
	
	
	//Constructor
	//Method
	public void showInfo() {
		System.out.println("모델명 : " + name);
		System.out.println("제조사 : " + company);
		System.out.println("가격 : " + price);
	}
}
