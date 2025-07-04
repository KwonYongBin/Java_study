package chapter07;

/*
 * 두 개의 숫자를 입력받아 결과를 리턴하는 메소드를 포함
 * sub 메서드 기능은 첫 번째 숫자가 큰 경우에만, 빼기, 작은 경우에는 0을 리턴 
 */

public class Arithmetic {
	//Field
	//Constructor
	//Method
	public int add(double x, double y) {
		return (int)(x + y); //or (int)x + (int)y)
	}
	public int sub(int x, int y) {
		int result = 0;
		if(x > y) {
			result = x - y;
		}
		return result;
	}
	
	public double mul(double x, int y) {
		return x * y;
	}
//	public int mul(int x, int y) { 위 로직처럼 작성 하고 main에서 출력로 double로 출력
//		return x * y;
//	}
	public int div(int x, int y) {return x / y;}
	public int mod(int x, int y) {return x % y;}
	
}