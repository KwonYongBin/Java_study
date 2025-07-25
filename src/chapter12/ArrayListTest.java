package chapter12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("홍길동");//기본 값 
		list2.add(String.valueOf(123));//스트링 타입을 정수형으로 전환
		list2.set(0, "이순신");//임의의 값으로 업데이트
		list2.add(1, "김유신");//값을 추가함
		list2.remove(2);
		
		for(String str : list2) {
			System.out.println(str);
		}
		
		System.out.println(list.size()); // size()데이터가 채워진 공간수 만큼 출력된다.
		list.add(100);
		list.add(new String("홍길동"));
		list.add(123.456);
		list.add(new Scanner(System.in));
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		
		
	}

}
