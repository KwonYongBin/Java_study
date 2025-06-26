package chapter05;

import java.util.Scanner;

public class IfOverlapTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean math_pass = false, eng_pass = false;

		System.out.println("수학>");
		math_pass = (input.nextInt() >= 60)? true : false;
		System.out.println("영어>");
		eng_pass = (input.nextInt() >= 60)? true : false;

		// 1. 중첩 if
		if(math_pass) {
			if(eng_pass) System.out.println("합격1");
		}
		else System.out.println("불합격1");

		// 2. 논리연산자 &&를 이용하여 if ~ eles
		if((math_pass) && (eng_pass)) System.out.println("합격2");
		else System.out.println("불합격2");
	}

}
