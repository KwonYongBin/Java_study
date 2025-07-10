package chapter07;


import commons.Animal;
import java.util.Calendar;

public class AnimalAccessModifierTest {

	public static void main(String[] args) {
		//Calender 객체 생성
//		Calender c new =  Calender(); 상속관계가 없으므로 객체 생성 불가!!
		Calendar c = Calendar.getInstance(); // 생성된 객체의 인스턴스 주소를 가져옴 Singleton으로 만들어 진다.
		System.out.println(c.getTime());
		
		
		//1. static 변수, static 메소드 호출 메소드 호출 방법 1 - 클래스명.이름
		AnimalAccessModifier.sname = "스택틱";
		AnimalAccessModifier.sage = 10;
		AnimalAccessModifier.getInfo3();
		
		
		
		AnimalAccessModifier aam = new AnimalAccessModifier("호순이", 5);
		aam.sname = "스택틱2";
		aam.sage = 12;
		aam.getInfo3();
		
		//final 변수 테스트
//		aam.fname = "홍길순"; //final 키워드 벼수는 외부에서 값을 변경할 수 없다.
//		aam.fage = 5;
		
		//상수 호출
		int start = AnimalAccessModifier.START;
		int con = AnimalAccessModifier.CONTINUE;
		int end = AnimalAccessModifier.END;
		
		Animal comDog  = new Animal();
		comDog.setName("예삐");
		comDog.setAge(10);
		
//		comDog.name = "예삐"; 패키지가 다르므로 접근 불가 : default(package)
//		comDog.age = 3;		 패키지가 다르므로 접근 불가 : default(package)

		aam.name = "심바";
		aam.age = 5;
		
//		aam.pname = "호랑이"; 	//클래스가 다르므로 접근 불가
//		aam.page = 5;			//클래스가 다르므로 접근 불가
		
		System.out.println("name = " + aam.name);
		System.out.println("age = " + aam.age);
		
		System.out.println("name = " + aam.getPname());
		System.out.println("age = " + aam.getPage());
		
		System.out.println("name = " + comDog.getName());
		System.out.println("age = " + comDog.getAge());
	}

}
