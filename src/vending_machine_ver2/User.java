package vending_machine_ver2;

import java.util.Scanner;

public class User {
	String name;
	Scanner scan;
	//이름, 입력을 위한 스캐너 객체
	
	public User() {
		scan = new Scanner(System.in);
	}
	
	//getter메소드 생성
	public String getName() {return name;}
	public Scanner getScan() {return scan;}
}
