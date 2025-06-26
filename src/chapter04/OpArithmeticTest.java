package chapter04;

/*
 * 사칙 연산자 : +, -, *, /, %
 */

public class OpArithmeticTest {

	public static void main(String[] args) {
		
		int number1 = 5;
		int number2 = 2;
		
		// 문자열로 사작을 하면 다음에 붙는 + 연산자는 접합연산자가 된다.
		// 그러므로 문자보다 먼저 값을 출력하려면 사칙연산자와 관련된 데이터를 괄호로 먼저 묶어준다.
		System.out.println("number1 + number2 = " + (number1 + number2));
		System.out.println("number1 - number2 = " + (number1 - number2));
		System.out.println("number1 * number2 = " + (number1 * number2));
		System.out.println("number1 / number2 = " + (number1 / number2));
		System.out.println("number1 % number2 = " + (number1 % number2));

	}

}
