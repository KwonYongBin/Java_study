package chapter05;

import java.util.Scanner;

public class MathEngTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int math = 0, eng = 0;

		System.out.println("수학>");
		math = input.nextInt();
		System.out.println("영어>");
		eng = input.nextInt();

		// 1. 중첩 if
		if( math >= 60) {
			if( eng >= 60) {				
				System.out.println("합격>");
			}
		} else {
			System.out.println("불합격>");			
		}
		
		// 2. 논리연산자 &&를 이용하여 if ~ eles
		if(math >= 60 && eng > 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");			
		}
	}

}
