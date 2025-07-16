package chapter12;

public class StringTest {

	public static void main(String[] args) {
		String name1 = "홍길동"; //stack에 생성
		String name2 = new String("홍길동"); //heap에 생성
		String num = String.valueOf(123);// 정수 타입을 문자 타입으로 전환
		name2 = "WelcomeToJava!!";
		
		String phone = "010-1234-5678";
		String subject = "java,css,html,mysql";
		String[] phones = phone.split("-");
		String[] subjects = subject.split(",");
		
		String jphone = String.join("-" , phones); //StringTokenizer 구 방식 join 신 방식
		
		System.out.println(subject.contains("html"));
		System.out.println(jphone);
		System.out.println(subjects[0]); // java
		System.out.println(phones[0]); //010
		System.out.println(name2.substring(7, 10));
		System.out.println(name2.substring(7));
		System.out.println(name2.length());//문자로 전부 쪼개고 몇개인지 숫자로 출력
		System.out.println(name2.toUpperCase());// 전부 대문자 변환
		System.out.println(name2.toLowerCase());// 전부 소문자 변환
		System.out.println(num);
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));//실제 주소값 출력
		
		if(name1 == name2)System.out.println("true");
		else System.out.println("false"); // 주소값을 비교한 것이기 때문에 false
		
		if(name1.equals(name2))System.out.println("true");
		else System.out.println("false"); // 값 자체를 비교한 것이기 때문에 true
	}

}
