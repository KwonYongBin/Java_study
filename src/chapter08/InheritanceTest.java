package chapter08;
//자식의 객체공간의 사용하고자하는 변수가 없다면 부모의 객체 공간의 변수를 사용 한다.
// p1에서 부모의 Client의 name 변수 사용??

public class InheritanceTest {

	public static void main(String[] args) {
//		Client c1 = new Client(); abstract 클래스임로 객체 생성 불가!!
		Person lee = new Person();
		Person kim = new Person("김유신", "종로구", "010 - 9876 - 9876", 12);
		Animal dog = new Animal("명수", 5 , lee);	
		Animal cat = new Animal("야옹이", 6 , kim);	
		
//		c1.printInfo();
		lee.printInfo();
		kim.printInfo();
		dog.printInfo();
		cat.printInfo();
		
		lee.register();
		dog.register();
		cat.register();
		
		dog.sound();
		cat.sound();
		
	}

}
