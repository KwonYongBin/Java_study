package chapter03;

import java.util.Scanner; // 자주 사용하지 않아서 improt하여야 사용가능한 참조 데이터

public class ReferenceDateType {

	public static void main(String[] args) {
		// 참조 데이터 타입 정의 : 배열, 클래스, 인터페이스 ..
		String name  = new String("홍길동");
		
		Scanner scan = new Scanner(System.in);
		
		// !!!!! 중요
		// String 클래스는 기본형으로도 사용이 가능함
		String name2 = "홍길동";
		
		System.out.println(name);
		System.out.println(name2); // 객체 정보 출력
		System.out.println(name == name2); // 결과는 같을지 모르지만 주소값이 다르기 때문에 논리형 변수의 값으로는 거짓값이 나온다.
		System.out.println(scan);
	}

}
