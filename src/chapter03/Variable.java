package chapter03;

//import java.lang.String; - 자주사용하는 라이브러리는 패키지에 포함 되엉 있기 때문에 따로 import 하지 않아도 된다.

public class Variable {
	public static void main(String[] args) {
		// 기본 자료형 변수 정의
		int age = 10;
		double aged = 10.0;
		boolean flag = true; // true(1), false(0)
		//변수에서 문자는 싱글쿼테이션만을 사용한다.
		char name = '홍'; 
		char name2 = '길';
		char name3 = '동';
		String sname = "홍길동";
		
		// 참조 자료형 변수 정의
		// 참조형은 stack 공간에 먼저 저장이 되고 heap에서 주소가 생성이 되면
		String sname2 = new String("홍길동"); //(참조형 작성 방식)
		
		// ** String 클래스는 기본형과 참조형으로 모두 사용 가능!!
		String sname3 = "홍길동 입니다";
		
		// 출력
		System.out.println(age);
		System.out.println(aged);
		System.out.println(flag);
		System.out.print(name);
		System.out.print(name2);
		System.out.println(name3);
		System.out.println(sname);
		System.out.println(sname2);
		System.out.println(sname3);
		
	}
}