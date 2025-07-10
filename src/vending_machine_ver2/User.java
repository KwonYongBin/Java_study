package vending_machine_ver2;

import java.util.Scanner;

public class User {
	//Field
	String name; // 사용자의 이름
	Scanner scan; // 입력을 위한 변수
	
	//Constructor (생성자)
	public User() {this("아무개");} // user라는 생성자를 초기화.
	
	public User(String name) {// 초기화된 생성자를 임의적으로 사용하기위한 생성자.
		this.name = name;
		// 키보드 입력(System.in)을 받을 수 있도록 Scanner 객체를 생성해서 User 클래스의 scan 변수에 넣는다.
		scan = new Scanner(System.in); 
	}
	
	//Method
	/*
	 * 동전 투입
	 */
	
	public int insertCoin() { // 인트 타입의 리턴 메소드
		int resultCoin = 0; //메소드 타입이 int타입 이라서 아무값도 안 들어왔을 때 기본값 0을 리턴하기 위해 선언.
		System.out.println("[" + name + "] 동전 입력> ");
		if (scan.hasNextInt()) {// 입력한 값이 정수인지 문자인지 판단 아니라면 else부분으로 진행해서 본인을 호출.
			//동전 체크 : 100원, 500백원만 입력 가능
			int coin = scan.nextInt(); 
		} else {
			System.out.println("=> 올바르지 않은 값, 다시 입력해 주세요");
			scan.next();
			insertCoin(); //자기 자신을 호출하는 부분.
		}
		return resultCoin;
	}
}
