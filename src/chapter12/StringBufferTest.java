package chapter12;

//StringBuffer 문자열을 저장하는 저장소 공간은 기본 16개
public class StringBufferTest {
	public static void main(String[] args) {
		String str = "홍길동";
		str = str + "은 자바를";
		str = str + "열심히 공부한다";
		System.out.println(str); //객체 3개 생성하여 문자열 완성
		
		StringBuffer sb = new StringBuffer(); //객체 하나에 문자열 완성
		sb.append("홍길동");
		sb.append("은 자바를");
		sb.append(" 열심히 공부한다. ");
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.toString());
	}
}
