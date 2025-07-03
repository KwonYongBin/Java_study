package chapter07;

public class Animal {
		//Field : 전역변수 (JVM)
		String name; //(캡슐화)
		int age;	 //(캡슐화)
		
		
		//Constructor:
		public Animal() { //기본생성자 
			
			//클래스와 이름이 같아야 한다.
			
			//생성자 호출시 실행되는 내용 => new Animal() 코드 실행 시 실행됨
			System.out.println("객체를 생성한다");
		}
		
		//Method
		public void sleep() {
			System.out.println(name + "잠을 잔다.");
			
			//String dayt = "250703";
			//System.out.println(dayt + "잠을 잔다.");
		}
		
	}

