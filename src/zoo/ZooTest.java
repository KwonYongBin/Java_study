package zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooTest {

	public static void main(String[] args) {
//		Lion lion = new Lion(); // 심바, 5
//		lion.sleep();
//		lion.eat();
//		
//		AnimalInterface lion2 = new Lion("무파사", 10);
//		lion2.sleep();
//		lion2.eat();
		
		List<Lion> list = new ArrayList<Lion>();
		List<AnimalInterface> list2 = new ArrayList<AnimalInterface>();// AnimalInterface를 상속받은 모든 것이 사용할 수 있다
		
		Lion lion1 = new Lion();
		Tiger tiger1 = new Tiger();
		list.add(lion1);
//		list.add(tiger1); //list는 Lion클래스 객체만 저장 가능
		
		list2.add(lion1);	//자동 묵시적 형변환을 통해 list2에 저장
		list2.add(tiger1);	//자동 묵시적 형변환을 통해 list2에 저장
		
		list.get(0).sleep();
		list2.get(0).sleep();
		list2.get(1).sleep();
		System.out.println(list2.get(0).getName());
		System.out.println(list2.get(1).getName());
		
		Lion lion2 = (Lion)list2.get(0);// 명시적 형변환 {객체의 저장된 속성(값)은 강제(명시적) 형변환을 통해 진행}
		System.out.println("lion2.name --> " + lion2.name);
		
	}

}
