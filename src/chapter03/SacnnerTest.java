package chapter03;

import java.util.Scanner;

public class SacnnerTest {

	public static void main(String[] args) {
		// Scanner 객체를 heap에 생성하고 scan변수에 할당 시킨다.
		Scanner scan = new Scanner(System.in);
		
		//scanner 객체를 담고있는 scan변수를 name 변수에 할당하고 값을 입력 받는다.
		System.out.print("이름 > ");
		String name = scan.next();
		
		//scanner 객체를 담고있는 scan변수를 name 변수에 할당하고 값을 입력 받는다.
		System.out.print("나이 > ");
		int age = scan.nextInt();
		
		//scanner 객체를 담고있는 scan변수를 name 변수에 할당하고 값을 입력 받는다.
		System.out.print("과목 > ");
		String subject = scan.next();
		
		//키보드로 입력받은 임의의 값을 출력 시킨다
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("과목 : " + subject);

	}

}
