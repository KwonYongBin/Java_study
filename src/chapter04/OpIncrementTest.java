package chapter04;

/*
 * 증감 연산자 : ++, --
 */

public class OpIncrementTest {
	public static void main (String[] args) {
		int number = 10;
	
		System.out.println(++number); //11
		System.out.println(number++); //11인 이유 변수부터 출력 그래서 값을 11로 프린트함 단 메모리에는 12가 저장되어 있음 결과 값은 아래.
		System.out.println(number); //12
		
		System.out.println(--number); //11
		System.out.println(number--); //11인 이유 변수부터 출력 그래서 값을 11로 프린트함 단 메모리에는 10이 저장되어 있음 결과 값은 아래.
		System.out.println(number); //10
		
	}
	
}
