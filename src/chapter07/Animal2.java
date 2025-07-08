package chapter07;

public class Animal2 {
		//Field : 전역변수 (JVM)
		String name; //(캡슐화)
		int age;	 //(캡슐화)
		
		
		//Constructor : 생성자는 오버로딩이 가능함!!
		public Animal2() { //기본생성자 
			
			System.out.println("객체를 생성한다");
		}
		public Animal2(String name) { //field의 name만 초기화 전역변수와 로컬변수 명이 같아도 스콥이 달라서 에러가 안나온다.
			// 선행 name는 전역변수 후행의 name는 로컬변수
			this.name = name;
			System.out.println("객체를 생성한다");
		}
		public Animal2(String name, int age) { //field의 name, age 초기화
			// 선행 name는 전역변수 후행의 name는 로컬변수 this는 전역변수를 뜻한다.
			this.name = name;
			this.age = age;
			System.out.println("객체를 생성한다");
		}
		
		//Method
		public void sleep() {
			System.out.println(name + "잠을 잔다.");
			
			//String dayt = "250703";
			//System.out.println(dayt + "잠을 잔다.");
		}
		
	}

