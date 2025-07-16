package chapter12;

public class MathTest {

	public static void main(String[] args) {
		//모든 메소드가 static으로 정의되어 있음 : 클래스명.메소드명()
		System.out.println(Math.abs(-100));//음수를 할당해도 양수 출력
		System.out.println(Math.floor(123.4567));//.이후 수를 절삭함
		System.out.println(Math.max(100, 200));//두 수를 비교하여 가장 큰 값을 출력
		System.out.println(Math.min(100, 200));//두 수를 비교하여 가장 작은 값을 출력
		System.out.println(Math.random());//0 ~ 1 사이에 있는 실수를 출력 (출력 시 마다 값은 다름)
		System.out.println((int)Math.floor(Math.random() * 100));// 정수 2자리 랜덤 호출
		System.out.println(Math.round(123.567));

	}

}
