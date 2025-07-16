package chapter04;

/*
 * 논리연산자 : &&(AND),  ||(OR), !(NOT)
 * &&, || 연산자는 앞의 식의 결과에 따라 shortcut 으로 진행됨
 */

public class OpLogicTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// AND(&&) : 두 개의 항의 경과가 모두 true 인 경우에만 실행결과가 true
		System.out.println((a > b) && (a == 10)); //true
		System.out.println((a > b) && (b == 10)); //false
		System.out.println((a < b) && (a == 10)); //false S.C
		System.out.println((a < b) && (b == 10)); //false S.C
		
		// OR(||) : 두 개의 항의 경과중 하나라도 true 면 실행결과가 true
		System.out.println((a > b) || (a == 10)); //true S.C(ShortCut)
		System.out.println((a > b) || (b == 10)); //true S.C(ShortCut)
		System.out.println((a < b) || (a == 10)); //true
		System.out.println((a < b) || (b == 10)); //false

		//NOT(!) : 결과를 반대의 boolean 값으로 변경
		System.out.println(!(!(a > b) || !(a == 10))); //true
//		System.out.println(!a); a는 int 차입으로 NOT 연산자가 적용되지 않음
	}

}