package chapter06;

public class ArrayTest01 {

	public static void main(String[] args) {
		int [] arrInt;
		int arrInt2 [] = null;
		
		//System.out.println(arrInt); //에러: arrInt 지역변수는 JVM 초기화하지 않음, 직접 초기하 필수(빈 배열은 지역변수 내에서는 에러를 발생시킨다.)
		System.out.println(arrInt2);

	}

}
