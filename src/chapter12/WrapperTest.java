package chapter12;

public class WrapperTest {
	public static void main(String[] args) {
		int num1 = 100;
		Integer num2 = new Integer(num1); //취소선은 가지고 있는 생성자는 Deprecated 라고하며 향후 삭제(반드시)될 수 있다.
		Integer num3 = Integer.valueOf(num1); // 이렇게 사용하는 것은 권장함
		int num4 = Integer.parseInt("123"); //문자열로 작성된 숫자를 int타입으로 전환 시켜줌
		double dnum = Double.valueOf("123.60"); //역시 문자열로 작성된 실수를 double타입으로 전환 시켜줌
		
		
		
		
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(dnum);
	}

}
